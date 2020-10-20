package com.example.demo.surveyparticipant.dominio.dtos;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class ParticipantSurveyListDto {

	private Integer surveyparticipantId;
	private SurveyListDto survey;
	
	public ParticipantSurveyListDto(Integer surveyparticipantId, SurveyListDto survey) {
		super();
		this.surveyparticipantId = surveyparticipantId;
		this.survey = survey;
	}
	
	
	public ParticipantSurveyListDto() {
		super();
	}


	public Integer getSurveyparticipantId() {
		return surveyparticipantId;
	}
	public void setSurveyparticipantId(Integer surveyparticipantId) {
		this.surveyparticipantId = surveyparticipantId;
	}
	public SurveyListDto getSurvey() {
		return survey;
	}
	public void setSurvey(SurveyListDto survey) {
		this.survey = survey;
	}

	
}
