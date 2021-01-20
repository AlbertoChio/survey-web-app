package com.example.demo.surveyparticipantanswer.dominio.dtos;

import com.example.demo.question.dominio.Question;
import com.example.demo.question.dominio.dtos.QuestionChartsDto;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipantanswer.dominio.ApplicationHasQuestion;
import com.example.demo.surveyparticipantanswer.dominio.ApplicationHasQuestionId;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class ApplicationHasQuestionChartsDto {

	private QuestionChartsDto question;

	private String applicationHasQuestionvalue;

	public ApplicationHasQuestionChartsDto(QuestionChartsDto question, String applicationHasQuestionvalue) {
		super();
		this.question = question;
		this.applicationHasQuestionvalue = applicationHasQuestionvalue;
	}

	public ApplicationHasQuestionChartsDto(ApplicationHasQuestion applicationHasQuestion) {
		super();
		this.question = new QuestionChartsDto(applicationHasQuestion.getQuestion());
		this.applicationHasQuestionvalue = applicationHasQuestion.getApplicationHasQuestionvalue();
	}

	public QuestionChartsDto getQuestion() {
		return question;
	}

	public void setQuestion(QuestionChartsDto question) {
		this.question = question;
	}

	public String getApplicationHasQuestionvalue() {
		return applicationHasQuestionvalue;
	}

	public void setApplicationHasQuestionvalue(String applicationHasQuestionvalue) {
		this.applicationHasQuestionvalue = applicationHasQuestionvalue;
	}

}
