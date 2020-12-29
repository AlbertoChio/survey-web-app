// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * HostSummaryByFileIo generated by hbm2java
 */
@Entity
@Table(name = "host_summary_by_file_io", catalog = "sys")
public class HostSummaryByFileIo implements java.io.Serializable {

	private HostSummaryByFileIoId id;

	public HostSummaryByFileIo() {
	}

	public HostSummaryByFileIo(HostSummaryByFileIoId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "host", column = @Column(name = "host")),
			@AttributeOverride(name = "ios", column = @Column(name = "ios", precision = 42, scale = 0)),
			@AttributeOverride(name = "ioLatency", column = @Column(name = "io_latency", length = 65535)) })
	public HostSummaryByFileIoId getId() {
		return this.id;
	}

	public void setId(HostSummaryByFileIoId id) {
		this.id = id;
	}

}
