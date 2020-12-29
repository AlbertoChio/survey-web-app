// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WaitClassesGlobalByAvgLatencyId generated by hbm2java
 */
@Embeddable
public class WaitClassesGlobalByAvgLatencyId implements java.io.Serializable {

	private String eventClass;
	private BigDecimal total;
	private String totalLatency;
	private String minLatency;
	private String avgLatency;
	private String maxLatency;

	public WaitClassesGlobalByAvgLatencyId() {
	}

	public WaitClassesGlobalByAvgLatencyId(String eventClass, BigDecimal total, String totalLatency, String minLatency,
			String avgLatency, String maxLatency) {
		this.eventClass = eventClass;
		this.total = total;
		this.totalLatency = totalLatency;
		this.minLatency = minLatency;
		this.avgLatency = avgLatency;
		this.maxLatency = maxLatency;
	}

	@Column(name = "event_class", length = 128)
	public String getEventClass() {
		return this.eventClass;
	}

	public void setEventClass(String eventClass) {
		this.eventClass = eventClass;
	}

	@Column(name = "total", precision = 42, scale = 0)
	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WaitClassesGlobalByAvgLatencyId))
			return false;
		WaitClassesGlobalByAvgLatencyId castOther = (WaitClassesGlobalByAvgLatencyId) other;

		return ((this.getEventClass() == castOther.getEventClass()) || (this.getEventClass() != null
				&& castOther.getEventClass() != null && this.getEventClass().equals(castOther.getEventClass())))
				&& ((this.getTotal() == castOther.getTotal()) || (this.getTotal() != null
						&& castOther.getTotal() != null && this.getTotal().equals(castOther.getTotal())))
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getMinLatency() == castOther.getMinLatency()) || (this.getMinLatency() != null
						&& castOther.getMinLatency() != null && this.getMinLatency().equals(castOther.getMinLatency())))
				&& ((this.getAvgLatency() == castOther.getAvgLatency()) || (this.getAvgLatency() != null
						&& castOther.getAvgLatency() != null && this.getAvgLatency().equals(castOther.getAvgLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency())
						|| (this.getMaxLatency() != null && castOther.getMaxLatency() != null
								&& this.getMaxLatency().equals(castOther.getMaxLatency())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEventClass() == null ? 0 : this.getEventClass().hashCode());
		result = 37 * result + (getTotal() == null ? 0 : this.getTotal().hashCode());
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getMinLatency() == null ? 0 : this.getMinLatency().hashCode());
		result = 37 * result + (getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		return result;
	}

}
