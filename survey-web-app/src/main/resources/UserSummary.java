// default package
// Generated 19 oct 2020 21:12:21 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UserSummary generated by hbm2java
 */
@Entity
@Table(name = "user_summary", catalog = "sys")
public class UserSummary implements java.io.Serializable {

	private UserSummaryId id;

	public UserSummary() {
	}

	public UserSummary(UserSummaryId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "user", column = @Column(name = "user", length = 32)),
			@AttributeOverride(name = "statements", column = @Column(name = "statements", precision = 64, scale = 0)),
			@AttributeOverride(name = "statementLatency", column = @Column(name = "statement_latency", length = 65535)),
			@AttributeOverride(name = "statementAvgLatency", column = @Column(name = "statement_avg_latency", length = 65535)),
			@AttributeOverride(name = "tableScans", column = @Column(name = "table_scans", precision = 65, scale = 0)),
			@AttributeOverride(name = "fileIos", column = @Column(name = "file_ios", precision = 64, scale = 0)),
			@AttributeOverride(name = "fileIoLatency", column = @Column(name = "file_io_latency", length = 65535)),
			@AttributeOverride(name = "currentConnections", column = @Column(name = "current_connections", precision = 41, scale = 0)),
			@AttributeOverride(name = "totalConnections", column = @Column(name = "total_connections", precision = 41, scale = 0)),
			@AttributeOverride(name = "uniqueHosts", column = @Column(name = "unique_hosts", nullable = false)),
			@AttributeOverride(name = "currentMemory", column = @Column(name = "current_memory", length = 65535)),
			@AttributeOverride(name = "totalMemoryAllocated", column = @Column(name = "total_memory_allocated", length = 65535)) })
	public UserSummaryId getId() {
		return this.id;
	}

	public void setId(UserSummaryId id) {
		this.id = id;
	}

}
