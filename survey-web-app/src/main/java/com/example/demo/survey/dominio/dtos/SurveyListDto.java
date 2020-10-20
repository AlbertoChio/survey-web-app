package com.example.demo.survey.dominio.dtos;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class SurveyListDto {
	@JsonView(Views.User.class)
	private String surveyName;
	@JsonView(Views.User.class)
	private Date surveyPublicationDate;
	@JsonView(Views.User.class)
	private Boolean surveyActive;
	@JsonView(Views.User.class)
	private Date surveyStartDate;
	@JsonView(Views.User.class)
	private Date surveyExpirationDate;
	@JsonView(Views.User.class)
	private Boolean  surveyExpired;
	@JsonView(Views.User.class)
	private Date currentDate;
	
	public SurveyListDto() {
		super();
	}
	public SurveyListDto(String surveyName, Date surveyPublicationDate, Boolean surveyActive, Date surveyStartDate,
			Date surveyExpirationDate, Boolean surveyExpired,Date currentDate) {
		this.surveyName = surveyName;
		this.surveyPublicationDate = surveyPublicationDate;
		this.surveyActive = surveyActive;
		this.surveyStartDate = surveyStartDate;
		this.surveyExpirationDate = surveyExpirationDate;
		this.surveyExpired = surveyExpired;
		this.currentDate = currentDate;
	}
	public String getSurveyName() {
		return surveyName;
	}
	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}
	public Date getSurveyPublicationDate() {
		return surveyPublicationDate;
	}
	public void setSurveyPublicationDate(Date surveyPublicationDate) {
		this.surveyPublicationDate = surveyPublicationDate;
	}
	public Boolean getSurveyActive() {
		return surveyActive;
	}
	public void setSurveyActive(Boolean surveyActive) {
		this.surveyActive = surveyActive;
	}
	public Date getSurveyStartDate() {
		return surveyStartDate;
	}
	public void setSurveyStartDate(Date surveyStartDate) {
		this.surveyStartDate = surveyStartDate;
	}
	public Date getSurveyExpirationDate() {
		return surveyExpirationDate;
	}
	public void setSurveyExpirationDate(Date surveyExpirationDate) {
		this.surveyExpirationDate = surveyExpirationDate;
	}
	public Boolean getSurveyExpired() {
		return surveyExpired;
	}
	public void setSurveyExpired(Boolean surveyExpired) {
		this.surveyExpired = surveyExpired;
	}
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

}
