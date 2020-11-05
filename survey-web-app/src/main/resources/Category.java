// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final

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
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "encuesta")
public class Category implements java.io.Serializable {

	private Integer categoryId;
	private Survey survey;
	private String categoryName;
	private Set<Question> questions = new HashSet<Question>(0);

	public Category() {
	}

	public Category(Survey survey, String categoryName) {
		this.survey = survey;
		this.categoryName = categoryName;
	}

	public Category(Survey survey, String categoryName, Set<Question> questions) {
		this.survey = survey;
		this.categoryName = categoryName;
		this.questions = questions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "CategoryID", unique = true, nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "survey_SurveyID", nullable = false)
	public Survey getSurvey() {
		return this.survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	@Column(name = "CategoryName", nullable = false, length = 45)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

}
