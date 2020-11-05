// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MemoryByThreadByCurrentBytesId generated by hbm2java
 */
@Embeddable
public class MemoryByThreadByCurrentBytesId implements java.io.Serializable {

	private long threadId;
	private String user;
	private BigDecimal currentCountUsed;
	private String currentAllocated;
	private String currentAvgAlloc;
	private String currentMaxAlloc;
	private String totalAllocated;

	public MemoryByThreadByCurrentBytesId() {
	}

	public MemoryByThreadByCurrentBytesId(long threadId) {
		this.threadId = threadId;
	}

	public MemoryByThreadByCurrentBytesId(long threadId, String user, BigDecimal currentCountUsed,
			String currentAllocated, String currentAvgAlloc, String currentMaxAlloc, String totalAllocated) {
		this.threadId = threadId;
		this.user = user;
		this.currentCountUsed = currentCountUsed;
		this.currentAllocated = currentAllocated;
		this.currentAvgAlloc = currentAvgAlloc;
		this.currentMaxAlloc = currentMaxAlloc;
		this.totalAllocated = totalAllocated;
	}

	@Column(name = "thread_id", nullable = false)
	public long getThreadId() {
		return this.threadId;
	}

	public void setThreadId(long threadId) {
		this.threadId = threadId;
	}

	@Column(name = "user", length = 288)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "current_count_used", precision = 41, scale = 0)
	public BigDecimal getCurrentCountUsed() {
		return this.currentCountUsed;
	}

	public void setCurrentCountUsed(BigDecimal currentCountUsed) {
		this.currentCountUsed = currentCountUsed;
	}

	@Column(name = "current_allocated", length = 65535)
	public String getCurrentAllocated() {
		return this.currentAllocated;
	}

	public void setCurrentAllocated(String currentAllocated) {
		this.currentAllocated = currentAllocated;
	}

	@Column(name = "current_avg_alloc", length = 65535)
	public String getCurrentAvgAlloc() {
		return this.currentAvgAlloc;
	}

	public void setCurrentAvgAlloc(String currentAvgAlloc) {
		this.currentAvgAlloc = currentAvgAlloc;
	}

	@Column(name = "current_max_alloc", length = 65535)
	public String getCurrentMaxAlloc() {
		return this.currentMaxAlloc;
	}

	public void setCurrentMaxAlloc(String currentMaxAlloc) {
		this.currentMaxAlloc = currentMaxAlloc;
	}

	@Column(name = "total_allocated", length = 65535)
	public String getTotalAllocated() {
		return this.totalAllocated;
	}

	public void setTotalAllocated(String totalAllocated) {
		this.totalAllocated = totalAllocated;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MemoryByThreadByCurrentBytesId))
			return false;
		MemoryByThreadByCurrentBytesId castOther = (MemoryByThreadByCurrentBytesId) other;

		return (this.getThreadId() == castOther.getThreadId())
				&& ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
						&& this.getUser().equals(castOther.getUser())))
				&& ((this.getCurrentCountUsed() == castOther.getCurrentCountUsed())
						|| (this.getCurrentCountUsed() != null && castOther.getCurrentCountUsed() != null
								&& this.getCurrentCountUsed().equals(castOther.getCurrentCountUsed())))
				&& ((this.getCurrentAllocated() == castOther.getCurrentAllocated())
						|| (this.getCurrentAllocated() != null && castOther.getCurrentAllocated() != null
								&& this.getCurrentAllocated().equals(castOther.getCurrentAllocated())))
				&& ((this.getCurrentAvgAlloc() == castOther.getCurrentAvgAlloc())
						|| (this.getCurrentAvgAlloc() != null && castOther.getCurrentAvgAlloc() != null
								&& this.getCurrentAvgAlloc().equals(castOther.getCurrentAvgAlloc())))
				&& ((this.getCurrentMaxAlloc() == castOther.getCurrentMaxAlloc())
						|| (this.getCurrentMaxAlloc() != null && castOther.getCurrentMaxAlloc() != null
								&& this.getCurrentMaxAlloc().equals(castOther.getCurrentMaxAlloc())))
				&& ((this.getTotalAllocated() == castOther.getTotalAllocated())
						|| (this.getTotalAllocated() != null && castOther.getTotalAllocated() != null
								&& this.getTotalAllocated().equals(castOther.getTotalAllocated())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getThreadId();
		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getCurrentCountUsed() == null ? 0 : this.getCurrentCountUsed().hashCode());
		result = 37 * result + (getCurrentAllocated() == null ? 0 : this.getCurrentAllocated().hashCode());
		result = 37 * result + (getCurrentAvgAlloc() == null ? 0 : this.getCurrentAvgAlloc().hashCode());
		result = 37 * result + (getCurrentMaxAlloc() == null ? 0 : this.getCurrentMaxAlloc().hashCode());
		result = 37 * result + (getTotalAllocated() == null ? 0 : this.getTotalAllocated().hashCode());
		return result;
	}

}
