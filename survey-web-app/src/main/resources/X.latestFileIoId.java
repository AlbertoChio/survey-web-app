// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.latestFileIoId generated by hbm2java
 */
@Embeddable
public class X.latestFileIoId  implements java.io.Serializable {


     private String thread;
     private String file;
     private Long latency;
     private String operation;
     private Long requested;

    public X.latestFileIoId() {
    }

	
    public X.latestFileIoId(String operation) {
        this.operation = operation;
    }
    public X.latestFileIoId(String thread, String file, Long latency, String operation, Long requested) {
       this.thread = thread;
       this.file = file;
       this.latency = latency;
       this.operation = operation;
       this.requested = requested;
    }
   


    @Column(name="thread", length=316)
    public String getThread() {
        return this.thread;
    }
    
    public void setThread(String thread) {
        this.thread = thread;
    }


    @Column(name="file", length=512)
    public String getFile() {
        return this.file;
    }
    
    public void setFile(String file) {
        this.file = file;
    }


    @Column(name="latency")
    public Long getLatency() {
        return this.latency;
    }
    
    public void setLatency(Long latency) {
        this.latency = latency;
    }


    @Column(name="operation", nullable=false, length=32)
    public String getOperation() {
        return this.operation;
    }
    
    public void setOperation(String operation) {
        this.operation = operation;
    }


    @Column(name="requested")
    public Long getRequested() {
        return this.requested;
    }
    
    public void setRequested(Long requested) {
        this.requested = requested;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.latestFileIoId) ) return false;
		 X.latestFileIoId castOther = ( X.latestFileIoId ) other; 
         
		 return ( (this.getThread()==castOther.getThread()) || ( this.getThread()!=null && castOther.getThread()!=null && this.getThread().equals(castOther.getThread()) ) )
 && ( (this.getFile()==castOther.getFile()) || ( this.getFile()!=null && castOther.getFile()!=null && this.getFile().equals(castOther.getFile()) ) )
 && ( (this.getLatency()==castOther.getLatency()) || ( this.getLatency()!=null && castOther.getLatency()!=null && this.getLatency().equals(castOther.getLatency()) ) )
 && ( (this.getOperation()==castOther.getOperation()) || ( this.getOperation()!=null && castOther.getOperation()!=null && this.getOperation().equals(castOther.getOperation()) ) )
 && ( (this.getRequested()==castOther.getRequested()) || ( this.getRequested()!=null && castOther.getRequested()!=null && this.getRequested().equals(castOther.getRequested()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getThread() == null ? 0 : this.getThread().hashCode() );
         result = 37 * result + ( getFile() == null ? 0 : this.getFile().hashCode() );
         result = 37 * result + ( getLatency() == null ? 0 : this.getLatency().hashCode() );
         result = 37 * result + ( getOperation() == null ? 0 : this.getOperation().hashCode() );
         result = 37 * result + ( getRequested() == null ? 0 : this.getRequested().hashCode() );
         return result;
   }   


}


