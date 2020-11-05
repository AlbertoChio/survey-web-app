// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final


import X.innodbBufferStatsBySchemaId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.innodbBufferStatsBySchema generated by hbm2java
 */
@Entity
@Table(name="x$innodb_buffer_stats_by_schema"
    ,catalog="sys"
)
public class X.innodbBufferStatsBySchema  implements java.io.Serializable {


     private X.innodbBufferStatsBySchemaId id;

    public X.innodbBufferStatsBySchema() {
    }

    public X.innodbBufferStatsBySchema(X.innodbBufferStatsBySchemaId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="objectSchema", column=@Column(name="object_schema", length=65535) ), 
        @AttributeOverride(name="allocated", column=@Column(name="allocated", precision=43, scale=0) ), 
        @AttributeOverride(name="data", column=@Column(name="data", precision=43, scale=0) ), 
        @AttributeOverride(name="pages", column=@Column(name="pages", nullable=false) ), 
        @AttributeOverride(name="pagesHashed", column=@Column(name="pages_hashed", nullable=false) ), 
        @AttributeOverride(name="pagesOld", column=@Column(name="pages_old", nullable=false) ), 
        @AttributeOverride(name="rowsCached", column=@Column(name="rows_cached", nullable=false, precision=44, scale=0) ) } )
    public X.innodbBufferStatsBySchemaId getId() {
        return this.id;
    }
    
    public void setId(X.innodbBufferStatsBySchemaId id) {
        this.id = id;
    }




}


