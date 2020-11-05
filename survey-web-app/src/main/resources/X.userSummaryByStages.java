// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final


import X.userSummaryByStagesId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.userSummaryByStages generated by hbm2java
 */
@Entity
@Table(name="x$user_summary_by_stages"
    ,catalog="sys"
)
public class X.userSummaryByStages  implements java.io.Serializable {


     private X.userSummaryByStagesId id;

    public X.userSummaryByStages() {
    }

    public X.userSummaryByStages(X.userSummaryByStagesId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="user", column=@Column(name="user", length=32) ), 
        @AttributeOverride(name="eventName", column=@Column(name="event_name", nullable=false, length=128) ), 
        @AttributeOverride(name="total", column=@Column(name="total", nullable=false) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", nullable=false) ), 
        @AttributeOverride(name="avgLatency", column=@Column(name="avg_latency", nullable=false) ) } )
    public X.userSummaryByStagesId getId() {
        return this.id;
    }
    
    public void setId(X.userSummaryByStagesId id) {
        this.id = id;
    }




}


