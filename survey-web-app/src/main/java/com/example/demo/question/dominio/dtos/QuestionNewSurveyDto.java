package com.example.demo.question.dominio.dtos;

import com.example.demo.questiontype.dominio.dtos.QuestiontypeNewSurveyDto;

public class QuestionNewSurveyDto {

	private String questionName;

	private QuestiontypeNewSurveyDto questiontype;

	public QuestionNewSurveyDto() {
		super();
	}

	public QuestionNewSurveyDto(String questionName) {
		super();
		this.questionName = questionName;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public QuestionNewSurveyDto(String questionName, QuestiontypeNewSurveyDto questiontype) {
		super();
		this.questionName = questionName;
		this.questiontype = questiontype;
	}

	public QuestiontypeNewSurveyDto getQuestiontype() {
		return questiontype;
	}

	public void setQuestiontype(QuestiontypeNewSurveyDto questiontype) {
		this.questiontype = questiontype;
	}

}
