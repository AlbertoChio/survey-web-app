// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Choice generated by hbm2java
 */
@Entity
@Table(name = "choice", catalog = "encuesta")
public class Choice implements java.io.Serializable {

	private int choiceId;
	private Question question;
	private String choiceText;
	private String choiceValue;

	public Choice() {
	}

	public Choice(int choiceId, Question question) {
		this.choiceId = choiceId;
		this.question = question;
	}

	public Choice(int choiceId, Question question, String choiceText, String choiceValue) {
		this.choiceId = choiceId;
		this.question = question;
		this.choiceText = choiceText;
		this.choiceValue = choiceValue;
	}

	@Id

	@Column(name = "ChoiceID", unique = true, nullable = false)
	public int getChoiceId() {
		return this.choiceId;
	}

	public void setChoiceId(int choiceId) {
		this.choiceId = choiceId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_QuestionID", nullable = false)
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Column(name = "ChoiceText")
	public String getChoiceText() {
		return this.choiceText;
	}

	public void setChoiceText(String choiceText) {
		this.choiceText = choiceText;
	}

	@Column(name = "ChoiceValue", length = 40)
	public String getChoiceValue() {
		return this.choiceValue;
	}

	public void setChoiceValue(String choiceValue) {
		this.choiceValue = choiceValue;
	}

}
