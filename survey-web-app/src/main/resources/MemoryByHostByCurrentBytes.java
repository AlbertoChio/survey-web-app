// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MemoryByHostByCurrentBytes generated by hbm2java
 */
@Entity
@Table(name = "memory_by_host_by_current_bytes", catalog = "sys")
public class MemoryByHostByCurrentBytes implements java.io.Serializable {

	private MemoryByHostByCurrentBytesId id;

	public MemoryByHostByCurrentBytes() {
	}

	public MemoryByHostByCurrentBytes(MemoryByHostByCurrentBytesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "host", column = @Column(name = "host")),
			@AttributeOverride(name = "currentCountUsed", column = @Column(name = "current_count_used", precision = 41, scale = 0)),
			@AttributeOverride(name = "currentAllocated", column = @Column(name = "current_allocated", length = 65535)),
			@AttributeOverride(name = "currentAvgAlloc", column = @Column(name = "current_avg_alloc", length = 65535)),
			@AttributeOverride(name = "currentMaxAlloc", column = @Column(name = "current_max_alloc", length = 65535)),
			@AttributeOverride(name = "totalAllocated", column = @Column(name = "total_allocated", length = 65535)) })
	public MemoryByHostByCurrentBytesId getId() {
		return this.id;
	}

	public void setId(MemoryByHostByCurrentBytesId id) {
		this.id = id;
	}

}
