package com.example.demo.surveyparticipant.dominio;

// default package
// Generated 12 oct 2020 16:29:23 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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

import com.example.demo.survey.dominio.Segmentationitem;
import com.example.demo.surveyparticipantanswer.dominio.ApplicationHasQuestion;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Application generated by hbm2java
 */
@Entity
@Table(name = "application", catalog = "encuesta")
public class Application implements java.io.Serializable {
	
	@JsonView(Views.User.class)
	private int idapplication;
	
	private Surveyparticipant surveyparticipant;
	@JsonView(Views.User.class)
	private Set<Segmentationitem> segmentationitems = new HashSet<Segmentationitem>(0);
	@JsonView(Views.User.class)
	private Set<ApplicationHasQuestion> applicationHasQuestions = new HashSet<ApplicationHasQuestion>(0);

	public Application() {
	}

	public Application(int idapplication, Surveyparticipant surveyparticipant) {
		this.idapplication = idapplication;
		this.surveyparticipant = surveyparticipant;
	}

	public Application(int idapplication, Surveyparticipant surveyparticipant, Set<Segmentationitem> segmentationitems,
			Set<ApplicationHasQuestion> applicationHasQuestions) {
		this.idapplication = idapplication;
		this.surveyparticipant = surveyparticipant;
		this.segmentationitems = segmentationitems;
		this.applicationHasQuestions = applicationHasQuestions;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idapplication", unique = true, nullable = false)
	public int getIdapplication() {
		return this.idapplication;
	}

	public void setIdapplication(int idapplication) {
		this.idapplication = idapplication;
	}
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "surveyparticipant_SurveyparticipantID", nullable = false)
	public Surveyparticipant getSurveyparticipant() {
		return this.surveyparticipant;
	}

	public void setSurveyparticipant(Surveyparticipant surveyparticipant) {
		this.surveyparticipant = surveyparticipant;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "application_has_segmentationitem", catalog = "encuesta", joinColumns = {
			@JoinColumn(name = "application_idapplication", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "segmentationitem_segmentationitemID", nullable = false, updatable = false) })
	public Set<Segmentationitem> getSegmentationitems() {
		return this.segmentationitems;
	}

	public void setSegmentationitems(Set<Segmentationitem> segmentationitems) {
		this.segmentationitems = segmentationitems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "application",cascade=CascadeType.ALL)
	public Set<ApplicationHasQuestion> getApplicationHasQuestions() {
		return this.applicationHasQuestions;
	}

	public void setApplicationHasQuestions(Set<ApplicationHasQuestion> applicationHasQuestions) {
		this.applicationHasQuestions = applicationHasQuestions;
	}

}
