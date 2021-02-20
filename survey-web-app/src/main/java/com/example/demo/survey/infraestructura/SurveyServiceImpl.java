package com.example.demo.survey.infraestructura;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.Usuario.infraestructura.IUsuarioDao;
import com.example.demo.Usuario.infraestructura.IUsuarioService;
import com.example.demo.category.domino.Category;
import com.example.demo.survey.dominio.Segmentation;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyChartsDto;
import com.example.demo.survey.dominio.dtos.SurveyListDto;
import com.example.demo.survey.dominio.dtos.SurveyNewAnswerDto;
import com.example.demo.survey.dominio.dtos.SurveyNewSurveyDto;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.surveyparticipant.dominio.dtos.SurveyparticipantNewSurveyDto;
import com.example.demo.surveyparticipant.infraestructura.IApplicationDao;
import com.example.demo.surveyparticipantanswer.dominio.dtos.ApplicationHasQuestionChartsDto;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections4.CollectionUtils;

@Service

public class SurveyServiceImpl implements ISurveyService {

	private final static Logger LOGGER = Logger.getLogger(SurveyServiceImpl.class.getName());

	@Autowired
	private ISurveyDao surveyDao;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IUsuarioDao usuarioDao;

	@Autowired
	private IApplicationDao applicationDao;

	@Override
	public List<Survey> findAll() {

		return surveyDao.findAll();
	}

	@Override
	public Survey findBySurveyName(String surveyName) {
		return surveyDao.findBySurveyName(surveyName);
	}

	@Override
	public List<Survey> findBySurveyparticipantsUsuarioUsername(String username) {
		return surveyDao.findBySurveyparticipantsUsuarioUsername(username);
	}

	@Override
	public List<SurveyListDto> listSurveyListDto(List<Survey> surveys) {
		List<SurveyListDto> surveyListDto = surveys.stream().map(temp -> {
			SurveyListDto p = new SurveyListDto(temp);
			return p;
		}).collect(Collectors.toList());
		return surveyListDto;
	}

	@Override

	public Boolean canUserStartSurvey(String username, String surveyname) {
		if (surveyDao.existsBySurveyparticipantsUsuarioUsernameAndSurveyName(username, surveyname)) {
			Survey survey = surveyDao.findBySurveyName(surveyname);
			if (!survey.surveyExpired() && survey.getSurveyActive()) {
				return (survey.getAllowMultipleApplications() | !userHasApplied(username, surveyname));
			}
		}

		return false;
	}

	@Override
	public boolean existsBySurveyName(String nombre) {
		return surveyDao.existsBySurveyName(nombre);
	}

	@Override
	public boolean existsBySurveyparticipantsUsuarioUsernameAndSurveyName(String username, String survey) {
		return surveyDao.existsBySurveyparticipantsUsuarioUsernameAndSurveyName(username, survey);
	}

	public boolean userHasApplied(String username, String survey) {
		return applicationDao.existsBySurveyparticipantUsuarioUsernameAndSurveyparticipantSurveySurveyName(username,
				survey);
	}

	@Override
	public SurveyChartsDto SurveyToSurveyChartDto(Survey survey) {

		SurveyChartsDto surveyChartsDto = new SurveyChartsDto(survey);
		return surveyChartsDto;
	}

	@Override
	public SurveyNewAnswerDto SurveyToSurveyNewAnswerDto(Survey survey) {
		SurveyNewAnswerDto surveyNewAnswerDto = new SurveyNewAnswerDto(survey);
		return surveyNewAnswerDto;
	}

