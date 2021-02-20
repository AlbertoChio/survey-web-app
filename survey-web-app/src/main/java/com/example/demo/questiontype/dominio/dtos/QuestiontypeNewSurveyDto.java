package com.example.demo.questiontype.dominio.dtos;

public class QuestiontypeNewSurveyDto {

	private String questionTypeCode;

	public QuestiontypeNewSurveyDto() {
		super();
		this.questionTypeCode="rank";
	}

	public QuestiontypeNewSurveyDto(String questionTypeCode) {
		super();
		this.questionTypeCode = questionTypeCode;
	}

	public String getQuestionTypeCode() {
		return questionTypeCode;
	}

	public void setQuestionTypeCode(String questionTypeCode) {
		this.questionTypeCode = questionTypeCode;
	}

}
