package com.example.demo.surveyparticipant.dominio.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class SurveyparticipantChartsDto {

	private Integer surveyparticipantId;

	private Set<ApplicationChartsDto> applications = new HashSet<ApplicationChartsDto>(0);

	public SurveyparticipantChartsDto(Integer surveyparticipantId, Set<ApplicationChartsDto> applications) {
		super();
		this.surveyparticipantId = surveyparticipantId;
		this.applications = applications;
	}

	public SurveyparticipantChartsDto(Surveyparticipant temp) {
		super();
		this.surveyparticipantId = temp.getSurveyparticipantId();
		this.applications = temp.getApplications().stream().map(tempp -> {
			ApplicationChartsDto p = new ApplicationChartsDto(tempp);
			return p;
		}).collect(Collectors.toSet());
	}

	public Integer getSurveyparticipantId() {
		return surveyparticipantId;
	}

	public void setSurveyparticipantId(Integer surveyparticipantId) {
		this.surveyparticipantId = surveyparticipantId;
	}

	public Set<ApplicationChartsDto> getApplications() {
		return applications;
	}

	public void setApplications(Set<ApplicationChartsDto> applications) {
		this.applications = applications;
	}

}
