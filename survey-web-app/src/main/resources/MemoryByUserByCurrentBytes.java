// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MemoryByUserByCurrentBytes generated by hbm2java
 */
@Entity
@Table(name = "memory_by_user_by_current_bytes", catalog = "sys")
public class MemoryByUserByCurrentBytes implements java.io.Serializable {

	private MemoryByUserByCurrentBytesId id;

	public MemoryByUserByCurrentBytes() {
	}

	public MemoryByUserByCurrentBytes(MemoryByUserByCurrentBytesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "user", column = @Column(name = "user", length = 32)),
			@AttributeOverride(name = "currentCountUsed", column = @Column(name = "current_count_used", precision = 41, scale = 0)),
			@AttributeOverride(name = "currentAllocated", column = @Column(name = "current_allocated", length = 65535)),
			@AttributeOverride(name = "currentAvgAlloc", column = @Column(name = "current_avg_alloc", length = 65535)),
			@AttributeOverride(name = "currentMaxAlloc", column = @Column(name = "current_max_alloc", length = 65535)),
			@AttributeOverride(name = "totalAllocated", column = @Column(name = "total_allocated", length = 65535)) })
	public MemoryByUserByCurrentBytesId getId() {
		return this.id;
	}

	public void setId(MemoryByUserByCurrentBytesId id) {
		this.id = id;
	}

}
