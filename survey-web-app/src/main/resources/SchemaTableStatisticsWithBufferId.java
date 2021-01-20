// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SchemaTableStatisticsWithBufferId generated by hbm2java
 */
@Embeddable
public class SchemaTableStatisticsWithBufferId implements java.io.Serializable {

	private String tableSchema;
	private String tableName;
	private long rowsFetched;
	private String fetchLatency;
	private long rowsInserted;
	private String insertLatency;
	private long rowsUpdated;
	private String updateLatency;
	private long rowsDeleted;
	private String deleteLatency;
	private BigDecimal ioReadRequests;
	private String ioRead;
	private String ioReadLatency;
	private BigDecimal ioWriteRequests;
	private String ioWrite;
	private String ioWriteLatency;
	private BigDecimal ioMiscRequests;
	private String ioMiscLatency;
	private String innodbBufferAllocated;
	private String innodbBufferData;
	private String innodbBufferFree;
	private Long innodbBufferPages;
	private Long innodbBufferPagesHashed;
	private Long innodbBufferPagesOld;
	private BigDecimal innodbBufferRowsCached;

	public SchemaTableStatisticsWithBufferId() {
	}

	public SchemaTableStatisticsWithBufferId(long rowsFetched, long rowsInserted, long rowsUpdated, long rowsDeleted) {
		this.rowsFetched = rowsFetched;
		this.rowsInserted = rowsInserted;
		this.rowsUpdated = rowsUpdated;
		this.rowsDeleted = rowsDeleted;
	}

	public SchemaTableStatisticsWithBufferId(String tableSchema, String tableName, long rowsFetched,
			String fetchLatency, long rowsInserted, String insertLatency, long rowsUpdated, String updateLatency,
			long rowsDeleted, String deleteLatency, BigDecimal ioReadRequests, String ioRead, String ioReadLatency,
			BigDecimal ioWriteRequests, String ioWrite, String ioWriteLatency, BigDecimal ioMiscRequests,
			String ioMiscLatency, String innodbBufferAllocated, String innodbBufferData, String innodbBufferFree,
			Long innodbBufferPages, Long innodbBufferPagesHashed, Long innodbBufferPagesOld,
			BigDecimal innodbBufferRowsCached) {
		this.tableSchema = tableSchema;
		this.tableName = tableName;
		this.rowsFetched = rowsFetched;
		this.fetchLatency = fetchLatency;
		this.rowsInserted = rowsInserted;
		this.insertLatency = insertLatency;
		this.rowsUpdated = rowsUpdated;
		this.updateLatency = updateLatency;
		this.rowsDeleted = rowsDeleted;
		this.deleteLatency = deleteLatency;
		this.ioReadRequests = ioReadRequests;
		this.ioRead = ioRead;
		this.ioReadLatency = ioReadLatency;
		this.ioWriteRequests = ioWriteRequests;
		this.ioWrite = ioWrite;
		this.ioWriteLatency = ioWriteLatency;
		this.ioMiscRequests = ioMiscRequests;
		this.ioMiscLatency = ioMiscLatency;
		this.innodbBufferAllocated = innodbBufferAllocated;
		this.innodbBufferData = innodbBufferData;
		this.innodbBufferFree = innodbBufferFree;
		this.innodbBufferPages = innodbBufferPages;
		this.innodbBufferPagesHashed = innodbBufferPagesHashed;
		this.innodbBufferPagesOld = innodbBufferPagesOld;
		this.innodbBufferRowsCached = innodbBufferRowsCached;
	}

