// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final


import X.ioGlobalByFileByLatencyId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.ioGlobalByFileByLatency generated by hbm2java
 */
@Entity
@Table(name="x$io_global_by_file_by_latency"
    ,catalog="sys"
)
public class X.ioGlobalByFileByLatency  implements java.io.Serializable {


     private X.ioGlobalByFileByLatencyId id;

    public X.ioGlobalByFileByLatency() {
    }

    public X.ioGlobalByFileByLatency(X.ioGlobalByFileByLatencyId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="file", column=@Column(name="file", nullable=false, length=512) ), 
        @AttributeOverride(name="total", column=@Column(name="total", nullable=false) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", nullable=false) ), 
        @AttributeOverride(name="countRead", column=@Column(name="count_read", nullable=false) ), 
        @AttributeOverride(name="readLatency", column=@Column(name="read_latency", nullable=false) ), 
        @AttributeOverride(name="countWrite", column=@Column(name="count_write", nullable=false) ), 
        @AttributeOverride(name="writeLatency", column=@Column(name="write_latency", nullable=false) ), 
        @AttributeOverride(name="countMisc", column=@Column(name="count_misc", nullable=false) ), 
        @AttributeOverride(name="miscLatency", column=@Column(name="misc_latency", nullable=false) ) } )
    public X.ioGlobalByFileByLatencyId getId() {
        return this.id;
    }
    
    public void setId(X.ioGlobalByFileByLatencyId id) {
        this.id = id;
    }




}


