// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserSummaryByFileIoTypeId generated by hbm2java
 */
@Embeddable
public class UserSummaryByFileIoTypeId implements java.io.Serializable {

	private String user;
	private String eventName;
	private long total;
	private String latency;
	private String maxLatency;

	public UserSummaryByFileIoTypeId() {
	}

	public UserSummaryByFileIoTypeId(String eventName, long total) {
		this.eventName = eventName;
		this.total = total;
	}

	public UserSummaryByFileIoTypeId(String user, String eventName, long total, String latency, String maxLatency) {
		this.user = user;
		this.eventName = eventName;
		this.total = total;
		this.latency = latency;
		this.maxLatency = maxLatency;
	}

	@Column(name = "user", length = 32)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
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

	@Column(name = "latency", length = 65535)
	public String getLatency() {
		return this.latency;
	}

	public void setLatency(String latency) {
		this.latency = latency;
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
		if (!(other instanceof UserSummaryByFileIoTypeId))
			return false;
		UserSummaryByFileIoTypeId castOther = (UserSummaryByFileIoTypeId) other;

		return ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
				&& this.getUser().equals(castOther.getUser())))
				&& ((this.getEventName() == castOther.getEventName()) || (this.getEventName() != null
						&& castOther.getEventName() != null && this.getEventName().equals(castOther.getEventName())))
				&& (this.getTotal() == castOther.getTotal())
				&& ((this.getLatency() == castOther.getLatency()) || (this.getLatency() != null
						&& castOther.getLatency() != null && this.getLatency().equals(castOther.getLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency())
						|| (this.getMaxLatency() != null && castOther.getMaxLatency() != null
								&& this.getMaxLatency().equals(castOther.getMaxLatency())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getEventName() == null ? 0 : this.getEventName().hashCode());
		result = 37 * result + (int) this.getTotal();
		result = 37 * result + (getLatency() == null ? 0 : this.getLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		return result;
	}

}
