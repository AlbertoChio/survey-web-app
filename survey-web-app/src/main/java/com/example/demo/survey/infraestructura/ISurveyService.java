package com.example.demo.survey.infraestructura;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;

public interface ISurveyService {

	public List<Survey> findAll();

	public Survey findBySurveyName(String surveyName);

	public List<Survey> findBySurveyparticipantsUsuarioUsername (String username);
	
	public List<SurveyListDto> listSurveyListDto(List<Survey> surveys);
	
	public Boolean canUserStartSurvey(String survey, String username);
	
	public boolean existsBySurveyName(String nombre);
	
	public boolean existsBySurveyparticipantsUsuarioUsernameAndSurveyName(String username, String survey);
}
