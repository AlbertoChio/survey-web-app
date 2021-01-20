// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HostSummaryByStagesId generated by hbm2java
 */
@Embeddable
public class HostSummaryByStagesId implements java.io.Serializable {

	private String host;
	private String eventName;
	private long total;
	private String totalLatency;
	private String avgLatency;

	public HostSummaryByStagesId() {
	}

	public HostSummaryByStagesId(String eventName, long total) {
		this.eventName = eventName;
		this.total = total;
	}

	public HostSummaryByStagesId(String host, String eventName, long total, String totalLatency, String avgLatency) {
		this.host = host;
		this.eventName = eventName;
		this.total = total;
		this.totalLatency = totalLatency;
		this.avgLatency = avgLatency;
	}

	@Column(name = "host")
	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Column(name = "event_name", nullable = false, length = 128)
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HostSummaryByStagesId))
			return false;
		HostSummaryByStagesId castOther = (HostSummaryByStagesId) other;

		return ((this.getHost() == castOther.getHost()) || (this.getHost() != null && castOther.getHost() != null
				&& this.getHost().equals(castOther.getHost())))
				&& ((this.getEventName() == castOther.getEventName()) || (this.getEventName() != null
						&& castOther.getEventName() != null && this.getEventName().equals(castOther.getEventName())))
				&& (this.getTotal() == castOther.getTotal())
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getAvgLatency() == castOther.getAvgLatency())
						|| (this.getAvgLatency() != null && castOther.getAvgLatency() != null
								&& this.getAvgLatency().equals(castOther.getAvgLatency())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHost() == null ? 0 : this.getHost().hashCode());
		result = 37 * result + (getEventName() == null ? 0 : this.getEventName().hashCode());
		result = 37 * result + (int) this.getTotal();
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode());
		return result;
	}

}
