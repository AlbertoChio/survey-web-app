// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.schemaTableStatisticsId generated by hbm2java
 */
@Embeddable
public class X.schemaTableStatisticsId  implements java.io.Serializable {


     private String tableSchema;
     private String tableName;
     private long totalLatency;
     private long rowsFetched;
     private long fetchLatency;
     private long rowsInserted;
     private long insertLatency;
     private long rowsUpdated;
     private long updateLatency;
     private long rowsDeleted;
     private long deleteLatency;
     private BigDecimal ioReadRequests;
     private BigDecimal ioRead;
     private BigDecimal ioReadLatency;
     private BigDecimal ioWriteRequests;
     private BigDecimal ioWrite;
     private BigDecimal ioWriteLatency;
     private BigDecimal ioMiscRequests;
     private BigDecimal ioMiscLatency;

    public X.schemaTableStatisticsId() {
    }

	
    public X.schemaTableStatisticsId(long totalLatency, long rowsFetched, long fetchLatency, long rowsInserted, long insertLatency, long rowsUpdated, long updateLatency, long rowsDeleted, long deleteLatency) {
        this.totalLatency = totalLatency;
        this.rowsFetched = rowsFetched;
        this.fetchLatency = fetchLatency;
        this.rowsInserted = rowsInserted;
        this.insertLatency = insertLatency;
        this.rowsUpdated = rowsUpdated;
        this.updateLatency = updateLatency;
        this.rowsDeleted = rowsDeleted;
        this.deleteLatency = deleteLatency;
    }
    public X.schemaTableStatisticsId(String tableSchema, String tableName, long totalLatency, long rowsFetched, long fetchLatency, long rowsInserted, long insertLatency, long rowsUpdated, long updateLatency, long rowsDeleted, long deleteLatency, BigDecimal ioReadRequests, BigDecimal ioRead, BigDecimal ioReadLatency, BigDecimal ioWriteRequests, BigDecimal ioWrite, BigDecimal ioWriteLatency, BigDecimal ioMiscRequests, BigDecimal ioMiscLatency) {
       this.tableSchema = tableSchema;
       this.tableName = tableName;
       this.totalLatency = totalLatency;
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
    }
   