	@Column(name = "table_schema", length = 64)
	public String getTableSchema() {
		return this.tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	@Column(name = "table_name", length = 64)
	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Column(name = "rows_fetched", nullable = false)
	public long getRowsFetched() {
		return this.rowsFetched;
	}

	public void setRowsFetched(long rowsFetched) {
		this.rowsFetched = rowsFetched;
	}

	@Column(name = "fetch_latency", length = 65535)
	public String getFetchLatency() {
		return this.fetchLatency;
	}

	public void setFetchLatency(String fetchLatency) {
		this.fetchLatency = fetchLatency;
	}

	@Column(name = "rows_inserted", nullable = false)
	public long getRowsInserted() {
		return this.rowsInserted;
	}

	public void setRowsInserted(long rowsInserted) {
		this.rowsInserted = rowsInserted;
	}

	@Column(name = "insert_latency", length = 65535)
	public String getInsertLatency() {
		return this.insertLatency;
	}

	public void setInsertLatency(String insertLatency) {
		this.insertLatency = insertLatency;
	}

	@Column(name = "rows_updated", nullable = false)
	public long getRowsUpdated() {
		return this.rowsUpdated;
	}

	public void setRowsUpdated(long rowsUpdated) {
		this.rowsUpdated = rowsUpdated;
	}

	@Column(name = "update_latency", length = 65535)
	public String getUpdateLatency() {
		return this.updateLatency;
	}

	public void setUpdateLatency(String updateLatency) {
		this.updateLatency = updateLatency;
	}

	@Column(name = "rows_deleted", nullable = false)
	public long getRowsDeleted() {
		return this.rowsDeleted;
	}

	public void setRowsDeleted(long rowsDeleted) {
		this.rowsDeleted = rowsDeleted;
	}

	@Column(name = "delete_latency", length = 65535)
	public String getDeleteLatency() {
		return this.deleteLatency;
	}

	public void setDeleteLatency(String deleteLatency) {
		this.deleteLatency = deleteLatency;
	}

	@Column(name = "io_read_requests", precision = 42, scale = 0)
	public BigDecimal getIoReadRequests() {
		return this.ioReadRequests;
	}

	public void setIoReadRequests(BigDecimal ioReadRequests) {
		this.ioReadRequests = ioReadRequests;
	}

	@Column(name = "io_read", length = 65535)
	public String getIoRead() {
		return this.ioRead;
	}

	public void setIoRead(String ioRead) {
		this.ioRead = ioRead;
	}

	@Column(name = "io_read_latency", length = 65535)
	public String getIoReadLatency() {
		return this.ioReadLatency;
	}

	public void setIoReadLatency(String ioReadLatency) {
		this.ioReadLatency = ioReadLatency;
	}

	@Column(name = "io_write_requests", precision = 42, scale = 0)
	public BigDecimal getIoWriteRequests() {
		return this.ioWriteRequests;
	}

	public void setIoWriteRequests(BigDecimal ioWriteRequests) {
		this.ioWriteRequests = ioWriteRequests;
	}

	@Column(name = "io_write", length = 65535)
	public String getIoWrite() {
		return this.ioWrite;
	}

	public void setIoWrite(String ioWrite) {
		this.ioWrite = ioWrite;
	}

	@Column(name = "io_write_latency", length = 65535)
	public String getIoWriteLatency() {
		return this.ioWriteLatency;
	}

	public void setIoWriteLatency(String ioWriteLatency) {
		this.ioWriteLatency = ioWriteLatency;
	}

	@Column(name = "io_misc_requests", precision = 42, scale = 0)
	public BigDecimal getIoMiscRequests() {
		return this.ioMiscRequests;
	}

	public void setIoMiscRequests(BigDecimal ioMiscRequests) {
		this.ioMiscRequests = ioMiscRequests;
	}

	@Column(name = "io_misc_latency", length = 65535)
	public String getIoMiscLatency() {
		return this.ioMiscLatency;
	}

	public void setIoMiscLatency(String ioMiscLatency) {
		this.ioMiscLatency = ioMiscLatency;
	}

	@Column(name = "innodb_buffer_allocated", length = 65535)
	public String getInnodbBufferAllocated() {
		return this.innodbBufferAllocated;
	}

	public void setInnodbBufferAllocated(String innodbBufferAllocated) {
		this.innodbBufferAllocated = innodbBufferAllocated;
	}

	@Column(name = "innodb_buffer_data", length = 65535)
	public String getInnodbBufferData() {
		return this.innodbBufferData;
	}

	public void setInnodbBufferData(String innodbBufferData) {
		this.innodbBufferData = innodbBufferData;
	}

	@Column(name = "innodb_buffer_free", length = 65535)
	public String getInnodbBufferFree() {
		return this.innodbBufferFree;
	}

	public void setInnodbBufferFree(String innodbBufferFree) {
		this.innodbBufferFree = innodbBufferFree;
	}

	@Column(name = "innodb_buffer_pages")
	public Long getInnodbBufferPages() {
		return this.innodbBufferPages;
	}

	public void setInnodbBufferPages(Long innodbBufferPages) {
		this.innodbBufferPages = innodbBufferPages;
	}

	@Column(name = "innodb_buffer_pages_hashed")
	public Long getInnodbBufferPagesHashed() {
		return this.innodbBufferPagesHashed;
	}

	public void setInnodbBufferPagesHashed(Long innodbBufferPagesHashed) {
		this.innodbBufferPagesHashed = innodbBufferPagesHashed;
	}

	@Column(name = "innodb_buffer_pages_old")
	public Long getInnodbBufferPagesOld() {
		return this.innodbBufferPagesOld;
	}

	public void setInnodbBufferPagesOld(Long innodbBufferPagesOld) {
		this.innodbBufferPagesOld = innodbBufferPagesOld;
	}

	@Column(name = "innodb_buffer_rows_cached", precision = 44, scale = 0)
	public BigDecimal getInnodbBufferRowsCached() {
		return this.innodbBufferRowsCached;
	}

	public void setInnodbBufferRowsCached(BigDecimal innodbBufferRowsCached) {
		this.innodbBufferRowsCached = innodbBufferRowsCached;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SchemaTableStatisticsWithBufferId))
			return false;
		SchemaTableStatisticsWithBufferId castOther = (SchemaTableStatisticsWithBufferId) other;

