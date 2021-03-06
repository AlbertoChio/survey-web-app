// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Application generated by hbm2java
 */
@Entity
@Table(name = "application", catalog = "encuesta")
public class Application implements java.io.Serializable {

	private Integer idapplication;
	private Surveyparticipant surveyparticipant;
	private Set<ApplicationHasQuestion> applicationHasQuestions = new HashSet<ApplicationHasQuestion>(0);
	private Set<Segmentationitem> segmentationitems = new HashSet<Segmentationitem>(0);

	public Application() {
	}

	public Application(Surveyparticipant surveyparticipant) {
		this.surveyparticipant = surveyparticipant;
	}

	public Application(Surveyparticipant surveyparticipant, Set<ApplicationHasQuestion> applicationHasQuestions,
			Set<Segmentationitem> segmentationitems) {
		this.surveyparticipant = surveyparticipant;
		this.applicationHasQuestions = applicationHasQuestions;
		this.segmentationitems = segmentationitems;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idapplication", unique = true, nullable = false)
	public Integer getIdapplication() {
		return this.idapplication;
	}

	public void setIdapplication(Integer idapplication) {
		this.idapplication = idapplication;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "surveyparticipant_SurveyparticipantID", nullable = false)
	public Surveyparticipant getSurveyparticipant() {
		return this.surveyparticipant;
	}

	public void setSurveyparticipant(Surveyparticipant surveyparticipant) {
		this.surveyparticipant = surveyparticipant;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "application")
	public Set<ApplicationHasQuestion> getApplicationHasQuestions() {
		return this.applicationHasQuestions;
	}

	public void setApplicationHasQuestions(Set<ApplicationHasQuestion> applicationHasQuestions) {
		this.applicationHasQuestions = applicationHasQuestions;
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

}
