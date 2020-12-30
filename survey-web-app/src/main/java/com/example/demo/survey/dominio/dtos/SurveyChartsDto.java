package com.example.demo.survey.dominio.dtos;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.category.domino.Category;
import com.example.demo.category.domino.dtos.CategoryChartsDto;
import com.example.demo.survey.dominio.Segmentation;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.surveyparticipant.dominio.dtos.SurveyparticipantChartsDto;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class SurveyChartsDto {

	private String surveyName;

	private boolean allowMultipleApplications;

	private Set<CategoryChartsDto> categories = new HashSet<CategoryChartsDto>(0);

	private Set<SegmentationChartsDto> segmentations = new HashSet<SegmentationChartsDto>(0);

	private Set<SurveyparticipantChartsDto> surveyparticipants = new HashSet<SurveyparticipantChartsDto>(0);

	public SurveyChartsDto(String surveyName, boolean allowMultipleApplications, Set<CategoryChartsDto> categories,
			Set<SegmentationChartsDto> segmentations, Set<SurveyparticipantChartsDto> surveyparticipants) {
		super();
		this.surveyName = surveyName;
		this.allowMultipleApplications = allowMultipleApplications;
		this.categories = categories;
		this.segmentations = segmentations;
		this.surveyparticipants = surveyparticipants;
	}

	public SurveyChartsDto(Survey survey) {
		super();
		this.surveyName = survey.getSurveyName();
		this.allowMultipleApplications = survey.getAllowMultipleApplications();
		this.categories = survey.getCategories().stream().map(temp -> {
			CategoryChartsDto p = new CategoryChartsDto(temp);
			return p;
		}).collect(Collectors.toSet());
		this.segmentations = survey.getSegmentations().stream().map(temp -> {
			SegmentationChartsDto p = new SegmentationChartsDto(temp);
			return p;
		}).collect(Collectors.toSet());
		this.surveyparticipants = survey.getSurveyparticipants().stream().map(temp -> {
			SurveyparticipantChartsDto p = new SurveyparticipantChartsDto(temp);
			return p;
		}).collect(Collectors.toSet());
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public boolean isAllowMultipleApplications() {
		return allowMultipleApplications;
	}

	public void setAllowMultipleApplications(boolean allowMultipleApplications) {
		this.allowMultipleApplications = allowMultipleApplications;
	}

	public Set<CategoryChartsDto> getCategories() {
		return categories;
	}

	public void setCategories(Set<CategoryChartsDto> categories) {
		this.categories = categories;
	}

	public Set<SegmentationChartsDto> getSegmentations() {
		return segmentations;
	}

	public void setSegmentations(Set<SegmentationChartsDto> segmentations) {
		this.segmentations = segmentations;
	}

	public Set<SurveyparticipantChartsDto> getSurveyparticipants() {
		return surveyparticipants;
	}

	public void setSurveyparticipants(Set<SurveyparticipantChartsDto> surveyparticipants) {
		this.surveyparticipants = surveyparticipants;
	}

}
