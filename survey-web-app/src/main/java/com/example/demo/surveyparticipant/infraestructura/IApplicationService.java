package com.example.demo.surveyparticipant.infraestructura;

import java.util.List;

import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.surveyparticipant.dominio.dtos.NewAnswerDto;

public interface IApplicationService {
	public Application save(Application application);
	public List<Application> findAll();
	public List<NewAnswerDto> aplicationToNewAnswerDto(List<Application> applications);
}
