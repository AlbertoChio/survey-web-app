package com.example.demo.surveyparticipant.infraestructura;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Usuario.infraestructura.IUsuarioService;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.surveyparticipant.dominio.dtos.NewAnswerDto;
import com.example.demo.surveyparticipant.dominio.dtos.ParticipantSurveyListDto;
import com.example.demo.surveyparticipant.dominio.dtos.SurveyparticipantChartsDto;
import com.example.demo.survey.dominio.dtos.SurveyListDto;

@Service

public class SurveyParticipantServiceImpl implements ISurveyParticipantService {

	@Autowired
	private ISurveyParticipantDao surveyParticipantDao;

	@Override
	public List<Surveyparticipant> findAll() {
		return surveyParticipantDao.findAll();
	}

	@Override
	public Surveyparticipant save(Surveyparticipant surveyparticipant) {
		return surveyParticipantDao.save(surveyparticipant);
	}

	@Override
	public List<Surveyparticipant> findByUsuarioUsername(String username) {
		return surveyParticipantDao.findByUsuarioUsername(username);
	}

	@Override
	public List<ParticipantSurveyListDto> listParticipantSurveyListDto(List<Surveyparticipant> surveyparticipants) {
		List<ParticipantSurveyListDto> participantSurveyListDto = surveyparticipants.stream().map(temp -> {ParticipantSurveyListDto p = new ParticipantSurveyListDto(temp);	return p;}).collect(Collectors.toList());
		return participantSurveyListDto;
	}

	@Override
	public Surveyparticipant findByUsuarioUsernameAndSurveySurveyName(String username, String surveyname) {
		return surveyParticipantDao.findByUsuarioUsernameAndSurveySurveyName(username, surveyname);
	}

}