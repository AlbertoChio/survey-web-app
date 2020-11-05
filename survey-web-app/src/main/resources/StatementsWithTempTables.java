// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * StatementsWithTempTables generated by hbm2java
 */
@Entity
@Table(name = "statements_with_temp_tables", catalog = "sys")
public class StatementsWithTempTables implements java.io.Serializable {

	private StatementsWithTempTablesId id;

	public StatementsWithTempTables() {
	}

	public StatementsWithTempTables(StatementsWithTempTablesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "query", column = @Column(name = "query")),
			@AttributeOverride(name = "db", column = @Column(name = "db", length = 64)),
			@AttributeOverride(name = "execCount", column = @Column(name = "exec_count", nullable = false)),
			@AttributeOverride(name = "totalLatency", column = @Column(name = "total_latency", length = 65535)),
			@AttributeOverride(name = "memoryTmpTables", column = @Column(name = "memory_tmp_tables", nullable = false)),
			@AttributeOverride(name = "diskTmpTables", column = @Column(name = "disk_tmp_tables", nullable = false)),
			@AttributeOverride(name = "avgTmpTablesPerQuery", column = @Column(name = "avg_tmp_tables_per_query", nullable = false, precision = 21, scale = 0)),
			@AttributeOverride(name = "tmpTablesToDiskPct", column = @Column(name = "tmp_tables_to_disk_pct", nullable = false, precision = 24, scale = 0)),
			@AttributeOverride(name = "firstSeen", column = @Column(name = "first_seen", nullable = false, length = 26)),
			@AttributeOverride(name = "lastSeen", column = @Column(name = "last_seen", nullable = false, length = 26)),
			@AttributeOverride(name = "digest", column = @Column(name = "digest", length = 64)) })
	public StatementsWithTempTablesId getId() {
		return this.id;
	}

	public void setId(StatementsWithTempTablesId id) {
		this.id = id;
	}

}
