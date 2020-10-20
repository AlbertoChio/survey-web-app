// default package
// Generated 19 oct 2020 21:12:21 by Hibernate Tools 5.1.10.Final


import X.statementsWithTempTablesId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.statementsWithTempTables generated by hbm2java
 */
@Entity
@Table(name="x$statements_with_temp_tables"
    ,catalog="sys"
)
public class X.statementsWithTempTables  implements java.io.Serializable {


     private X.statementsWithTempTablesId id;

    public X.statementsWithTempTables() {
    }

    public X.statementsWithTempTables(X.statementsWithTempTablesId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="query", column=@Column(name="query") ), 
        @AttributeOverride(name="db", column=@Column(name="db", length=64) ), 
        @AttributeOverride(name="execCount", column=@Column(name="exec_count", nullable=false) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", nullable=false) ), 
        @AttributeOverride(name="memoryTmpTables", column=@Column(name="memory_tmp_tables", nullable=false) ), 
        @AttributeOverride(name="diskTmpTables", column=@Column(name="disk_tmp_tables", nullable=false) ), 
        @AttributeOverride(name="avgTmpTablesPerQuery", column=@Column(name="avg_tmp_tables_per_query", nullable=false, precision=21, scale=0) ), 
        @AttributeOverride(name="tmpTablesToDiskPct", column=@Column(name="tmp_tables_to_disk_pct", nullable=false, precision=24, scale=0) ), 
        @AttributeOverride(name="firstSeen", column=@Column(name="first_seen", nullable=false, length=26) ), 
        @AttributeOverride(name="lastSeen", column=@Column(name="last_seen", nullable=false, length=26) ), 
        @AttributeOverride(name="digest", column=@Column(name="digest", length=64) ) } )
    public X.statementsWithTempTablesId getId() {
        return this.id;
    }
    
    public void setId(X.statementsWithTempTablesId id) {
        this.id = id;
    }




}


