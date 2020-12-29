// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final


import X.hostSummaryByStatementLatencyId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.hostSummaryByStatementLatency generated by hbm2java
 */
@Entity
@Table(name="x$host_summary_by_statement_latency"
    ,catalog="sys"
)
public class X.hostSummaryByStatementLatency  implements java.io.Serializable {


     private X.hostSummaryByStatementLatencyId id;

    public X.hostSummaryByStatementLatency() {
    }

    public X.hostSummaryByStatementLatency(X.hostSummaryByStatementLatencyId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="host") ), 
        @AttributeOverride(name="total", column=@Column(name="total", precision=42, scale=0) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", precision=42, scale=0) ), 
        @AttributeOverride(name="maxLatency", column=@Column(name="max_latency") ), 
        @AttributeOverride(name="lockLatency", column=@Column(name="lock_latency", precision=42, scale=0) ), 
        @AttributeOverride(name="rowsSent", column=@Column(name="rows_sent", precision=42, scale=0) ), 
        @AttributeOverride(name="rowsExamined", column=@Column(name="rows_examined", precision=42, scale=0) ), 
        @AttributeOverride(name="rowsAffected", column=@Column(name="rows_affected", precision=42, scale=0) ), 
        @AttributeOverride(name="fullScans", column=@Column(name="full_scans", precision=43, scale=0) ) } )
    public X.hostSummaryByStatementLatencyId getId() {
        return this.id;
    }
    
    public void setId(X.hostSummaryByStatementLatencyId id) {
        this.id = id;
    }




}


