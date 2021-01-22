package com.example.demo.survey.dominio;

// default package
// Generated 23 sep 2020 14:24:34 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.example.demo.category.domino.Category;
import com.example.demo.question.dominio.Question;
import com.example.demo.survey.dominio.dtos.SegmentationNewSurveyDto;
import com.example.demo.util.dominio.Views;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Segmentation generated by hbm2java
 */
@Entity
@Table(name = "segmentation", catalog = "encuesta")
public class Segmentation implements java.io.Serializable {

	private int segmentationId;

	private String segmentationName;

	private Survey survey;

	private Set<Segmentationitem> segmentationitems = new HashSet<Segmentationitem>(0);

	public Segmentation() {
	}

	public Segmentation(int segmentationId, String segmentationName, Survey survey,
			Set<Segmentationitem> segmentationitems) {
		super();
		this.segmentationId = segmentationId;
		this.segmentationName = segmentationName;
		this.survey = survey;
		this.segmentationitems = segmentationitems;
	}

	public Segmentation(int segmentationId, String segmentationName) {
		this.segmentationId = segmentationId;
		this.segmentationName = segmentationName;
	}

	public Segmentation(int segmentationId, String segmentationName, Set<Segmentationitem> segmentationitems) {
		this.segmentationId = segmentationId;
		this.segmentationName = segmentationName;
		this.segmentationitems = segmentationitems;
	}

	public Segmentation(SegmentationNewSurveyDto temp) {
		this.segmentationName = temp.getSegmentationName();
		this.segmentationitems=temp.getSegmentationitems().stream().map(tempp -> {
			Segmentationitem p = new Segmentationitem(tempp);
			return p;
		}).collect(Collectors.toSet());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "segmentationID", unique = true, nullable = false)
	public int getSegmentationId() {
		return this.segmentationId;
	}

	public void setSegmentationId(int segmentationId) {
		this.segmentationId = segmentationId;
	}

	@Column(name = "segmentationName", nullable = false, length = 45)
	public String getSegmentationName() {
		return this.segmentationName;
	}

	public void setSegmentationName(String segmentationName) {
		this.segmentationName = segmentationName;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "segmentation_segmentationID", nullable = false)
	public Set<Segmentationitem> getSegmentationitems() {
		return this.segmentationitems;
	}

	public void setSegmentationitems(Set<Segmentationitem> segmentationitems) {
		this.segmentationitems = segmentationitems;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "survey_SurveyID", insertable = false, updatable = false, nullable = false)
	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

}
