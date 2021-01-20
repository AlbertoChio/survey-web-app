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

/**
 * Question generated by hbm2java
 */
@Entity
@Table(name = "question", catalog = "encuesta")
public class Question implements java.io.Serializable {

	private Integer questionId;
	private Category category;
	private Questiontype questiontype;
	private Boolean questionAnswerRequired;
	private String questionName;
	private Integer questionNumber;
	private String questionText;
	private Set<Choice> choices = new HashSet<Choice>(0);
	private Set<ApplicationHasQuestion> applicationHasQuestions = new HashSet<ApplicationHasQuestion>(0);

	public Question() {
	}

	public Question(Category category, Questiontype questiontype) {
		this.category = category;
		this.questiontype = questiontype;
	}

	public Question(Category category, Questiontype questiontype, Boolean questionAnswerRequired, String questionName,
			Integer questionNumber, String questionText, Set<Choice> choices,
			Set<ApplicationHasQuestion> applicationHasQuestions) {
		this.category = category;
		this.questiontype = questiontype;
		this.questionAnswerRequired = questionAnswerRequired;
		this.questionName = questionName;
		this.questionNumber = questionNumber;
		this.questionText = questionText;
		this.choices = choices;
		this.applicationHasQuestions = applicationHasQuestions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "QuestionID", unique = true, nullable = false)
	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_CategoryID", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questiontype_QuestionTypeCode", nullable = false)
	public Questiontype getQuestiontype() {
		return this.questiontype;
	}

	public void setQuestiontype(Questiontype questiontype) {
		this.questiontype = questiontype;
	}

	@Column(name = "QuestionAnswerRequired")
	public Boolean getQuestionAnswerRequired() {
		return this.questionAnswerRequired;
	}

	public void setQuestionAnswerRequired(Boolean questionAnswerRequired) {
		this.questionAnswerRequired = questionAnswerRequired;
	}

	@Column(name = "QuestionName", length = 80)
	public String getQuestionName() {
		return this.questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	@Column(name = "QuestionNumber")
	public Integer getQuestionNumber() {
		return this.questionNumber;
	}

	public void setQuestionNumber(Integer questionNumber) {
		this.questionNumber = questionNumber;
	}

	@Column(name = "QuestionText")
	public String getQuestionText() {
		return this.questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Choice> getChoices() {
		return this.choices;
	}

	public void setChoices(Set<Choice> choices) {
		this.choices = choices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<ApplicationHasQuestion> getApplicationHasQuestions() {
		return this.applicationHasQuestions;
	}

	public void setApplicationHasQuestions(Set<ApplicationHasQuestion> applicationHasQuestions) {
		this.applicationHasQuestions = applicationHasQuestions;
	}

}
