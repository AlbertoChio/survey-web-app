// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * HostSummaryByFileIoType generated by hbm2java
 */
@Entity
@Table(name = "host_summary_by_file_io_type", catalog = "sys")
public class HostSummaryByFileIoType implements java.io.Serializable {

	private HostSummaryByFileIoTypeId id;

	public HostSummaryByFileIoType() {
	}

	public HostSummaryByFileIoType(HostSummaryByFileIoTypeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "host", column = @Column(name = "host")),
			@AttributeOverride(name = "eventName", column = @Column(name = "event_name", nullable = false, length = 128)),
			@AttributeOverride(name = "total", column = @Column(name = "total", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 65535)),
			@AttributeOverride(name = "maxLatency", column = @Column(name = "max_latency", length = 65535)) })
	public HostSummaryByFileIoTypeId getId() {
		return this.id;
	}

	public void setId(HostSummaryByFileIoTypeId id) {
		this.id = id;
	}

}
