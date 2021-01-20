package com.example.demo.survey.dominio.dtos;

public class SegmentationitemNewSurveyDto {

	private String segmentationitemName;

	public SegmentationitemNewSurveyDto() {
		super();
	}

	public SegmentationitemNewSurveyDto(String segmentationitemName) {
		super();
		this.segmentationitemName = segmentationitemName;
	}

	public String getSegmentationitemName() {
		return segmentationitemName;
	}

	public void setSegmentationitemName(String segmentationitemName) {
		this.segmentationitemName = segmentationitemName;
	}

}
