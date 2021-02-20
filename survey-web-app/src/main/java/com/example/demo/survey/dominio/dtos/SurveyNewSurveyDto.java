package com.example.demo.survey.dominio.dtos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.category.domino.dtos.CategoryNewSurveyDto;
import com.example.demo.question.dominio.dtos.QuestionNewSurveyDto;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.surveyparticipant.dominio.dtos.SurveyparticipantNewSurveyDto;

public class SurveyNewSurveyDto {
	
	private int surveyId;
	@NotBlank
	private String surveyName;

	private String surveyDescription;

	private Date surveyStartDate;

	private Date surveyExpirationDate;

	private Set<CategoryNewSurveyDto> categories = new HashSet<CategoryNewSurveyDto>(0);

	private Set<SegmentationNewSurveyDto> segmentations = new HashSet<SegmentationNewSurveyDto>(0);

	private Set<SurveyparticipantNewSurveyDto> surveyparticipants = new HashSet<SurveyparticipantNewSurveyDto>(0);

	public SurveyNewSurveyDto() {
		super();
	}

	public SurveyNewSurveyDto(String surveyName, String surveyDescription, Date surveyStartDate,
			Date surveyExpirationDate, Set<CategoryNewSurveyDto> categoryNewSurveyDto,
			Set<SurveyparticipantNewSurveyDto> surveyparticipants,
			Set<SegmentationNewSurveyDto> segmentationNewSurveyDto) {
		super();
		this.surveyName = surveyName;
		this.surveyDescription = surveyDescription;
		this.surveyStartDate = surveyStartDate;
		this.surveyExpirationDate = surveyExpirationDate;
		this.categories = categoryNewSurveyDto;
		this.surveyparticipants = surveyparticipants;
		this.segmentations = segmentationNewSurveyDto;
	}

	public SurveyNewSurveyDto(Survey survey) {
		super();
		surveyId=survey.getSurveyId();
		surveyName=survey.getSurveyName();
		surveyDescription=survey.getSurveyDescription();
		surveyStartDate=survey.getSurveyStartDate();
		surveyExpirationDate=survey.getSurveyExpirationDate();
		categories= survey.getCategories().stream().map(temp -> {
			CategoryNewSurveyDto categoryNewSurveyDto = new CategoryNewSurveyDto(temp);
				return categoryNewSurveyDto;
		}).collect(Collectors.toSet());
		segmentations=survey.getSegmentations().stream().map(temp -> {
			SegmentationNewSurveyDto segmentationNewSurveyDto = new SegmentationNewSurveyDto(temp);
			return segmentationNewSurveyDto;
	}).collect(Collectors.toSet());
		surveyparticipants=survey.getSurveyparticipants().stream().map(temp -> {
			SurveyparticipantNewSurveyDto surveyparticipantNewSurveyDto = new SurveyparticipantNewSurveyDto(temp);
			return surveyparticipantNewSurveyDto;
	}).collect(Collectors.toSet());
	}
	
	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getSurveyDescription() {
		return surveyDescription;
	}

	public void setSurveyDescription(String surveyDescription) {
		this.surveyDescription = surveyDescription;
	}

	public Set<CategoryNewSurveyDto> getCategories() {
		return categories;
	}

	public void setCategories(Set<CategoryNewSurveyDto> categories) {
		this.categories = categories;
	}

	public Set<SegmentationNewSurveyDto> getSegmentations() {
		return segmentations;
	}

	public void setSegmentations(Set<SegmentationNewSurveyDto> segmentations) {
		this.segmentations = segmentations;
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

	public Set<SurveyparticipantNewSurveyDto> getSurveyparticipants() {
		return surveyparticipants;
	}

	public void setSurveyparticipants(Set<SurveyparticipantNewSurveyDto> surveyparticipants) {
		this.surveyparticipants = surveyparticipants;
	}
	
	

}
