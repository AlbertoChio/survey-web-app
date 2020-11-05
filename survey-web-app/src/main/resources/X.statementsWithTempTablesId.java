// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.statementsWithTempTablesId generated by hbm2java
 */
@Embeddable
public class X.statementsWithTempTablesId  implements java.io.Serializable {


     private String query;
     private String db;
     private long execCount;
     private long totalLatency;
     private long memoryTmpTables;
     private long diskTmpTables;
     private BigDecimal avgTmpTablesPerQuery;
     private BigDecimal tmpTablesToDiskPct;
     private Date firstSeen;
     private Date lastSeen;
     private String digest;

    public X.statementsWithTempTablesId() {
    }

	
    public X.statementsWithTempTablesId(long execCount, long totalLatency, long memoryTmpTables, long diskTmpTables, BigDecimal avgTmpTablesPerQuery, BigDecimal tmpTablesToDiskPct, Date firstSeen, Date lastSeen) {
        this.execCount = execCount;
        this.totalLatency = totalLatency;
        this.memoryTmpTables = memoryTmpTables;
        this.diskTmpTables = diskTmpTables;
        this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
        this.tmpTablesToDiskPct = tmpTablesToDiskPct;
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
    }
    public X.statementsWithTempTablesId(String query, String db, long execCount, long totalLatency, long memoryTmpTables, long diskTmpTables, BigDecimal avgTmpTablesPerQuery, BigDecimal tmpTablesToDiskPct, Date firstSeen, Date lastSeen, String digest) {
       this.query = query;
       this.db = db;
       this.execCount = execCount;
       this.totalLatency = totalLatency;
       this.memoryTmpTables = memoryTmpTables;
       this.diskTmpTables = diskTmpTables;
       this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
       this.tmpTablesToDiskPct = tmpTablesToDiskPct;
       this.firstSeen = firstSeen;
       this.lastSeen = lastSeen;
       this.digest = digest;
    }
   


    @Column(name="query")
    public String getQuery() {
        return this.query;
    }
    
    public void setQuery(String query) {
        this.query = query;
    }


    @Column(name="db", length=64)
    public String getDb() {
        return this.db;
    }
    
    public void setDb(String db) {
        this.db = db;
    }


    @Column(name="exec_count", nullable=false)
    public long getExecCount() {
        return this.execCount;
    }
    
    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }


    @Column(name="total_latency", nullable=false)
    public long getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="memory_tmp_tables", nullable=false)
    public long getMemoryTmpTables() {
        return this.memoryTmpTables;
    }
    
    public void setMemoryTmpTables(long memoryTmpTables) {
        this.memoryTmpTables = memoryTmpTables;
    }


    @Column(name="disk_tmp_tables", nullable=false)
    public long getDiskTmpTables() {
        return this.diskTmpTables;
    }
    
    public void setDiskTmpTables(long diskTmpTables) {
        this.diskTmpTables = diskTmpTables;
    }


    @Column(name="avg_tmp_tables_per_query", nullable=false, precision=21, scale=0)
    public BigDecimal getAvgTmpTablesPerQuery() {
        return this.avgTmpTablesPerQuery;
    }
    
    public void setAvgTmpTablesPerQuery(BigDecimal avgTmpTablesPerQuery) {
        this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
    }


    @Column(name="tmp_tables_to_disk_pct", nullable=false, precision=24, scale=0)
    public BigDecimal getTmpTablesToDiskPct() {
        return this.tmpTablesToDiskPct;
    }
    
    public void setTmpTablesToDiskPct(BigDecimal tmpTablesToDiskPct) {
        this.tmpTablesToDiskPct = tmpTablesToDiskPct;
    }


    @Column(name="first_seen", nullable=false, length=26)
    public Date getFirstSeen() {
        return this.firstSeen;
    }
    
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }


    @Column(name="last_seen", nullable=false, length=26)
    public Date getLastSeen() {
        return this.lastSeen;
    }
    
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }


    @Column(name="digest", length=64)
    public String getDigest() {
        return this.digest;
    }
    
    public void setDigest(String digest) {
        this.digest = digest;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.statementsWithTempTablesId) ) return false;
		 X.statementsWithTempTablesId castOther = ( X.statementsWithTempTablesId ) other; 
         
		 return ( (this.getQuery()==castOther.getQuery()) || ( this.getQuery()!=null && castOther.getQuery()!=null && this.getQuery().equals(castOther.getQuery()) ) )
 && ( (this.getDb()==castOther.getDb()) || ( this.getDb()!=null && castOther.getDb()!=null && this.getDb().equals(castOther.getDb()) ) )
 && (this.getExecCount()==castOther.getExecCount())
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getMemoryTmpTables()==castOther.getMemoryTmpTables())
 && (this.getDiskTmpTables()==castOther.getDiskTmpTables())
 && ( (this.getAvgTmpTablesPerQuery()==castOther.getAvgTmpTablesPerQuery()) || ( this.getAvgTmpTablesPerQuery()!=null && castOther.getAvgTmpTablesPerQuery()!=null && this.getAvgTmpTablesPerQuery().equals(castOther.getAvgTmpTablesPerQuery()) ) )
 && ( (this.getTmpTablesToDiskPct()==castOther.getTmpTablesToDiskPct()) || ( this.getTmpTablesToDiskPct()!=null && castOther.getTmpTablesToDiskPct()!=null && this.getTmpTablesToDiskPct().equals(castOther.getTmpTablesToDiskPct()) ) )
 && ( (this.getFirstSeen()==castOther.getFirstSeen()) || ( this.getFirstSeen()!=null && castOther.getFirstSeen()!=null && this.getFirstSeen().equals(castOther.getFirstSeen()) ) )
 && ( (this.getLastSeen()==castOther.getLastSeen()) || ( this.getLastSeen()!=null && castOther.getLastSeen()!=null && this.getLastSeen().equals(castOther.getLastSeen()) ) )
 && ( (this.getDigest()==castOther.getDigest()) || ( this.getDigest()!=null && castOther.getDigest()!=null && this.getDigest().equals(castOther.getDigest()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getQuery() == null ? 0 : this.getQuery().hashCode() );
         result = 37 * result + ( getDb() == null ? 0 : this.getDb().hashCode() );
         result = 37 * result + (int) this.getExecCount();
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getMemoryTmpTables();
         result = 37 * result + (int) this.getDiskTmpTables();
         result = 37 * result + ( getAvgTmpTablesPerQuery() == null ? 0 : this.getAvgTmpTablesPerQuery().hashCode() );
         result = 37 * result + ( getTmpTablesToDiskPct() == null ? 0 : this.getTmpTablesToDiskPct().hashCode() );
         result = 37 * result + ( getFirstSeen() == null ? 0 : this.getFirstSeen().hashCode() );
         result = 37 * result + ( getLastSeen() == null ? 0 : this.getLastSeen().hashCode() );
         result = 37 * result + ( getDigest() == null ? 0 : this.getDigest().hashCode() );
         return result;
   }   


}


