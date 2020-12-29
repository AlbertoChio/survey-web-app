// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HostSummaryByStatementTypeId generated by hbm2java
 */
@Embeddable
public class HostSummaryByStatementTypeId implements java.io.Serializable {

	private String host;
	private String statement;
	private long total;
	private String totalLatency;
	private String maxLatency;
	private String lockLatency;
	private long rowsSent;
	private long rowsExamined;
	private long rowsAffected;
	private long fullScans;

	public HostSummaryByStatementTypeId() {
	}

	public HostSummaryByStatementTypeId(long total, long rowsSent, long rowsExamined, long rowsAffected,
			long fullScans) {
		this.total = total;
		this.rowsSent = rowsSent;
		this.rowsExamined = rowsExamined;
		this.rowsAffected = rowsAffected;
		this.fullScans = fullScans;
	}

	public HostSummaryByStatementTypeId(String host, String statement, long total, String totalLatency,
			String maxLatency, String lockLatency, long rowsSent, long rowsExamined, long rowsAffected,
			long fullScans) {
		this.host = host;
		this.statement = statement;
		this.total = total;
		this.totalLatency = totalLatency;
		this.maxLatency = maxLatency;
		this.lockLatency = lockLatency;
		this.rowsSent = rowsSent;
		this.rowsExamined = rowsExamined;
		this.rowsAffected = rowsAffected;
		this.fullScans = fullScans;
	}

	@Column(name = "host")
	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Column(name = "statement", length = 128)
	public String getStatement() {
		return this.statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	@Column(name = "total", nullable = false)
	public long getTotal() {
		return this.total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Column(name = "total_latency", length = 65535)
	public String getTotalLatency() {
		return this.totalLatency;
	}

	public void setTotalLatency(String totalLatency) {
		this.totalLatency = totalLatency;
	}

	@Column(name = "max_latency", length = 65535)
	public String getMaxLatency() {
		return this.maxLatency;
	}

	public void setMaxLatency(String maxLatency) {
		this.maxLatency = maxLatency;
	}

	@Column(name = "lock_latency", length = 65535)
	public String getLockLatency() {
		return this.lockLatency;
	}

	public void setLockLatency(String lockLatency) {
		this.lockLatency = lockLatency;
	}

	@Column(name = "rows_sent", nullable = false)
	public long getRowsSent() {
		return this.rowsSent;
	}

	public void setRowsSent(long rowsSent) {
		this.rowsSent = rowsSent;
	}

	@Column(name = "rows_examined", nullable = false)
	public long getRowsExamined() {
		return this.rowsExamined;
	}

	public void setRowsExamined(long rowsExamined) {
		this.rowsExamined = rowsExamined;
	}

	@Column(name = "rows_affected", nullable = false)
	public long getRowsAffected() {
		return this.rowsAffected;
	}

	public void setRowsAffected(long rowsAffected) {
		this.rowsAffected = rowsAffected;
	}

	@Column(name = "full_scans", nullable = false)
	public long getFullScans() {
		return this.fullScans;
	}

	public void setFullScans(long fullScans) {
		this.fullScans = fullScans;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HostSummaryByStatementTypeId))
			return false;
		HostSummaryByStatementTypeId castOther = (HostSummaryByStatementTypeId) other;

		return ((this.getHost() == castOther.getHost()) || (this.getHost() != null && castOther.getHost() != null
				&& this.getHost().equals(castOther.getHost())))
				&& ((this.getStatement() == castOther.getStatement()) || (this.getStatement() != null
						&& castOther.getStatement() != null && this.getStatement().equals(castOther.getStatement())))
				&& (this.getTotal() == castOther.getTotal())
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency()) || (this.getMaxLatency() != null
						&& castOther.getMaxLatency() != null && this.getMaxLatency().equals(castOther.getMaxLatency())))
				&& ((this.getLockLatency() == castOther.getLockLatency())
						|| (this.getLockLatency() != null && castOther.getLockLatency() != null
								&& this.getLockLatency().equals(castOther.getLockLatency())))
				&& (this.getRowsSent() == castOther.getRowsSent())
				&& (this.getRowsExamined() == castOther.getRowsExamined())
				&& (this.getRowsAffected() == castOther.getRowsAffected())
				&& (this.getFullScans() == castOther.getFullScans());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHost() == null ? 0 : this.getHost().hashCode());
		result = 37 * result + (getStatement() == null ? 0 : this.getStatement().hashCode());
		result = 37 * result + (int) this.getTotal();
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		result = 37 * result + (getLockLatency() == null ? 0 : this.getLockLatency().hashCode());
		result = 37 * result + (int) this.getRowsSent();
		result = 37 * result + (int) this.getRowsExamined();
		result = 37 * result + (int) this.getRowsAffected();
		result = 37 * result + (int) this.getFullScans();
		return result;
	}

}
