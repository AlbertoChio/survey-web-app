// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * InnodbLockWaits generated by hbm2java
 */
@Entity
@Table(name = "innodb_lock_waits", catalog = "sys")
public class InnodbLockWaits implements java.io.Serializable {

	private InnodbLockWaitsId id;

	public InnodbLockWaits() {
	}

	public InnodbLockWaits(InnodbLockWaitsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "waitStarted", column = @Column(name = "wait_started", length = 19)),
			@AttributeOverride(name = "waitAge", column = @Column(name = "wait_age", length = 8)),
			@AttributeOverride(name = "waitAgeSecs", column = @Column(name = "wait_age_secs")),
			@AttributeOverride(name = "lockedTable", column = @Column(name = "locked_table", length = 16777215)),
			@AttributeOverride(name = "lockedTableSchema", column = @Column(name = "locked_table_schema", length = 64)),
			@AttributeOverride(name = "lockedTableName", column = @Column(name = "locked_table_name", length = 64)),
			@AttributeOverride(name = "lockedTablePartition", column = @Column(name = "locked_table_partition", length = 64)),
			@AttributeOverride(name = "lockedTableSubpartition", column = @Column(name = "locked_table_subpartition", length = 64)),
			@AttributeOverride(name = "lockedIndex", column = @Column(name = "locked_index", length = 64)),
			@AttributeOverride(name = "lockedType", column = @Column(name = "locked_type", nullable = false, length = 32)),
			@AttributeOverride(name = "waitingTrxId", column = @Column(name = "waiting_trx_id", nullable = false, length = 18)),
			@AttributeOverride(name = "waitingTrxStarted", column = @Column(name = "waiting_trx_started", nullable = false, length = 19)),
			@AttributeOverride(name = "waitingTrxAge", column = @Column(name = "waiting_trx_age", length = 8)),
			@AttributeOverride(name = "waitingTrxRowsLocked", column = @Column(name = "waiting_trx_rows_locked", nullable = false)),
			@AttributeOverride(name = "waitingTrxRowsModified", column = @Column(name = "waiting_trx_rows_modified", nullable = false)),
			@AttributeOverride(name = "waitingPid", column = @Column(name = "waiting_pid", nullable = false)),
			@AttributeOverride(name = "waitingQuery", column = @Column(name = "waiting_query")),
			@AttributeOverride(name = "waitingLockId", column = @Column(name = "waiting_lock_id", nullable = false, length = 128)),
			@AttributeOverride(name = "waitingLockMode", column = @Column(name = "waiting_lock_mode", nullable = false, length = 32)),
			@AttributeOverride(name = "blockingTrxId", column = @Column(name = "blocking_trx_id", nullable = false, length = 18)),
			@AttributeOverride(name = "blockingPid", column = @Column(name = "blocking_pid", nullable = false)),
			@AttributeOverride(name = "blockingQuery", column = @Column(name = "blocking_query")),
			@AttributeOverride(name = "blockingLockId", column = @Column(name = "blocking_lock_id", nullable = false, length = 128)),
			@AttributeOverride(name = "blockingLockMode", column = @Column(name = "blocking_lock_mode", nullable = false, length = 32)),
			@AttributeOverride(name = "blockingTrxStarted", column = @Column(name = "blocking_trx_started", nullable = false, length = 19)),
			@AttributeOverride(name = "blockingTrxAge", column = @Column(name = "blocking_trx_age", length = 8)),
			@AttributeOverride(name = "blockingTrxRowsLocked", column = @Column(name = "blocking_trx_rows_locked", nullable = false)),
			@AttributeOverride(name = "blockingTrxRowsModified", column = @Column(name = "blocking_trx_rows_modified", nullable = false)),
			@AttributeOverride(name = "sqlKillBlockingQuery", column = @Column(name = "sql_kill_blocking_query", nullable = false, length = 32)),
			@AttributeOverride(name = "sqlKillBlockingConnection", column = @Column(name = "sql_kill_blocking_connection", nullable = false, length = 26)) })
	public InnodbLockWaitsId getId() {
		return this.id;
	}

	public void setId(InnodbLockWaitsId id) {
		this.id = id;
	}

}
