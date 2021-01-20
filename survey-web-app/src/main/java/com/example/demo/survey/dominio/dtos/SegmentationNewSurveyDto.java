package com.example.demo.survey.dominio.dtos;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.question.dominio.dtos.QuestionNewSurveyDto;

public class SegmentationNewSurveyDto {

	private String segmentationName;

	private Set<SegmentationitemNewSurveyDto> segmentationitems = new HashSet<SegmentationitemNewSurveyDto>(0);

	public SegmentationNewSurveyDto() {
		super();
	}

	public SegmentationNewSurveyDto(String segmentationName, Set<SegmentationitemNewSurveyDto> segmentationitems) {
		super();
		this.segmentationName = segmentationName;
		this.segmentationitems = segmentationitems;
	}

	public String getSegmentationName() {
		return segmentationName;
	}

	public void setSegmentationName(String segmentationName) {
		this.segmentationName = segmentationName;
	}

	public Set<SegmentationitemNewSurveyDto> getSegmentationitems() {
		return segmentationitems;
	}

	public void setSegmentationitems(Set<SegmentationitemNewSurveyDto> segmentationitems) {
		this.segmentationitems = segmentationitems;
	}

}
