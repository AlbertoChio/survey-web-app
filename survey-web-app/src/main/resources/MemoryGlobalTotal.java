// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MemoryGlobalTotal generated by hbm2java
 */
@Entity
@Table(name = "memory_global_total", catalog = "sys")
public class MemoryGlobalTotal implements java.io.Serializable {

	private String totalAllocated;

	public MemoryGlobalTotal() {
	}

	public MemoryGlobalTotal(String totalAllocated) {
		this.totalAllocated = totalAllocated;
	}

	@Id

	@Column(name = "total_allocated", length = 65535)
	public String getTotalAllocated() {
		return this.totalAllocated;
	}

	public void setTotalAllocated(String totalAllocated) {
		this.totalAllocated = totalAllocated;
	}

}
