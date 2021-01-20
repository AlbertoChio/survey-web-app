// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * X.memoryByUserByCurrentBytesId generated by hbm2java
 */
@Embeddable
public class X.memoryByUserByCurrentBytesId  implements java.io.Serializable {


     private String user;
     private BigDecimal currentCountUsed;
     private BigDecimal currentAllocated;
     private BigDecimal currentAvgAlloc;
     private Long currentMaxAlloc;
     private BigDecimal totalAllocated;

    public X.memoryByUserByCurrentBytesId() {
    }

	
    public X.memoryByUserByCurrentBytesId(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }
    public X.memoryByUserByCurrentBytesId(String user, BigDecimal currentCountUsed, BigDecimal currentAllocated, BigDecimal currentAvgAlloc, Long currentMaxAlloc, BigDecimal totalAllocated) {
       this.user = user;
       this.currentCountUsed = currentCountUsed;
       this.currentAllocated = currentAllocated;
       this.currentAvgAlloc = currentAvgAlloc;
       this.currentMaxAlloc = currentMaxAlloc;
       this.totalAllocated = totalAllocated;
    }
   


    @Column(name="user", length=32)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }


    @Column(name="current_count_used", precision=41, scale=0)
    public BigDecimal getCurrentCountUsed() {
        return this.currentCountUsed;
    }
    
    public void setCurrentCountUsed(BigDecimal currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }


    @Column(name="current_allocated", precision=41, scale=0)
    public BigDecimal getCurrentAllocated() {
        return this.currentAllocated;
    }
    
    public void setCurrentAllocated(BigDecimal currentAllocated) {
        this.currentAllocated = currentAllocated;
    }


    @Column(name="current_avg_alloc", nullable=false, precision=45, scale=4)
    public BigDecimal getCurrentAvgAlloc() {
        return this.currentAvgAlloc;
    }
    
    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }


    @Column(name="current_max_alloc")
    public Long getCurrentMaxAlloc() {
        return this.currentMaxAlloc;
    }
    
    public void setCurrentMaxAlloc(Long currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc;
    }


    @Column(name="total_allocated", precision=42, scale=0)
    public BigDecimal getTotalAllocated() {
        return this.totalAllocated;
    }
    
    public void setTotalAllocated(BigDecimal totalAllocated) {
        this.totalAllocated = totalAllocated;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.memoryByUserByCurrentBytesId) ) return false;
		 X.memoryByUserByCurrentBytesId castOther = ( X.memoryByUserByCurrentBytesId ) other; 
         
		 return ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getCurrentCountUsed()==castOther.getCurrentCountUsed()) || ( this.getCurrentCountUsed()!=null && castOther.getCurrentCountUsed()!=null && this.getCurrentCountUsed().equals(castOther.getCurrentCountUsed()) ) )
 && ( (this.getCurrentAllocated()==castOther.getCurrentAllocated()) || ( this.getCurrentAllocated()!=null && castOther.getCurrentAllocated()!=null && this.getCurrentAllocated().equals(castOther.getCurrentAllocated()) ) )
 && ( (this.getCurrentAvgAlloc()==castOther.getCurrentAvgAlloc()) || ( this.getCurrentAvgAlloc()!=null && castOther.getCurrentAvgAlloc()!=null && this.getCurrentAvgAlloc().equals(castOther.getCurrentAvgAlloc()) ) )
 && ( (this.getCurrentMaxAlloc()==castOther.getCurrentMaxAlloc()) || ( this.getCurrentMaxAlloc()!=null && castOther.getCurrentMaxAlloc()!=null && this.getCurrentMaxAlloc().equals(castOther.getCurrentMaxAlloc()) ) )
 && ( (this.getTotalAllocated()==castOther.getTotalAllocated()) || ( this.getTotalAllocated()!=null && castOther.getTotalAllocated()!=null && this.getTotalAllocated().equals(castOther.getTotalAllocated()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getCurrentCountUsed() == null ? 0 : this.getCurrentCountUsed().hashCode() );
         result = 37 * result + ( getCurrentAllocated() == null ? 0 : this.getCurrentAllocated().hashCode() );
         result = 37 * result + ( getCurrentAvgAlloc() == null ? 0 : this.getCurrentAvgAlloc().hashCode() );
         result = 37 * result + ( getCurrentMaxAlloc() == null ? 0 : this.getCurrentMaxAlloc().hashCode() );
         result = 37 * result + ( getTotalAllocated() == null ? 0 : this.getTotalAllocated().hashCode() );
         return result;
   }   


}


