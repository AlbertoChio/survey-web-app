package com.example.demo.survey.dominio.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.question.dominio.dtos.QuestionNewSurveyDto;
import com.example.demo.survey.dominio.Segmentation;

public class SegmentationNewSurveyDto {
	
	private int segmentationId;

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

	public SegmentationNewSurveyDto(Segmentation temp) {
		super();
		
		segmentationName=temp.getSegmentationName();
		segmentationitems=temp.getSegmentationitems().stream().map(tempp -> {
			SegmentationitemNewSurveyDto segmentationitemNewSurveyDto = new SegmentationitemNewSurveyDto(tempp);
			return segmentationitemNewSurveyDto;
	}).collect(Collectors.toSet());
	}

	public int getSegmentationId() {
		return segmentationId;
	}

	public void setSegmentationId(int segmentationId) {
		this.segmentationId = segmentationId;
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
