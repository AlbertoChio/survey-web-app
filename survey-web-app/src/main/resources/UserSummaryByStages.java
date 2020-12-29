// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UserSummaryByStages generated by hbm2java
 */
@Entity
@Table(name = "user_summary_by_stages", catalog = "sys")
public class UserSummaryByStages implements java.io.Serializable {

	private UserSummaryByStagesId id;

	public UserSummaryByStages() {
	}

	public UserSummaryByStages(UserSummaryByStagesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "user", column = @Column(name = "user", length = 32)),
			@AttributeOverride(name = "eventName", column = @Column(name = "event_name", nullable = false, length = 128)),
			@AttributeOverride(name = "total", column = @Column(name = "total", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 65535)),
			@AttributeOverride(name = "avgLatency", column = @Column(name = "avg_latency", length = 65535)) })
	public UserSummaryByStagesId getId() {
		return this.id;
	}

	public void setId(UserSummaryByStagesId id) {
		this.id = id;
	}

}