	@Override
	@Transactional
	public Survey NewSurveyRecord(SurveyNewSurveyDto surveyNewSurveyDto) {
		if (surveyNewSurveyDto.getSurveyparticipants() != null) {
			Set<SurveyparticipantNewSurveyDto> participantsholder = surveyNewSurveyDto.getSurveyparticipants();
			Set<Surveyparticipant> surveyparticipants = participantsholder.stream().map(temp -> {
				if (usuarioDao.existsByUsername(temp.getUsuario())) {
					Usuario usuario = usuarioDao.findByUsername(temp.getUsuario());
					Surveyparticipant surveyparticipant = new Surveyparticipant(usuario);
					return surveyparticipant;
				}
				return null;
			}).collect(Collectors.toSet());
			Survey survey = new Survey(surveyNewSurveyDto);
			survey.setSurveyparticipants(surveyparticipants);
			return surveyDao.save(survey);
		}
		Set<SurveyparticipantNewSurveyDto> participantsvoid = null;
		surveyNewSurveyDto.setSurveyparticipants(participantsvoid);
		Survey survey = new Survey(surveyNewSurveyDto);
		return surveyDao.save(survey);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	@Transactional
	public Survey UpdateSurveyRecord(SurveyNewSurveyDto surveyNewSurveyDto) {

		if (surveyDao.existsById(surveyNewSurveyDto.getSurveyId())) {

			Survey survey = surveyDao.findById(surveyNewSurveyDto.getSurveyId());
			Survey surveyholder = new Survey(surveyNewSurveyDto);
			survey.clear();

			survey.setSurveyName(surveyNewSurveyDto.getSurveyName());
			survey.setSurveyDescription(surveyNewSurveyDto.getSurveyDescription());
			survey.setSurveyStartDate(surveyNewSurveyDto.getSurveyStartDate());
			survey.setSurveyExpirationDate(surveyNewSurveyDto.getSurveyExpirationDate());
			survey.getCategories().addAll(surveyholder.getCategories());
			survey.getSegmentations().addAll(surveyholder.getSegmentations());
			// survey= emptyparticipantsSurveyRecord(survey);
			// survey.getSurveyparticipants().clear();
			if (surveyholder.getSurveyparticipants().size() < 1) {
				survey.getSurveyparticipants().clear();
			}

			// estos for deben sacar de survey todo participante que ya este registrado y no
			// se quiera insertar de nuevo
			Set<Surveyparticipant> surveyparticipants = new HashSet<Surveyparticipant>(0);
			System.out.println("\n filtrando \n");
			if (surveyholder.getSurveyparticipants().size() > 0 && survey.getSurveyparticipants().size() > 0) {
				for (Surveyparticipant surveyparticipant : survey.getSurveyparticipants()) {
					System.out.println("\n Primer for");
					boolean bandera = false;
					for (Surveyparticipant surveyparticipanth : surveyholder.getSurveyparticipants()) {
						System.out.println("\n Segundo for");
						if (surveyparticipanth.getUsuario().getUsuarioId() != surveyparticipant.getUsuario()
								.getUsuarioId()) {
							System.out.println("\n no son iguales, no se debe sacar \n");
							bandera = true;

						} else {
							System.out.println("\n son iguales no se debe sacar \n");
							bandera = false;
							break;
						}
					}
					if (bandera) {
						surveyparticipants.add(surveyparticipant);
						continue;
					}
				}
				if (surveyparticipants.size() > 0) {
					System.out.println("\n se va a sacar almenos uno \n");
					System.out.println(surveyparticipants.toString());
					survey.getSurveyparticipants().removeAll(surveyparticipants);
					System.out.println(survey.getSurveyparticipants().toString());

					surveyparticipants = new HashSet<Surveyparticipant>(0);
				}
			}

			// estos for deben sacar de surveyholder todo participante que ya este
			// registrado y se quiera insertar de nuevo
			if (surveyholder.getSurveyparticipants().size() > 0 && survey.getSurveyparticipants().size() > 0)
				for (Surveyparticipant surveyparticipanth : surveyholder.getSurveyparticipants()) {
					System.out.println("\n Primer for");
					for (Surveyparticipant surveyparticipant : survey.getSurveyparticipants()) {
						System.out.println("\n Segundo for");
						if (surveyparticipanth.getUsuario().getUsuarioId() == surveyparticipant.getUsuario()
								.getUsuarioId()) {
							surveyparticipants.add(surveyparticipanth);
						}
					}
				}

			surveyholder.getSurveyparticipants().removeAll(surveyparticipants);
			System.out.println(surveyholder.toString());

			surveyparticipants = new HashSet<Surveyparticipant>(0);

			if (surveyholder.getSurveyparticipants().size() > 0) {
				survey.getSurveyparticipants().addAll(surveyholder.getSurveyparticipants());
			}

			/*
			 * if(survey.getSurveyparticipants().size()>0) for (Surveyparticipant
			 * surveyparticipant : survey.getSurveyparticipants()) {
			 * System.out.println("\n que pedoooo \n"); boolean bandera= false; for
			 * (Surveyparticipant surveyparticipanth : surveyholder.getSurveyparticipants())
			 * { System.out.println("\n que pedoooo 2 \n"); if
			 * (surveyparticipanth.getUsuario().getUsuarioId() ==
			 * surveyparticipant.getUsuario().getUsuarioId()) {
			 * System.out.println("\n son iguales no se debe sacar \n"); bandera=false;
			 * break; } else { System.out.println("\n no son iguales no se debe sacar \n");
			 * bandera=true; } } if(bandera) {
			 * survey.getSurveyparticipants().remove(surveyparticipant); } }
			 */

			/*
			 * 
			 * if(surveyholder.getSurveyparticipants()!= null) {
			 * survey.getSurveyparticipants().addAll(surveyholder.getSurveyparticipants());
			 * }
			 */

			// survey.getSurveyparticipants().addAll(surveyholder.getSurveyparticipants());

			/*
			 * survey.getCategories().addAll(survey.getCategories());
			 * survey.getSegmentations().addAll(surveys.getSegmentations());
			 * survey.getSurveyparticipants().addAll(surveys.getSurveyparticipants());
			 */
			return survey;
		}
		return new Survey();
	}

	@Override
	@Transactional(readOnly = true)
	public SurveyNewSurveyDto NewSurveyRequest(String surveyname) {
		if (surveyDao.existsBySurveyName(surveyname)) {
			Survey survey = surveyDao.findBySurveyName(surveyname);
			SurveyNewSurveyDto surveyNewSurveyDto = new SurveyNewSurveyDto(survey);
			return surveyNewSurveyDto;
		}
		return new SurveyNewSurveyDto();
	}

	@Override
	public Survey save(Survey survey) {
		return surveyDao.save(survey);
	}

	private Survey convertToEntity(SurveyNewSurveyDto surveyNewSurveyDto) throws ParseException {
		Survey survey = modelMapper.map(surveyNewSurveyDto, Survey.class);
		return survey;
	}

	@Transactional
	public Survey emptyparticipantsSurveyRecord(Survey survey) {
		Set<Surveyparticipant> surveyparticipants = new HashSet<Surveyparticipant>(0);
		survey.getSurveyparticipants().addAll(surveyparticipants);
		return survey;
	}

}