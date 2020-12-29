// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IoGlobalByWaitByBytesId generated by hbm2java
 */
@Embeddable
public class IoGlobalByWaitByBytesId implements java.io.Serializable {

	private String eventName;
	private long total;
	private String totalLatency;
	private String minLatency;
	private String avgLatency;
	private String maxLatency;
	private long countRead;
	private String totalRead;
	private String avgRead;
	private long countWrite;
	private String totalWritten;
	private String avgWritten;
	private String totalRequested;

	public IoGlobalByWaitByBytesId() {
	}

	public IoGlobalByWaitByBytesId(long total, long countRead, long countWrite) {
		this.total = total;
		this.countRead = countRead;
		this.countWrite = countWrite;
	}

	public IoGlobalByWaitByBytesId(String eventName, long total, String totalLatency, String minLatency,
			String avgLatency, String maxLatency, long countRead, String totalRead, String avgRead, long countWrite,
			String totalWritten, String avgWritten, String totalRequested) {
		this.eventName = eventName;
		this.total = total;
		this.totalLatency = totalLatency;
		this.minLatency = minLatency;
		this.avgLatency = avgLatency;
		this.maxLatency = maxLatency;
		this.countRead = countRead;
		this.totalRead = totalRead;
		this.avgRead = avgRead;
		this.countWrite = countWrite;
		this.totalWritten = totalWritten;
		this.avgWritten = avgWritten;
		this.totalRequested = totalRequested;
	}

	@Column(name = "event_name", length = 128)
	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
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

	@Column(name = "min_latency", length = 65535)
	public String getMinLatency() {
		return this.minLatency;
	}

	public void setMinLatency(String minLatency) {
		this.minLatency = minLatency;
	}

	@Column(name = "avg_latency", length = 65535)
	public String getAvgLatency() {
		return this.avgLatency;
	}

	public void setAvgLatency(String avgLatency) {
		this.avgLatency = avgLatency;
	}

	@Column(name = "max_latency", length = 65535)
	public String getMaxLatency() {
		return this.maxLatency;
	}

	public void setMaxLatency(String maxLatency) {
		this.maxLatency = maxLatency;
	}

	@Column(name = "count_read", nullable = false)
	public long getCountRead() {
		return this.countRead;
	}

	public void setCountRead(long countRead) {
		this.countRead = countRead;
	}

	@Column(name = "total_read", length = 65535)
	public String getTotalRead() {
		return this.totalRead;
	}

	public void setTotalRead(String totalRead) {
		this.totalRead = totalRead;
	}

	@Column(name = "avg_read", length = 65535)
	public String getAvgRead() {
		return this.avgRead;
	}

	public void setAvgRead(String avgRead) {
		this.avgRead = avgRead;
	}

	@Column(name = "count_write", nullable = false)
	public long getCountWrite() {
		return this.countWrite;
	}

	public void setCountWrite(long countWrite) {
		this.countWrite = countWrite;
	}

	@Column(name = "total_written", length = 65535)
	public String getTotalWritten() {
		return this.totalWritten;
	}

	public void setTotalWritten(String totalWritten) {
		this.totalWritten = totalWritten;
	}

	@Column(name = "avg_written", length = 65535)
	public String getAvgWritten() {
		return this.avgWritten;
	}

	public void setAvgWritten(String avgWritten) {
		this.avgWritten = avgWritten;
	}

	@Column(name = "total_requested", length = 65535)
	public String getTotalRequested() {
		return this.totalRequested;
	}

	public void setTotalRequested(String totalRequested) {
		this.totalRequested = totalRequested;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IoGlobalByWaitByBytesId))
			return false;
		IoGlobalByWaitByBytesId castOther = (IoGlobalByWaitByBytesId) other;

		return ((this.getEventName() == castOther.getEventName()) || (this.getEventName() != null
				&& castOther.getEventName() != null && this.getEventName().equals(castOther.getEventName())))
				&& (this.getTotal() == castOther.getTotal())
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getMinLatency() == castOther.getMinLatency()) || (this.getMinLatency() != null
						&& castOther.getMinLatency() != null && this.getMinLatency().equals(castOther.getMinLatency())))
				&& ((this.getAvgLatency() == castOther.getAvgLatency()) || (this.getAvgLatency() != null
						&& castOther.getAvgLatency() != null && this.getAvgLatency().equals(castOther.getAvgLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency()) || (this.getMaxLatency() != null
						&& castOther.getMaxLatency() != null && this.getMaxLatency().equals(castOther.getMaxLatency())))
				&& (this.getCountRead() == castOther.getCountRead())
				&& ((this.getTotalRead() == castOther.getTotalRead()) || (this.getTotalRead() != null
						&& castOther.getTotalRead() != null && this.getTotalRead().equals(castOther.getTotalRead())))
				&& ((this.getAvgRead() == castOther.getAvgRead()) || (this.getAvgRead() != null
						&& castOther.getAvgRead() != null && this.getAvgRead().equals(castOther.getAvgRead())))
				&& (this.getCountWrite() == castOther.getCountWrite())
				&& ((this.getTotalWritten() == castOther.getTotalWritten())
						|| (this.getTotalWritten() != null && castOther.getTotalWritten() != null
								&& this.getTotalWritten().equals(castOther.getTotalWritten())))
				&& ((this.getAvgWritten() == castOther.getAvgWritten()) || (this.getAvgWritten() != null
						&& castOther.getAvgWritten() != null && this.getAvgWritten().equals(castOther.getAvgWritten())))
				&& ((this.getTotalRequested() == castOther.getTotalRequested())
						|| (this.getTotalRequested() != null && castOther.getTotalRequested() != null
								&& this.getTotalRequested().equals(castOther.getTotalRequested())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEventName() == null ? 0 : this.getEventName().hashCode());
		result = 37 * result + (int) this.getTotal();
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getMinLatency() == null ? 0 : this.getMinLatency().hashCode());
		result = 37 * result + (getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		result = 37 * result + (int) this.getCountRead();
		result = 37 * result + (getTotalRead() == null ? 0 : this.getTotalRead().hashCode());
		result = 37 * result + (getAvgRead() == null ? 0 : this.getAvgRead().hashCode());
		result = 37 * result + (int) this.getCountWrite();
		result = 37 * result + (getTotalWritten() == null ? 0 : this.getTotalWritten().hashCode());
		result = 37 * result + (getAvgWritten() == null ? 0 : this.getAvgWritten().hashCode());
		result = 37 * result + (getTotalRequested() == null ? 0 : this.getTotalRequested().hashCode());
		return result;
	}

}
