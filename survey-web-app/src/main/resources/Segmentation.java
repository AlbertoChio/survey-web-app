// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Segmentation generated by hbm2java
 */
@Entity
@Table(name = "segmentation", catalog = "encuesta", uniqueConstraints = @UniqueConstraint(columnNames = "segmentationName"))
public class Segmentation implements java.io.Serializable {

	private Integer segmentationId;
	private String segmentationName;
	private Set<Survey> surveys = new HashSet<Survey>(0);
	private Set<Segmentationitem> segmentationitems = new HashSet<Segmentationitem>(0);

	public Segmentation() {
	}

	public Segmentation(String segmentationName) {
		this.segmentationName = segmentationName;
	}

	public Segmentation(String segmentationName, Set<Survey> surveys, Set<Segmentationitem> segmentationitems) {
		this.segmentationName = segmentationName;
		this.surveys = surveys;
		this.segmentationitems = segmentationitems;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "segmentationID", unique = true, nullable = false)
	public Integer getSegmentationId() {
		return this.segmentationId;
	}

	public void setSegmentationId(Integer segmentationId) {
		this.segmentationId = segmentationId;
	}

	@Column(name = "segmentationName", unique = true, nullable = false, length = 45)
	public String getSegmentationName() {
		return this.segmentationName;
	}

	public void setSegmentationName(String segmentationName) {
		this.segmentationName = segmentationName;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "survey_has_segmentation", catalog = "encuesta", joinColumns = {
			@JoinColumn(name = "segmentation_segmentationID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "survey_SurveyID", nullable = false, updatable = false) })
	public Set<Survey> getSurveys() {
		return this.surveys;
	}

	public void setSurveys(Set<Survey> surveys) {
		this.surveys = surveys;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "segmentation")
	public Set<Segmentationitem> getSegmentationitems() {
		return this.segmentationitems;
	}

	public void setSegmentationitems(Set<Segmentationitem> segmentationitems) {
		this.segmentationitems = segmentationitems;
	}

}
