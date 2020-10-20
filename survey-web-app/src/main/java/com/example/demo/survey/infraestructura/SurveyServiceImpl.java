package com.example.demo.survey.infraestructura;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.demo.Usuario.infraestructura.IUsuarioService;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;

@Service

public class SurveyServiceImpl implements ISurveyService {
	
	@Autowired
	private ISurveyDao surveyDao;

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
        	SurveyListDto p = new SurveyListDto(temp.getSurveyName(),temp.getSurveyPublicationDate(),temp.getSurveyActive(),temp.getSurveyStartDate(),temp.getSurveyExpirationDate(),temp.surveyExpired(),temp.currenDate());
      return p;
        }).collect(Collectors.toList());
                
		return surveyListDto;
	}
	
	@Override
	public Boolean canUserStartSurvey(String username, String surveyname) {
		if(surveyDao.existsBySurveyparticipantsUsuarioUsernameAndSurveyName(username, surveyname)) {
			Survey survey = surveyDao.findBySurveyName(surveyname);
			if(!survey.surveyExpired()&&survey.getSurveyActive()) {
				return true;
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



}