package com.example.demo.surveyparticipantanswer.dominio.dtos;

import com.example.demo.question.dominio.Question;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipantanswer.dominio.ApplicationHasQuestion;
import com.example.demo.surveyparticipantanswer.dominio.ApplicationHasQuestionId;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class ApplicationHasQuestionChartsDto {

	private String applicationHasQuestionvalue;

	public ApplicationHasQuestionChartsDto(ApplicationHasQuestion temppp) {
		super();
		this.applicationHasQuestionvalue = temppp.getApplicationHasQuestionvalue();
	}

	public String getApplicationHasQuestionvalue() {
		return applicationHasQuestionvalue;
	}

	public void setApplicationHasQuestionvalue(String applicationHasQuestionvalue) {
		this.applicationHasQuestionvalue = applicationHasQuestionvalue;
	}

}
