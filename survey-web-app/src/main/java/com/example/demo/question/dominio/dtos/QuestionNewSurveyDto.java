package com.example.demo.question.dominio.dtos;

import com.example.demo.question.dominio.Question;
import com.example.demo.questiontype.dominio.dtos.QuestiontypeNewSurveyDto;

public class QuestionNewSurveyDto {

	private int questionId;
	private String questionName;
	private QuestiontypeNewSurveyDto questiontype;

	public QuestionNewSurveyDto() {
		super();
		this.questiontype= new QuestiontypeNewSurveyDto();
	}

	public QuestionNewSurveyDto(String questionName) {
		super();
		this.questionName = questionName;
	}
	
	public QuestionNewSurveyDto(String questionName, QuestiontypeNewSurveyDto questiontype) {
		super();
		this.questionName = questionName;
		this.questiontype = questiontype;
	}

	public QuestionNewSurveyDto(Question tempp) {
		super();
		questionName=tempp.getQuestionName();
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public QuestiontypeNewSurveyDto getQuestiontype() {
		return questiontype;
	}

	public void setQuestiontype(QuestiontypeNewSurveyDto questiontype) {
		this.questiontype = questiontype;
	}

}
