package com.example.demo.survey.dominio.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.category.domino.dtos.CategoryChartsDto;
import com.example.demo.survey.dominio.Survey;

public class SurveyNewAnswerDto {

	private String surveyName;

	private Set<CategoryChartsDto> categories = new HashSet<CategoryChartsDto>(0);

	private Set<SegmentationChartsDto> segmentations = new HashSet<SegmentationChartsDto>(0);

	public SurveyNewAnswerDto(String surveyName, boolean allowMultipleApplications, Set<CategoryChartsDto> categories,
			Set<SegmentationChartsDto> segmentations) {
		super();
		this.surveyName = surveyName;
		this.categories = categories;
		this.segmentations = segmentations;
	}

	public SurveyNewAnswerDto(Survey survey) {
		super();
		this.surveyName = survey.getSurveyName();
		this.categories = survey.getCategories().stream().map(temp -> {
			CategoryChartsDto p = new CategoryChartsDto(temp);
			return p;
		}).collect(Collectors.toSet());
		this.segmentations = survey.getSegmentations().stream().map(temp -> {
			SegmentationChartsDto p = new SegmentationChartsDto(temp);
			return p;
		}).collect(Collectors.toSet());
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
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

}