    @Column(name="table_schema", length=64)
    public String getTableSchema() {
        return this.tableSchema;
    }
    
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }


    @Column(name="table_name", length=64)
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    @Column(name="total_latency", nullable=false)
    public long getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="rows_fetched", nullable=false)
    public long getRowsFetched() {
        return this.rowsFetched;
    }
    
    public void setRowsFetched(long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }


    @Column(name="fetch_latency", nullable=false)
    public long getFetchLatency() {
        return this.fetchLatency;
    }
    
    public void setFetchLatency(long fetchLatency) {
        this.fetchLatency = fetchLatency;
    }


    @Column(name="rows_inserted", nullable=false)
    public long getRowsInserted() {
        return this.rowsInserted;
    }
    
    public void setRowsInserted(long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }


    @Column(name="insert_latency", nullable=false)
    public long getInsertLatency() {
        return this.insertLatency;
    }
    
    public void setInsertLatency(long insertLatency) {
        this.insertLatency = insertLatency;
    }


    @Column(name="rows_updated", nullable=false)
    public long getRowsUpdated() {
        return this.rowsUpdated;
    }
    
    public void setRowsUpdated(long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }


    @Column(name="update_latency", nullable=false)
    public long getUpdateLatency() {
        return this.updateLatency;
    }
    
    public void setUpdateLatency(long updateLatency) {
        this.updateLatency = updateLatency;
    }


    @Column(name="rows_deleted", nullable=false)
    public long getRowsDeleted() {
        return this.rowsDeleted;
    }
    
    public void setRowsDeleted(long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }


    @Column(name="delete_latency", nullable=false)
    public long getDeleteLatency() {
        return this.deleteLatency;
    }
    
    public void setDeleteLatency(long deleteLatency) {
        this.deleteLatency = deleteLatency;
    }


    @Column(name="io_read_requests", precision=42, scale=0)
    public BigDecimal getIoReadRequests() {
        return this.ioReadRequests;
    }
    
    public void setIoReadRequests(BigDecimal ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }


    @Column(name="io_read", precision=41, scale=0)
    public BigDecimal getIoRead() {
        return this.ioRead;
    }
    
    public void setIoRead(BigDecimal ioRead) {
        this.ioRead = ioRead;
    }


    @Column(name="io_read_latency", precision=42, scale=0)
    public BigDecimal getIoReadLatency() {
        return this.ioReadLatency;
    }
    
    public void setIoReadLatency(BigDecimal ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }


    @Column(name="io_write_requests", precision=42, scale=0)
    public BigDecimal getIoWriteRequests() {
        return this.ioWriteRequests;
    }
    
    public void setIoWriteRequests(BigDecimal ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }


    @Column(name="io_write", precision=41, scale=0)
    public BigDecimal getIoWrite() {
        return this.ioWrite;
    }
    
    public void setIoWrite(BigDecimal ioWrite) {
        this.ioWrite = ioWrite;
    }


    @Column(name="io_write_latency", precision=42, scale=0)
    public BigDecimal getIoWriteLatency() {
        return this.ioWriteLatency;
    }
    
    public void setIoWriteLatency(BigDecimal ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }


    @Column(name="io_misc_requests", precision=42, scale=0)
    public BigDecimal getIoMiscRequests() {
        return this.ioMiscRequests;
    }
    
    public void setIoMiscRequests(BigDecimal ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }


    @Column(name="io_misc_latency", precision=42, scale=0)
    public BigDecimal getIoMiscLatency() {
        return this.ioMiscLatency;
    }
    
    public void setIoMiscLatency(BigDecimal ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.schemaTableStatisticsId) ) return false;
		 X.schemaTableStatisticsId castOther = ( X.schemaTableStatisticsId ) other; 
         
		 return ( (this.getTableSchema()==castOther.getTableSchema()) || ( this.getTableSchema()!=null && castOther.getTableSchema()!=null && this.getTableSchema().equals(castOther.getTableSchema()) ) )
 && ( (this.getTableName()==castOther.getTableName()) || ( this.getTableName()!=null && castOther.getTableName()!=null && this.getTableName().equals(castOther.getTableName()) ) )
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getRowsFetched()==castOther.getRowsFetched())
 && (this.getFetchLatency()==castOther.getFetchLatency())
 && (this.getRowsInserted()==castOther.getRowsInserted())
 && (this.getInsertLatency()==castOther.getInsertLatency())
 && (this.getRowsUpdated()==castOther.getRowsUpdated())
 && (this.getUpdateLatency()==castOther.getUpdateLatency())
 && (this.getRowsDeleted()==castOther.getRowsDeleted())
 && (this.getDeleteLatency()==castOther.getDeleteLatency())
 && ( (this.getIoReadRequests()==castOther.getIoReadRequests()) || ( this.getIoReadRequests()!=null && castOther.getIoReadRequests()!=null && this.getIoReadRequests().equals(castOther.getIoReadRequests()) ) )
 && ( (this.getIoRead()==castOther.getIoRead()) || ( this.getIoRead()!=null && castOther.getIoRead()!=null && this.getIoRead().equals(castOther.getIoRead()) ) )
 && ( (this.getIoReadLatency()==castOther.getIoReadLatency()) || ( this.getIoReadLatency()!=null && castOther.getIoReadLatency()!=null && this.getIoReadLatency().equals(castOther.getIoReadLatency()) ) )
 && ( (this.getIoWriteRequests()==castOther.getIoWriteRequests()) || ( this.getIoWriteRequests()!=null && castOther.getIoWriteRequests()!=null && this.getIoWriteRequests().equals(castOther.getIoWriteRequests()) ) )
 && ( (this.getIoWrite()==castOther.getIoWrite()) || ( this.getIoWrite()!=null && castOther.getIoWrite()!=null && this.getIoWrite().equals(castOther.getIoWrite()) ) )
 && ( (this.getIoWriteLatency()==castOther.getIoWriteLatency()) || ( this.getIoWriteLatency()!=null && castOther.getIoWriteLatency()!=null && this.getIoWriteLatency().equals(castOther.getIoWriteLatency()) ) )
 && ( (this.getIoMiscRequests()==castOther.getIoMiscRequests()) || ( this.getIoMiscRequests()!=null && castOther.getIoMiscRequests()!=null && this.getIoMiscRequests().equals(castOther.getIoMiscRequests()) ) )
 && ( (this.getIoMiscLatency()==castOther.getIoMiscLatency()) || ( this.getIoMiscLatency()!=null && castOther.getIoMiscLatency()!=null && this.getIoMiscLatency().equals(castOther.getIoMiscLatency()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTableSchema() == null ? 0 : this.getTableSchema().hashCode() );
         result = 37 * result + ( getTableName() == null ? 0 : this.getTableName().hashCode() );
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getRowsFetched();
         result = 37 * result + (int) this.getFetchLatency();
         result = 37 * result + (int) this.getRowsInserted();
         result = 37 * result + (int) this.getInsertLatency();
         result = 37 * result + (int) this.getRowsUpdated();
         result = 37 * result + (int) this.getUpdateLatency();
         result = 37 * result + (int) this.getRowsDeleted();
         result = 37 * result + (int) this.getDeleteLatency();
         result = 37 * result + ( getIoReadRequests() == null ? 0 : this.getIoReadRequests().hashCode() );
         result = 37 * result + ( getIoRead() == null ? 0 : this.getIoRead().hashCode() );
         result = 37 * result + ( getIoReadLatency() == null ? 0 : this.getIoReadLatency().hashCode() );
         result = 37 * result + ( getIoWriteRequests() == null ? 0 : this.getIoWriteRequests().hashCode() );
         result = 37 * result + ( getIoWrite() == null ? 0 : this.getIoWrite().hashCode() );
         result = 37 * result + ( getIoWriteLatency() == null ? 0 : this.getIoWriteLatency().hashCode() );
         result = 37 * result + ( getIoMiscRequests() == null ? 0 : this.getIoMiscRequests().hashCode() );
         result = 37 * result + ( getIoMiscLatency() == null ? 0 : this.getIoMiscLatency().hashCode() );
         return result;
   }   


}

