// default package
// Generated 19 oct 2020 21:12:21 by Hibernate Tools 5.1.10.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.userSummaryByFileIoTypeId generated by hbm2java
 */
@Embeddable
public class X.userSummaryByFileIoTypeId  implements java.io.Serializable {


     private String user;
     private String eventName;
     private long total;
     private long latency;
     private long maxLatency;

    public X.userSummaryByFileIoTypeId() {
    }

	
    public X.userSummaryByFileIoTypeId(String eventName, long total, long latency, long maxLatency) {
        this.eventName = eventName;
        this.total = total;
        this.latency = latency;
        this.maxLatency = maxLatency;
    }
    public X.userSummaryByFileIoTypeId(String user, String eventName, long total, long latency, long maxLatency) {
       this.user = user;
       this.eventName = eventName;
       this.total = total;
       this.latency = latency;
       this.maxLatency = maxLatency;
    }
   


    @Column(name="user", length=32)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }


    @Column(name="event_name", nullable=false, length=128)
    public String getEventName() {
        return this.eventName;
    }
    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    @Column(name="total", nullable=false)
    public long getTotal() {
        return this.total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }


    @Column(name="latency", nullable=false)
    public long getLatency() {
        return this.latency;
    }
    
    public void setLatency(long latency) {
        this.latency = latency;
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
		 if ( !(other instanceof X.userSummaryByFileIoTypeId) ) return false;
		 X.userSummaryByFileIoTypeId castOther = ( X.userSummaryByFileIoTypeId ) other; 
         
		 return ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getEventName()==castOther.getEventName()) || ( this.getEventName()!=null && castOther.getEventName()!=null && this.getEventName().equals(castOther.getEventName()) ) )
 && (this.getTotal()==castOther.getTotal())
 && (this.getLatency()==castOther.getLatency())
 && (this.getMaxLatency()==castOther.getMaxLatency());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getEventName() == null ? 0 : this.getEventName().hashCode() );
         result = 37 * result + (int) this.getTotal();
         result = 37 * result + (int) this.getLatency();
         result = 37 * result + (int) this.getMaxLatency();
         return result;
   }   


}


