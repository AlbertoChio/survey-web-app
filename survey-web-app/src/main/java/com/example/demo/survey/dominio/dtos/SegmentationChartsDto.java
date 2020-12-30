package com.example.demo.survey.dominio.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.survey.dominio.Segmentation;
import com.example.demo.survey.dominio.Segmentationitem;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class SegmentationChartsDto {

	private int segmentationId;

	private String segmentationName;

	private Set<SegmentationitemChartsDto> segmentationitems = new HashSet<SegmentationitemChartsDto>(0);

	public SegmentationChartsDto(int segmentationId, String segmentationName,
			Set<SegmentationitemChartsDto> segmentationitems) {
		super();
		this.segmentationId = segmentationId;
		this.segmentationName = segmentationName;
		this.segmentationitems = segmentationitems;
	}

	public SegmentationChartsDto(Segmentation temp) {
		this.segmentationId = temp.getSegmentationId();
		this.segmentationName = temp.getSegmentationName();
		this.segmentationitems = temp.getSegmentationitems().stream().map(tempp -> {
			SegmentationitemChartsDto p = new SegmentationitemChartsDto(tempp);
			return p;
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

	public Set<SegmentationitemChartsDto> getSegmentationitems() {
		return segmentationitems;
	}

	public void setSegmentationitems(Set<SegmentationitemChartsDto> segmentationitems) {
		this.segmentationitems = segmentationitems;
	}

}
