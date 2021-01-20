// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final


import X.latestFileIoId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.latestFileIo generated by hbm2java
 */
@Entity
@Table(name="x$latest_file_io"
    ,catalog="sys"
)
public class X.latestFileIo  implements java.io.Serializable {


     private X.latestFileIoId id;

    public X.latestFileIo() {
    }

    public X.latestFileIo(X.latestFileIoId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="thread", column=@Column(name="thread", length=316) ), 
        @AttributeOverride(name="file", column=@Column(name="file", length=512) ), 
        @AttributeOverride(name="latency", column=@Column(name="latency") ), 
        @AttributeOverride(name="operation", column=@Column(name="operation", nullable=false, length=32) ), 
        @AttributeOverride(name="requested", column=@Column(name="requested") ) } )
    public X.latestFileIoId getId() {
        return this.id;
    }
    
    public void setId(X.latestFileIoId id) {
        this.id = id;
    }




}


