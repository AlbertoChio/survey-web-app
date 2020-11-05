// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ApplicationHasQuestion generated by hbm2java
 */
@Entity
@Table(name = "application_has_question", catalog = "encuesta")
public class ApplicationHasQuestion implements java.io.Serializable {

	private ApplicationHasQuestionId id;
	private Application application;
	private Question question;
	private String applicationHasQuestionvalue;

	public ApplicationHasQuestion() {
	}

	public ApplicationHasQuestion(ApplicationHasQuestionId id, Application application, Question question) {
		this.id = id;
		this.application = application;
		this.question = question;
	}

	public ApplicationHasQuestion(ApplicationHasQuestionId id, Application application, Question question,
			String applicationHasQuestionvalue) {
		this.id = id;
		this.application = application;
		this.question = question;
		this.applicationHasQuestionvalue = applicationHasQuestionvalue;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "questionQuestionId", column = @Column(name = "question_QuestionID", nullable = false)),
			@AttributeOverride(name = "applicationIdapplication", column = @Column(name = "application_idapplication", nullable = false)) })
	public ApplicationHasQuestionId getId() {
		return this.id;
	}

	public void setId(ApplicationHasQuestionId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "application_idapplication", nullable = false, insertable = false, updatable = false)
	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_QuestionID", nullable = false, insertable = false, updatable = false)
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Column(name = "application_has_questionvalue", length = 45)
	public String getApplicationHasQuestionvalue() {
		return this.applicationHasQuestionvalue;
	}

	public void setApplicationHasQuestionvalue(String applicationHasQuestionvalue) {
		this.applicationHasQuestionvalue = applicationHasQuestionvalue;
	}

}
