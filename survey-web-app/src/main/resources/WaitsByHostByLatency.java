// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * WaitsByHostByLatency generated by hbm2java
 */
@Entity
@Table(name = "waits_by_host_by_latency", catalog = "sys")
public class WaitsByHostByLatency implements java.io.Serializable {

	private WaitsByHostByLatencyId id;

	public WaitsByHostByLatency() {
	}

	public WaitsByHostByLatency(WaitsByHostByLatencyId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "host", column = @Column(name = "host")),
			@AttributeOverride(name = "event", column = @Column(name = "event", nullable = false, length = 128)),
			@AttributeOverride(name = "total", column = @Column(name = "total", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 65535)),
			@AttributeOverride(name = "avgLatency", column = @Column(name = "avg_latency", length = 65535)),
			@AttributeOverride(name = "maxLatency", column = @Column(name = "max_latency", length = 65535)) })
	public WaitsByHostByLatencyId getId() {
		return this.id;
	}

	public void setId(WaitsByHostByLatencyId id) {
		this.id = id;
	}

}
