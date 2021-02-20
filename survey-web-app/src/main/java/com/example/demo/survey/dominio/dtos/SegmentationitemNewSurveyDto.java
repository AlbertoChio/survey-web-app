package com.example.demo.survey.dominio.dtos;

import com.example.demo.survey.dominio.Segmentationitem;

public class SegmentationitemNewSurveyDto {

	private int segmentationitemId;
	
	private String segmentationitemName;

	public SegmentationitemNewSurveyDto() {
		super();
	}

	public SegmentationitemNewSurveyDto(String segmentationitemName) {
		super();
		this.segmentationitemName = segmentationitemName;
	}

	public SegmentationitemNewSurveyDto(Segmentationitem tempp) {
		super();
		segmentationitemName=tempp.getSegmentationitemName();
	}

	public int getSegmentationitemId() {
		return segmentationitemId;
	}

	public void setSegmentationitemId(int segmentationitemId) {
		this.segmentationitemId = segmentationitemId;
	}

	public String getSegmentationitemName() {
		return segmentationitemName;
	}

	public void setSegmentationitemName(String segmentationitemName) {
		this.segmentationitemName = segmentationitemName;
	}

}
