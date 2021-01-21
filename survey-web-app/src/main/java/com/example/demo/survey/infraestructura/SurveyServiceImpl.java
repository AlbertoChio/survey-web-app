package com.example.demo.survey.infraestructura;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

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

@Service

public class SurveyServiceImpl implements ISurveyService {

	private final static Logger LOGGER = Logger.getLogger(SurveyServiceImpl.class.getName());

	@Autowired
	private ISurveyDao surveyDao;
	
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
		Set<SurveyparticipantNewSurveyDto> participantsholder=surveyNewSurveyDto.getSurveyparticipants();
		Set<SurveyparticipantNewSurveyDto> participantsvoid = null;
		surveyNewSurveyDto.setSurveyparticipants(participantsvoid);
		Survey survey = new Survey(surveyNewSurveyDto);
		survey=surveyDao.save(survey);
		
		Set<Surveyparticipant> surveyparticipants= participantsholder.stream().map( temp ->{
			if(usuarioDao.existsByUsername(temp.getUsuario()))
			{
				Usuario usuario= usuarioDao.findByUsername(temp.getUsuario());
				Surveyparticipant surveyparticipant= new Surveyparticipant(usuario);
				return surveyparticipant;
			}
			return null;
		}).collect(Collectors.toSet());
		survey.setSurveyparticipants(surveyparticipants);
	
		return survey;
	}

	@Override
	public Survey save(Survey survey) {
		return surveyDao.save(survey);
	}

}