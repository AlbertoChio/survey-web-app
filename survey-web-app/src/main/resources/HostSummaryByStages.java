// default package
// Generated 19 oct 2020 21:12:21 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * HostSummaryByStages generated by hbm2java
 */
@Entity
@Table(name = "host_summary_by_stages", catalog = "sys")
public class HostSummaryByStages implements java.io.Serializable {

	private HostSummaryByStagesId id;

	public HostSummaryByStages() {
	}

	public HostSummaryByStages(HostSummaryByStagesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "host", column = @Column(name = "host")),
			@AttributeOverride(name = "eventName", column = @Column(name = "event_name", nullable = false, length = 128)),
			@AttributeOverride(name = "total", column = @Column(name = "total", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 65535)),
			@AttributeOverride(name = "avgLatency", column = @Column(name = "avg_latency", length = 65535)) })
	public HostSummaryByStagesId getId() {
		return this.id;
	}

	public void setId(HostSummaryByStagesId id) {
		this.id = id;
	}

}
