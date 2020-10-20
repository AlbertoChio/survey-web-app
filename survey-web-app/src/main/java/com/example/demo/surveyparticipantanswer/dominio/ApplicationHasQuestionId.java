package com.example.demo.surveyparticipantanswer.dominio;

// default package
// Generated 19 oct 2020 21:12:21 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonView;

/**
 * ApplicationHasQuestionId generated by hbm2java
 */
@Embeddable
public class ApplicationHasQuestionId implements java.io.Serializable {

	@JsonView(Views.User.class)
	private int questionQuestionId;
	@JsonView(Views.User.class)
	private int applicationIdapplication;

	public ApplicationHasQuestionId() {
	}

	public ApplicationHasQuestionId(int questionQuestionId, int applicationIdapplication) {
		this.questionQuestionId = questionQuestionId;
		this.applicationIdapplication = applicationIdapplication;
	}

	@Column(name = "question_QuestionID", nullable = false)
	public int getQuestionQuestionId() {
		return this.questionQuestionId;
	}

	public void setQuestionQuestionId(int questionQuestionId) {
		this.questionQuestionId = questionQuestionId;
	}

	@Column(name = "application_idapplication", nullable = false)
	public int getApplicationIdapplication() {
		return this.applicationIdapplication;
	}

	public void setApplicationIdapplication(int applicationIdapplication) {
		this.applicationIdapplication = applicationIdapplication;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ApplicationHasQuestionId))
			return false;
		ApplicationHasQuestionId castOther = (ApplicationHasQuestionId) other;

		return (this.getQuestionQuestionId() == castOther.getQuestionQuestionId())
				&& (this.getApplicationIdapplication() == castOther.getApplicationIdapplication());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getQuestionQuestionId();
		result = 37 * result + this.getApplicationIdapplication();
		return result;
	}

}
