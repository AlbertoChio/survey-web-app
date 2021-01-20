package com.example.demo.surveyparticipant.dominio;

// default package
// Generated 15 sep 2020 12:52:23 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.survey.dominio.Segmentationitem;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Surveyparticipant generated by hbm2java
 */
@Entity
@Table(name = "surveyparticipant", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "Usuario_UsuarioID", "survey_SurveyID" }) })
public class Surveyparticipant implements java.io.Serializable {

	@JsonView(Views.Admin.class)
	private Integer surveyparticipantId;
	@JsonView(Views.User.class)
	private Survey survey;

	private Usuario usuario;
	@JsonView(Views.Admin.class)
	private Set<Application> applications = new HashSet<Application>(0);

	public Surveyparticipant() {
	}

	public Surveyparticipant(Survey survey) {
		this.survey = survey;
	}

	public Surveyparticipant(Survey survey, Usuario usuario, Set<Application> applications) {
		this.survey = survey;
		this.usuario = usuario;
		this.applications = applications;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SurveyparticipantID", unique = true, nullable = false)
	public Integer getSurveyparticipantId() {
		return this.surveyparticipantId;
	}

	public void setSurveyparticipantId(int surveyparticipantId) {
		this.surveyparticipantId = surveyparticipantId;
	}

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "survey_SurveyID", nullable = false)
	public Survey getSurvey() {
		return this.survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Usuario_UsuarioID", nullable = true)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "surveyparticipant")
	public Set<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}

}
