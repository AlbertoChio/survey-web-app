// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final


import X.hostSummaryByFileIoTypeId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.hostSummaryByFileIoType generated by hbm2java
 */
@Entity
@Table(name="x$host_summary_by_file_io_type"
    ,catalog="sys"
)
public class X.hostSummaryByFileIoType  implements java.io.Serializable {


     private X.hostSummaryByFileIoTypeId id;

    public X.hostSummaryByFileIoType() {
    }

    public X.hostSummaryByFileIoType(X.hostSummaryByFileIoTypeId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="host") ), 
        @AttributeOverride(name="eventName", column=@Column(name="event_name", nullable=false, length=128) ), 
        @AttributeOverride(name="total", column=@Column(name="total", nullable=false) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", nullable=false) ), 
        @AttributeOverride(name="maxLatency", column=@Column(name="max_latency", nullable=false) ) } )
    public X.hostSummaryByFileIoTypeId getId() {
        return this.id;
    }
    
    public void setId(X.hostSummaryByFileIoTypeId id) {
        this.id = id;
    }




}


