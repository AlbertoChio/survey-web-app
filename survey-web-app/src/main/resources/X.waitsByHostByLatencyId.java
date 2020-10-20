// default package
// Generated 19 oct 2020 21:12:21 by Hibernate Tools 5.1.10.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.waitsByHostByLatencyId generated by hbm2java
 */
@Embeddable
public class X.waitsByHostByLatencyId  implements java.io.Serializable {


     private String host;
     private String event;
     private long total;
     private long totalLatency;
     private long avgLatency;
     private long maxLatency;

    public X.waitsByHostByLatencyId() {
    }

	
    public X.waitsByHostByLatencyId(String event, long total, long totalLatency, long avgLatency, long maxLatency) {
        this.event = event;
        this.total = total;
        this.totalLatency = totalLatency;
        this.avgLatency = avgLatency;
        this.maxLatency = maxLatency;
    }
    public X.waitsByHostByLatencyId(String host, String event, long total, long totalLatency, long avgLatency, long maxLatency) {
       this.host = host;
       this.event = event;
       this.total = total;
       this.totalLatency = totalLatency;
       this.avgLatency = avgLatency;
       this.maxLatency = maxLatency;
    }
   


    @Column(name="host")
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }


    @Column(name="event", nullable=false, length=128)
    public String getEvent() {
        return this.event;
    }
    
    public void setEvent(String event) {
        this.event = event;
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


    @Column(name="avg_latency", nullable=false)
    public long getAvgLatency() {
        return this.avgLatency;
    }
    
    public void setAvgLatency(long avgLatency) {
        this.avgLatency = avgLatency;
    }


    @Column(name="max_latency", nullable=false)
    public long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.waitsByHostByLatencyId) ) return false;
		 X.waitsByHostByLatencyId castOther = ( X.waitsByHostByLatencyId ) other; 
         
		 return ( (this.getHost()==castOther.getHost()) || ( this.getHost()!=null && castOther.getHost()!=null && this.getHost().equals(castOther.getHost()) ) )
 && ( (this.getEvent()==castOther.getEvent()) || ( this.getEvent()!=null && castOther.getEvent()!=null && this.getEvent().equals(castOther.getEvent()) ) )
 && (this.getTotal()==castOther.getTotal())
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getAvgLatency()==castOther.getAvgLatency())
 && (this.getMaxLatency()==castOther.getMaxLatency());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHost() == null ? 0 : this.getHost().hashCode() );
         result = 37 * result + ( getEvent() == null ? 0 : this.getEvent().hashCode() );
         result = 37 * result + (int) this.getTotal();
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getAvgLatency();
         result = 37 * result + (int) this.getMaxLatency();
         return result;
   }   


}


