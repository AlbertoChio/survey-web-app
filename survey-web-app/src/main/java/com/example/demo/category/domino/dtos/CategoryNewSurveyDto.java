package com.example.demo.category.domino.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.validator.constraints.NotEmpty;

import com.example.demo.category.domino.Category;
import com.example.demo.question.dominio.dtos.QuestionNewSurveyDto;

public class CategoryNewSurveyDto {

	private Long categoryId;
	private String categoryName;

	@SuppressWarnings("deprecation")
	@NotEmpty(message = "la región no puede ser vacia")
	private Set<QuestionNewSurveyDto> questions = new HashSet<QuestionNewSurveyDto>(0);

	public CategoryNewSurveyDto() {
		super();
	}

	public CategoryNewSurveyDto(String categoryName, Set<QuestionNewSurveyDto> questions) {
		super();
		this.categoryName = categoryName;
		this.questions = questions;
	}

	public CategoryNewSurveyDto(Category temp) {
		super();
		
		categoryName=temp.getCategoryName();
		questions= temp.getQuestions().stream().map(tempp -> {
			QuestionNewSurveyDto questionNewSurveyDto = new QuestionNewSurveyDto(tempp);
			return questionNewSurveyDto;
	}).collect(Collectors.toSet());
	}
	

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<QuestionNewSurveyDto> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<QuestionNewSurveyDto> questions) {
		this.questions = questions;
	}

}
