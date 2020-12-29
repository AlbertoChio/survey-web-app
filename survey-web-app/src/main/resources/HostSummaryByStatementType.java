// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * HostSummaryByStatementType generated by hbm2java
 */
@Entity
@Table(name = "host_summary_by_statement_type", catalog = "sys")
public class HostSummaryByStatementType implements java.io.Serializable {

	private HostSummaryByStatementTypeId id;

	public HostSummaryByStatementType() {
	}

	public HostSummaryByStatementType(HostSummaryByStatementTypeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "host", column = @Column(name = "host")),
			@AttributeOverride(name = "statement", column = @Column(name = "statement", length = 128)),
			@AttributeOverride(name = "total", column = @Column(name = "total", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 65535)),
			@AttributeOverride(name = "maxLatency", column = @Column(name = "max_latency", length = 65535)),
			@AttributeOverride(name = "lockLatency", column = @Column(name = "lock_latency", length = 65535)),
			@AttributeOverride(name = "rowsSent", column = @Column(name = "rows_sent", nullable = false)),
			@AttributeOverride(name = "rowsExamined", column = @Column(name = "rows_examined", nullable = false)),
			@AttributeOverride(name = "rowsAffected", column = @Column(name = "rows_affected", nullable = false)),
			@AttributeOverride(name = "fullScans", column = @Column(name = "full_scans", nullable = false)) })
	public HostSummaryByStatementTypeId getId() {
		return this.id;
	}

	public void setId(HostSummaryByStatementTypeId id) {
		this.id = id;
	}

}
