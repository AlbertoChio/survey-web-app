package com.example.demo.surveyparticipant.dominio.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.survey.dominio.Segmentationitem;
import com.example.demo.survey.dominio.dtos.SegmentationitemChartsDto;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.surveyparticipantanswer.dominio.ApplicationHasQuestion;
import com.example.demo.surveyparticipantanswer.dominio.dtos.ApplicationHasQuestionChartsDto;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class ApplicationChartsDto {

	private int idapplication;

	private Set<SegmentationitemChartsDto> segmentationitems = new HashSet<SegmentationitemChartsDto>(0);

	private Set<ApplicationHasQuestionChartsDto> applicationHasQuestions = new HashSet<ApplicationHasQuestionChartsDto>(
			0);

	public ApplicationChartsDto(int idapplication, Set<SegmentationitemChartsDto> segmentationitems,
			Set<ApplicationHasQuestionChartsDto> applicationHasQuestions) {
		super();
		this.idapplication = idapplication;
		this.segmentationitems = segmentationitems;
		this.applicationHasQuestions = applicationHasQuestions;
	}

	public ApplicationChartsDto(Application tempp) {
		this.idapplication = tempp.getIdapplication();
		this.segmentationitems = tempp.getSegmentationitems().stream().map(temppp -> {
			SegmentationitemChartsDto p = new SegmentationitemChartsDto(temppp);
			return p;
		}).collect(Collectors.toSet());
		this.applicationHasQuestions = tempp.getApplicationHasQuestions().stream().map(temppp -> {
			ApplicationHasQuestionChartsDto p = new ApplicationHasQuestionChartsDto(temppp);
			return p;
		}).collect(Collectors.toSet());
	}

	public int getIdapplication() {
		return idapplication;
	}

	public void setIdapplication(int idapplication) {
		this.idapplication = idapplication;
	}

	public Set<ApplicationHasQuestionChartsDto> getApplicationHasQuestions() {
		return applicationHasQuestions;
	}

	public void setApplicationHasQuestions(Set<ApplicationHasQuestionChartsDto> applicationHasQuestions) {
		this.applicationHasQuestions = applicationHasQuestions;
	}

	public Set<SegmentationitemChartsDto> getSegmentationitems() {
		return segmentationitems;
	}

	public void setSegmentationitems(Set<SegmentationitemChartsDto> segmentationitems) {
		this.segmentationitems = segmentationitems;
	}

}
