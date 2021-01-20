package com.example.demo.questiontype.dominio;

// default package
// Generated 15 sep 2020 12:52:23 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.question.dominio.Question;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Questiontype generated by hbm2java
 */
@Entity
@Table(name = "questiontype")
public class Questiontype implements java.io.Serializable {

	@JsonView(Views.User.class)
	private String questionTypeCode;
	@JsonView(Views.User.class)
	private Boolean questionTypeHasChoices;
	@JsonView(Views.User.class)
	private String questionTypeName;

	private Set<Question> questions = new HashSet<Question>(0);

	public Questiontype() {
	}

	public Questiontype(String questionTypeCode) {
		this.questionTypeCode = questionTypeCode;
	}

	public Questiontype(String questionTypeCode, Boolean questionTypeHasChoices, String questionTypeName,
			Set<Question> questions) {
		this.questionTypeCode = questionTypeCode;
		this.questionTypeHasChoices = questionTypeHasChoices;
		this.questionTypeName = questionTypeName;
		this.questions = questions;
	}

	@Id

	@Column(name = "QuestionTypeCode", unique = true, nullable = false, length = 5)
	public String getQuestionTypeCode() {
		return this.questionTypeCode;
	}

	public void setQuestionTypeCode(String questionTypeCode) {
		this.questionTypeCode = questionTypeCode;
	}

	@Column(name = "QuestionTypeHasChoices")
	public Boolean getQuestionTypeHasChoices() {
		return this.questionTypeHasChoices;
	}

	public void setQuestionTypeHasChoices(Boolean questionTypeHasChoices) {
		this.questionTypeHasChoices = questionTypeHasChoices;
	}

	@Column(name = "QuestionTypeName", length = 80)
	public String getQuestionTypeName() {
		return this.questionTypeName;
	}

	public void setQuestionTypeName(String questionTypeName) {
		this.questionTypeName = questionTypeName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questiontype")
	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

}
