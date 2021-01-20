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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Surveyparticipant generated by hbm2java
 */
@Entity
@Table(name = "surveyparticipant", catalog = "encuesta", uniqueConstraints = @UniqueConstraint(columnNames = {
		"Usuario_UsuarioID", "survey_SurveyID" }))
public class Surveyparticipant implements java.io.Serializable {

	private Integer surveyparticipantId;
	private Survey survey;
	private Usuario usuario;
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
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "SurveyparticipantID", unique = true, nullable = false)
	public Integer getSurveyparticipantId() {
		return this.surveyparticipantId;
	}

	public void setSurveyparticipantId(Integer surveyparticipantId) {
		this.surveyparticipantId = surveyparticipantId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "survey_SurveyID", nullable = false)
	public Survey getSurvey() {
		return this.survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Usuario_UsuarioID")
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
