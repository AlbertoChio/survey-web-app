// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.userSummaryByStatementTypeId generated by hbm2java
 */
@Embeddable
public class X.userSummaryByStatementTypeId  implements java.io.Serializable {


     private String user;
     private String statement;
     private long total;
     private long totalLatency;
     private long maxLatency;
     private long lockLatency;
     private long rowsSent;
     private long rowsExamined;
     private long rowsAffected;
     private long fullScans;

    public X.userSummaryByStatementTypeId() {
    }

	
    public X.userSummaryByStatementTypeId(long total, long totalLatency, long maxLatency, long lockLatency, long rowsSent, long rowsExamined, long rowsAffected, long fullScans) {
        this.total = total;
        this.totalLatency = totalLatency;
        this.maxLatency = maxLatency;
        this.lockLatency = lockLatency;
        this.rowsSent = rowsSent;
        this.rowsExamined = rowsExamined;
        this.rowsAffected = rowsAffected;
        this.fullScans = fullScans;
    }
    public X.userSummaryByStatementTypeId(String user, String statement, long total, long totalLatency, long maxLatency, long lockLatency, long rowsSent, long rowsExamined, long rowsAffected, long fullScans) {
       this.user = user;
       this.statement = statement;
       this.total = total;
       this.totalLatency = totalLatency;
       this.maxLatency = maxLatency;
       this.lockLatency = lockLatency;
       this.rowsSent = rowsSent;
       this.rowsExamined = rowsExamined;
       this.rowsAffected = rowsAffected;
       this.fullScans = fullScans;
    }
   


    @Column(name="user", length=32)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }


    @Column(name="statement", length=128)
    public String getStatement() {
        return this.statement;
    }
    
    public void setStatement(String statement) {
        this.statement = statement;
    }


    @Column(name="total", nullable=false)
    public long getTotal() {
        return this.total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }


    @Column(name="total_latency", nullable=false)
    public long getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }


    @Column(name="max_latency", nullable=false)
    public long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }


    @Column(name="lock_latency", nullable=false)
    public long getLockLatency() {
        return this.lockLatency;
    }
    
    public void setLockLatency(long lockLatency) {
        this.lockLatency = lockLatency;
    }


    @Column(name="rows_sent", nullable=false)
    public long getRowsSent() {
        return this.rowsSent;
    }
    
    public void setRowsSent(long rowsSent) {
        this.rowsSent = rowsSent;
    }


    @Column(name="rows_examined", nullable=false)
    public long getRowsExamined() {
        return this.rowsExamined;
    }
    
    public void setRowsExamined(long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }


    @Column(name="rows_affected", nullable=false)
    public long getRowsAffected() {
        return this.rowsAffected;
    }
    
    public void setRowsAffected(long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }


    @Column(name="full_scans", nullable=false)
    public long getFullScans() {
        return this.fullScans;
    }
    
    public void setFullScans(long fullScans) {
        this.fullScans = fullScans;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.userSummaryByStatementTypeId) ) return false;
		 X.userSummaryByStatementTypeId castOther = ( X.userSummaryByStatementTypeId ) other; 
         
		 return ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getStatement()==castOther.getStatement()) || ( this.getStatement()!=null && castOther.getStatement()!=null && this.getStatement().equals(castOther.getStatement()) ) )
 && (this.getTotal()==castOther.getTotal())
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getMaxLatency()==castOther.getMaxLatency())
 && (this.getLockLatency()==castOther.getLockLatency())
 && (this.getRowsSent()==castOther.getRowsSent())
 && (this.getRowsExamined()==castOther.getRowsExamined())
 && (this.getRowsAffected()==castOther.getRowsAffected())
 && (this.getFullScans()==castOther.getFullScans());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getStatement() == null ? 0 : this.getStatement().hashCode() );
         result = 37 * result + (int) this.getTotal();
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getMaxLatency();
         result = 37 * result + (int) this.getLockLatency();
         result = 37 * result + (int) this.getRowsSent();
         result = 37 * result + (int) this.getRowsExamined();
         result = 37 * result + (int) this.getRowsAffected();
         result = 37 * result + (int) this.getFullScans();
         return result;
   }   


}


