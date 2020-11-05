// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IoGlobalByWaitByLatencyId generated by hbm2java
 */
@Embeddable
public class IoGlobalByWaitByLatencyId implements java.io.Serializable {

	private String eventName;
	private long total;
	private String totalLatency;
	private String avgLatency;
	private String maxLatency;
	private String readLatency;
	private String writeLatency;
	private String miscLatency;
	private long countRead;
	private String totalRead;
	private String avgRead;
	private long countWrite;
	private String totalWritten;
	private String avgWritten;

	public IoGlobalByWaitByLatencyId() {
	}

	public IoGlobalByWaitByLatencyId(long total, long countRead, long countWrite) {
		this.total = total;
		this.countRead = countRead;
		this.countWrite = countWrite;
	}

	public IoGlobalByWaitByLatencyId(String eventName, long total, String totalLatency, String avgLatency,
			String maxLatency, String readLatency, String writeLatency, String miscLatency, long countRead,
			String totalRead, String avgRead, long countWrite, String totalWritten, String avgWritten) {
		this.eventName = eventName;
		this.total = total;
		this.totalLatency = totalLatency;
		this.avgLatency = avgLatency;
		this.maxLatency = maxLatency;
		this.readLatency = readLatency;
		this.writeLatency = writeLatency;
		this.miscLatency = miscLatency;
		this.countRead = countRead;
		this.totalRead = totalRead;
		this.avgRead = avgRead;
		this.countWrite = countWrite;
		this.totalWritten = totalWritten;
		this.avgWritten = avgWritten;
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

	@Column(name = "read_latency", length = 65535)
	public String getReadLatency() {
		return this.readLatency;
	}

	public void setReadLatency(String readLatency) {
		this.readLatency = readLatency;
	}

	@Column(name = "write_latency", length = 65535)
	public String getWriteLatency() {
		return this.writeLatency;
	}

	public void setWriteLatency(String writeLatency) {
		this.writeLatency = writeLatency;
	}

	@Column(name = "misc_latency", length = 65535)
	public String getMiscLatency() {
		return this.miscLatency;
	}

	public void setMiscLatency(String miscLatency) {
		this.miscLatency = miscLatency;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IoGlobalByWaitByLatencyId))
			return false;
		IoGlobalByWaitByLatencyId castOther = (IoGlobalByWaitByLatencyId) other;

		return ((this.getEventName() == castOther.getEventName()) || (this.getEventName() != null
				&& castOther.getEventName() != null && this.getEventName().equals(castOther.getEventName())))
				&& (this.getTotal() == castOther.getTotal())
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getAvgLatency() == castOther.getAvgLatency()) || (this.getAvgLatency() != null
						&& castOther.getAvgLatency() != null && this.getAvgLatency().equals(castOther.getAvgLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency()) || (this.getMaxLatency() != null
						&& castOther.getMaxLatency() != null && this.getMaxLatency().equals(castOther.getMaxLatency())))
				&& ((this.getReadLatency() == castOther.getReadLatency())
						|| (this.getReadLatency() != null && castOther.getReadLatency() != null
								&& this.getReadLatency().equals(castOther.getReadLatency())))
				&& ((this.getWriteLatency() == castOther.getWriteLatency())
						|| (this.getWriteLatency() != null && castOther.getWriteLatency() != null
								&& this.getWriteLatency().equals(castOther.getWriteLatency())))
				&& ((this.getMiscLatency() == castOther.getMiscLatency())
						|| (this.getMiscLatency() != null && castOther.getMiscLatency() != null
								&& this.getMiscLatency().equals(castOther.getMiscLatency())))
				&& (this.getCountRead() == castOther.getCountRead())
				&& ((this.getTotalRead() == castOther.getTotalRead()) || (this.getTotalRead() != null
						&& castOther.getTotalRead() != null && this.getTotalRead().equals(castOther.getTotalRead())))
				&& ((this.getAvgRead() == castOther.getAvgRead()) || (this.getAvgRead() != null
						&& castOther.getAvgRead() != null && this.getAvgRead().equals(castOther.getAvgRead())))
				&& (this.getCountWrite() == castOther.getCountWrite())
				&& ((this.getTotalWritten() == castOther.getTotalWritten())
						|| (this.getTotalWritten() != null && castOther.getTotalWritten() != null
								&& this.getTotalWritten().equals(castOther.getTotalWritten())))
				&& ((this.getAvgWritten() == castOther.getAvgWritten())
						|| (this.getAvgWritten() != null && castOther.getAvgWritten() != null
								&& this.getAvgWritten().equals(castOther.getAvgWritten())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEventName() == null ? 0 : this.getEventName().hashCode());
		result = 37 * result + (int) this.getTotal();
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		result = 37 * result + (getReadLatency() == null ? 0 : this.getReadLatency().hashCode());
		result = 37 * result + (getWriteLatency() == null ? 0 : this.getWriteLatency().hashCode());
		result = 37 * result + (getMiscLatency() == null ? 0 : this.getMiscLatency().hashCode());
		result = 37 * result + (int) this.getCountRead();
		result = 37 * result + (getTotalRead() == null ? 0 : this.getTotalRead().hashCode());
		result = 37 * result + (getAvgRead() == null ? 0 : this.getAvgRead().hashCode());
		result = 37 * result + (int) this.getCountWrite();
		result = 37 * result + (getTotalWritten() == null ? 0 : this.getTotalWritten().hashCode());
		result = 37 * result + (getAvgWritten() == null ? 0 : this.getAvgWritten().hashCode());
		return result;
	}

}