		return ((this.getTableSchema() == castOther.getTableSchema()) || (this.getTableSchema() != null
				&& castOther.getTableSchema() != null && this.getTableSchema().equals(castOther.getTableSchema())))
				&& ((this.getTableName() == castOther.getTableName()) || (this.getTableName() != null
						&& castOther.getTableName() != null && this.getTableName().equals(castOther.getTableName())))
				&& (this.getRowsFetched() == castOther.getRowsFetched())
				&& ((this.getFetchLatency() == castOther.getFetchLatency())
						|| (this.getFetchLatency() != null && castOther.getFetchLatency() != null
								&& this.getFetchLatency().equals(castOther.getFetchLatency())))
				&& (this.getRowsInserted() == castOther.getRowsInserted())
				&& ((this.getInsertLatency() == castOther.getInsertLatency())
						|| (this.getInsertLatency() != null && castOther.getInsertLatency() != null
								&& this.getInsertLatency().equals(castOther.getInsertLatency())))
				&& (this.getRowsUpdated() == castOther.getRowsUpdated())
				&& ((this.getUpdateLatency() == castOther.getUpdateLatency())
						|| (this.getUpdateLatency() != null && castOther.getUpdateLatency() != null
								&& this.getUpdateLatency().equals(castOther.getUpdateLatency())))
				&& (this.getRowsDeleted() == castOther.getRowsDeleted())
				&& ((this.getDeleteLatency() == castOther.getDeleteLatency())
						|| (this.getDeleteLatency() != null && castOther.getDeleteLatency() != null
								&& this.getDeleteLatency().equals(castOther.getDeleteLatency())))
				&& ((this.getIoReadRequests() == castOther.getIoReadRequests())
						|| (this.getIoReadRequests() != null && castOther.getIoReadRequests() != null
								&& this.getIoReadRequests().equals(castOther.getIoReadRequests())))
				&& ((this.getIoRead() == castOther.getIoRead()) || (this.getIoRead() != null
						&& castOther.getIoRead() != null && this.getIoRead().equals(castOther.getIoRead())))
				&& ((this.getIoReadLatency() == castOther.getIoReadLatency())
						|| (this.getIoReadLatency() != null && castOther.getIoReadLatency() != null
								&& this.getIoReadLatency().equals(castOther.getIoReadLatency())))
				&& ((this.getIoWriteRequests() == castOther.getIoWriteRequests())
						|| (this.getIoWriteRequests() != null && castOther.getIoWriteRequests() != null
								&& this.getIoWriteRequests().equals(castOther.getIoWriteRequests())))
				&& ((this.getIoWrite() == castOther.getIoWrite()) || (this.getIoWrite() != null
						&& castOther.getIoWrite() != null && this.getIoWrite().equals(castOther.getIoWrite())))
				&& ((this.getIoWriteLatency() == castOther.getIoWriteLatency())
						|| (this.getIoWriteLatency() != null && castOther.getIoWriteLatency() != null
								&& this.getIoWriteLatency().equals(castOther.getIoWriteLatency())))
				&& ((this.getIoMiscRequests() == castOther.getIoMiscRequests())
						|| (this.getIoMiscRequests() != null && castOther.getIoMiscRequests() != null
								&& this.getIoMiscRequests().equals(castOther.getIoMiscRequests())))
				&& ((this.getIoMiscLatency() == castOther.getIoMiscLatency())
						|| (this.getIoMiscLatency() != null && castOther.getIoMiscLatency() != null
								&& this.getIoMiscLatency().equals(castOther.getIoMiscLatency())))
				&& ((this.getInnodbBufferAllocated() == castOther.getInnodbBufferAllocated())
						|| (this.getInnodbBufferAllocated() != null && castOther.getInnodbBufferAllocated() != null
								&& this.getInnodbBufferAllocated().equals(castOther.getInnodbBufferAllocated())))
				&& ((this.getInnodbBufferData() == castOther.getInnodbBufferData())
						|| (this.getInnodbBufferData() != null && castOther.getInnodbBufferData() != null
								&& this.getInnodbBufferData().equals(castOther.getInnodbBufferData())))
				&& ((this.getInnodbBufferFree() == castOther.getInnodbBufferFree())
						|| (this.getInnodbBufferFree() != null && castOther.getInnodbBufferFree() != null
								&& this.getInnodbBufferFree().equals(castOther.getInnodbBufferFree())))
				&& ((this.getInnodbBufferPages() == castOther.getInnodbBufferPages())
						|| (this.getInnodbBufferPages() != null && castOther.getInnodbBufferPages() != null
								&& this.getInnodbBufferPages().equals(castOther.getInnodbBufferPages())))
				&& ((this.getInnodbBufferPagesHashed() == castOther.getInnodbBufferPagesHashed())
						|| (this.getInnodbBufferPagesHashed() != null && castOther.getInnodbBufferPagesHashed() != null
								&& this.getInnodbBufferPagesHashed().equals(castOther.getInnodbBufferPagesHashed())))
				&& ((this.getInnodbBufferPagesOld() == castOther.getInnodbBufferPagesOld())
						|| (this.getInnodbBufferPagesOld() != null && castOther.getInnodbBufferPagesOld() != null
								&& this.getInnodbBufferPagesOld().equals(castOther.getInnodbBufferPagesOld())))
				&& ((this.getInnodbBufferRowsCached() == castOther.getInnodbBufferRowsCached())
						|| (this.getInnodbBufferRowsCached() != null && castOther.getInnodbBufferRowsCached() != null
								&& this.getInnodbBufferRowsCached().equals(castOther.getInnodbBufferRowsCached())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTableSchema() == null ? 0 : this.getTableSchema().hashCode());
		result = 37 * result + (getTableName() == null ? 0 : this.getTableName().hashCode());
		result = 37 * result + (int) this.getRowsFetched();
		result = 37 * result + (getFetchLatency() == null ? 0 : this.getFetchLatency().hashCode());
		result = 37 * result + (int) this.getRowsInserted();
		result = 37 * result + (getInsertLatency() == null ? 0 : this.getInsertLatency().hashCode());
		result = 37 * result + (int) this.getRowsUpdated();
		result = 37 * result + (getUpdateLatency() == null ? 0 : this.getUpdateLatency().hashCode());
		result = 37 * result + (int) this.getRowsDeleted();
		result = 37 * result + (getDeleteLatency() == null ? 0 : this.getDeleteLatency().hashCode());
		result = 37 * result + (getIoReadRequests() == null ? 0 : this.getIoReadRequests().hashCode());
		result = 37 * result + (getIoRead() == null ? 0 : this.getIoRead().hashCode());
		result = 37 * result + (getIoReadLatency() == null ? 0 : this.getIoReadLatency().hashCode());
		result = 37 * result + (getIoWriteRequests() == null ? 0 : this.getIoWriteRequests().hashCode());
		result = 37 * result + (getIoWrite() == null ? 0 : this.getIoWrite().hashCode());
		result = 37 * result + (getIoWriteLatency() == null ? 0 : this.getIoWriteLatency().hashCode());
		result = 37 * result + (getIoMiscRequests() == null ? 0 : this.getIoMiscRequests().hashCode());
		result = 37 * result + (getIoMiscLatency() == null ? 0 : this.getIoMiscLatency().hashCode());
		result = 37 * result + (getInnodbBufferAllocated() == null ? 0 : this.getInnodbBufferAllocated().hashCode());
		result = 37 * result + (getInnodbBufferData() == null ? 0 : this.getInnodbBufferData().hashCode());
		result = 37 * result + (getInnodbBufferFree() == null ? 0 : this.getInnodbBufferFree().hashCode());
		result = 37 * result + (getInnodbBufferPages() == null ? 0 : this.getInnodbBufferPages().hashCode());
		result = 37 * result
				+ (getInnodbBufferPagesHashed() == null ? 0 : this.getInnodbBufferPagesHashed().hashCode());
		result = 37 * result + (getInnodbBufferPagesOld() == null ? 0 : this.getInnodbBufferPagesOld().hashCode());
		result = 37 * result + (getInnodbBufferRowsCached() == null ? 0 : this.getInnodbBufferRowsCached().hashCode());
		return result;
	}

}
