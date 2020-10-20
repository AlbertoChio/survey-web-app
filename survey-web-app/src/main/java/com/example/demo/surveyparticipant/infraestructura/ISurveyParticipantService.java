package com.example.demo.surveyparticipant.infraestructura;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.surveyparticipant.dominio.dtos.NewAnswerDto;
import com.example.demo.surveyparticipant.dominio.dtos.ParticipantSurveyListDto;

public interface ISurveyParticipantService {

	public List<Surveyparticipant> findAll();
	public Surveyparticipant save(Surveyparticipant surveyparticipant);
	public List<Surveyparticipant> findByUsuarioUsername(String username);
	public List<ParticipantSurveyListDto> listParticipantSurveyListDto(List<Surveyparticipant> surveyparticipants);
	public Surveyparticipant findByUsuarioUsernameAndSurveySurveyName(String username,String surveyname);

}
