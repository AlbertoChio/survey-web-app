package com.example.demo.category.domino.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.category.domino.Category;
import com.example.demo.question.dominio.Question;
import com.example.demo.question.dominio.dtos.QuestionChartsDto;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class CategoryChartsDto {

	private int categoryId;

	private String categoryName;

	private Set<QuestionChartsDto> questions = new HashSet<QuestionChartsDto>(0);

	public CategoryChartsDto(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.questions = questions;
	}

	public CategoryChartsDto(Category temp) {
		this.categoryId = temp.getCategoryId();
		this.categoryName = temp.getCategoryName();
		this.questions = temp.getQuestions().stream().map(tempp -> {
			QuestionChartsDto p = new QuestionChartsDto(tempp);
			return p;
		}).collect(Collectors.toSet());
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Set<QuestionChartsDto> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<QuestionChartsDto> questions) {
		this.questions = questions;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
