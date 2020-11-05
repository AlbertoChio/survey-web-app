// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final


import X.schemaIndexStatisticsId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.schemaIndexStatistics generated by hbm2java
 */
@Entity
@Table(name="x$schema_index_statistics"
    ,catalog="sys"
)
public class X.schemaIndexStatistics  implements java.io.Serializable {


     private X.schemaIndexStatisticsId id;

    public X.schemaIndexStatistics() {
    }

    public X.schemaIndexStatistics(X.schemaIndexStatisticsId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="tableSchema", column=@Column(name="table_schema", length=64) ), 
        @AttributeOverride(name="tableName", column=@Column(name="table_name", length=64) ), 
        @AttributeOverride(name="indexName", column=@Column(name="index_name", length=64) ), 
        @AttributeOverride(name="rowsSelected", column=@Column(name="rows_selected", nullable=false) ), 
        @AttributeOverride(name="selectLatency", column=@Column(name="select_latency", nullable=false) ), 
        @AttributeOverride(name="rowsInserted", column=@Column(name="rows_inserted", nullable=false) ), 
        @AttributeOverride(name="insertLatency", column=@Column(name="insert_latency", nullable=false) ), 
        @AttributeOverride(name="rowsUpdated", column=@Column(name="rows_updated", nullable=false) ), 
        @AttributeOverride(name="updateLatency", column=@Column(name="update_latency", nullable=false) ), 
        @AttributeOverride(name="rowsDeleted", column=@Column(name="rows_deleted", nullable=false) ), 
        @AttributeOverride(name="deleteLatency", column=@Column(name="delete_latency", nullable=false) ) } )
    public X.schemaIndexStatisticsId getId() {
        return this.id;
    }
    
    public void setId(X.schemaIndexStatisticsId id) {
        this.id = id;
    }




}


