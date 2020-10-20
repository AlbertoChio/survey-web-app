package com.example.demo.surveyparticipant.dominio.dtos;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.survey.dominio.Segmentationitem;
import com.example.demo.surveyparticipantanswer.dominio.ApplicationHasQuestion;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class NewAnswerDto {
	
	@JsonView(Views.User.class)
	private Set<Segmentationitem> segmentationitems = new HashSet<Segmentationitem>(0);
	@JsonView(Views.User.class)
	private Set<ApplicationHasQuestion> applicationHasQuestions = new HashSet<ApplicationHasQuestion>(0);
	
	
	public NewAnswerDto() {
		super();
	}

	public NewAnswerDto(Set<Segmentationitem> segmentationitems, Set<ApplicationHasQuestion> applicationHasQuestions) {
		super();
		this.segmentationitems = segmentationitems;
		this.applicationHasQuestions = applicationHasQuestions;
	}
	
	public Set<Segmentationitem> getSegmentationitems() {
		return segmentationitems;
	}
	public void setSegmentationitems(Set<Segmentationitem> segmentationitems) {
		this.segmentationitems = segmentationitems;
	}
	public Set<ApplicationHasQuestion> getApplicationHasQuestions() {
		return applicationHasQuestions;
	}
	public void setApplicationHasQuestions(Set<ApplicationHasQuestion> applicationHasQuestions) {
		this.applicationHasQuestions = applicationHasQuestions;
	}

	
}
