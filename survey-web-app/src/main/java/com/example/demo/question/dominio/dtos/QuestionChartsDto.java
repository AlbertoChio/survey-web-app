package com.example.demo.question.dominio.dtos;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.category.domino.Category;
import com.example.demo.choice.dominio.Choice;
import com.example.demo.question.dominio.Question;
import com.example.demo.questiontype.dominio.Questiontype;
import com.example.demo.surveyparticipantanswer.dominio.ApplicationHasQuestion;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class QuestionChartsDto {

	private int questionId;

	private String questionName;

	public QuestionChartsDto(int questionId, String questionName) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
	}

	public QuestionChartsDto(Question temp) {
		this.questionId = temp.getQuestionId();
		this.questionName = temp.getQuestionName();

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

}
