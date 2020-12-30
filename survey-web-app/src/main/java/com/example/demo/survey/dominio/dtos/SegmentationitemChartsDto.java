package com.example.demo.survey.dominio.dtos;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.survey.dominio.Segmentation;
import com.example.demo.survey.dominio.Segmentationitem;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class SegmentationitemChartsDto {

	private int segmentationitemId;

	private String segmentationitemName;

	public SegmentationitemChartsDto(int segmentationitemId, String segmentationitemName) {
		super();
		this.segmentationitemId = segmentationitemId;
		this.segmentationitemName = segmentationitemName;
	}

	public SegmentationitemChartsDto(Segmentationitem tempp) {
		this.segmentationitemId = tempp.getSegmentationitemId();
		this.segmentationitemName = tempp.getSegmentationitemName();
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
