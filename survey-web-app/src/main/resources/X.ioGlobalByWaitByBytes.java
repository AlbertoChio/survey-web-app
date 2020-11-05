// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final


import X.ioGlobalByWaitByBytesId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.ioGlobalByWaitByBytes generated by hbm2java
 */
@Entity
@Table(name="x$io_global_by_wait_by_bytes"
    ,catalog="sys"
)
public class X.ioGlobalByWaitByBytes  implements java.io.Serializable {


     private X.ioGlobalByWaitByBytesId id;

    public X.ioGlobalByWaitByBytes() {
    }

    public X.ioGlobalByWaitByBytes(X.ioGlobalByWaitByBytesId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="eventName", column=@Column(name="event_name", length=128) ), 
        @AttributeOverride(name="total", column=@Column(name="total", nullable=false) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", nullable=false) ), 
        @AttributeOverride(name="minLatency", column=@Column(name="min_latency", nullable=false) ), 
        @AttributeOverride(name="avgLatency", column=@Column(name="avg_latency", nullable=false) ), 
        @AttributeOverride(name="maxLatency", column=@Column(name="max_latency", nullable=false) ), 
        @AttributeOverride(name="countRead", column=@Column(name="count_read", nullable=false) ), 
        @AttributeOverride(name="totalRead", column=@Column(name="total_read", nullable=false) ), 
        @AttributeOverride(name="avgRead", column=@Column(name="avg_read", nullable=false, precision=23, scale=4) ), 
        @AttributeOverride(name="countWrite", column=@Column(name="count_write", nullable=false) ), 
        @AttributeOverride(name="totalWritten", column=@Column(name="total_written", nullable=false) ), 
        @AttributeOverride(name="avgWritten", column=@Column(name="avg_written", nullable=false, precision=23, scale=4) ), 
        @AttributeOverride(name="totalRequested", column=@Column(name="total_requested", nullable=false) ) } )
    public X.ioGlobalByWaitByBytesId getId() {
        return this.id;
    }
    
    public void setId(X.ioGlobalByWaitByBytesId id) {
        this.id = id;
    }




}


