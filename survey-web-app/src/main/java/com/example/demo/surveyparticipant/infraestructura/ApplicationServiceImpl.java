package com.example.demo.surveyparticipant.infraestructura;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;
import com.example.demo.survey.infraestructura.ISurveyDao;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.surveyparticipant.dominio.dtos.NewAnswerDto;

@Service
public class ApplicationServiceImpl implements IApplicationService {

	@Autowired
	private IApplicationDao applicationDao;

	@Autowired
	private ISurveyDao surveyDao;

	@Autowired
	private ISurveyParticipantService surveyParticipantService;

	@Override
	public Application save(Application application) {
		return applicationDao.save(application);
	}

	@Override
	public List<Application> findAll() {
		return applicationDao.findAll();
	}

	@Override
	public List<NewAnswerDto> aplicationToNewAnswerDto(List<Application> applications) {
		List<NewAnswerDto> newAnswerDto = applications.stream().map(temp -> {
			NewAnswerDto p = new NewAnswerDto(temp);
			return p;
		}).collect(Collectors.toList());
		return newAnswerDto;
	}

	@Override
	public boolean existsBySurveyparticipantUsuarioUsernameAndSurveyparticipantSurveySurveyName(String username,
			String surveyname) {
		return applicationDao.existsBySurveyparticipantUsuarioUsernameAndSurveyparticipantSurveySurveyName(username,
				surveyname);
	}

	public boolean userHasApplied(String username, String survey) {
		return applicationDao.existsBySurveyparticipantUsuarioUsernameAndSurveyparticipantSurveySurveyName(username,
				survey);
	}

	@Override
	public Boolean canUserAnswerSurvey(String username, String surveyname) {
		if (surveyDao.existsBySurveyparticipantsUsuarioUsernameAndSurveyName(username, surveyname)) {

			Survey survey = surveyDao.findBySurveyName(surveyname);
			if (!survey.surveyExpired() && survey.getSurveyActive()) {

				return (survey.getAllowMultipleApplications() | !userHasApplied(username, surveyname));

			}
		}

		return false;
	}

}
