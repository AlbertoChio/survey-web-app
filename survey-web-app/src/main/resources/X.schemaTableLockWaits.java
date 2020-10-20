// default package
// Generated 19 oct 2020 21:12:21 by Hibernate Tools 5.1.10.Final


import X.schemaTableLockWaitsId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.schemaTableLockWaits generated by hbm2java
 */
@Entity
@Table(name="x$schema_table_lock_waits"
    ,catalog="sys"
)
public class X.schemaTableLockWaits  implements java.io.Serializable {


     private X.schemaTableLockWaitsId id;

    public X.schemaTableLockWaits() {
    }

    public X.schemaTableLockWaits(X.schemaTableLockWaitsId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="objectSchema", column=@Column(name="object_schema", length=64) ), 
        @AttributeOverride(name="objectName", column=@Column(name="object_name", length=64) ), 
        @AttributeOverride(name="waitingThreadId", column=@Column(name="waiting_thread_id", nullable=false) ), 
        @AttributeOverride(name="waitingPid", column=@Column(name="waiting_pid") ), 
        @AttributeOverride(name="waitingAccount", column=@Column(name="waiting_account", length=65535) ), 
        @AttributeOverride(name="waitingLockType", column=@Column(name="waiting_lock_type", nullable=false, length=32) ), 
        @AttributeOverride(name="waitingLockDuration", column=@Column(name="waiting_lock_duration", nullable=false, length=32) ), 
        @AttributeOverride(name="waitingQuery", column=@Column(name="waiting_query") ), 
        @AttributeOverride(name="waitingQuerySecs", column=@Column(name="waiting_query_secs") ), 
        @AttributeOverride(name="waitingQueryRowsAffected", column=@Column(name="waiting_query_rows_affected") ), 
        @AttributeOverride(name="waitingQueryRowsExamined", column=@Column(name="waiting_query_rows_examined") ), 
        @AttributeOverride(name="blockingThreadId", column=@Column(name="blocking_thread_id", nullable=false) ), 
        @AttributeOverride(name="blockingPid", column=@Column(name="blocking_pid") ), 
        @AttributeOverride(name="blockingAccount", column=@Column(name="blocking_account", length=65535) ), 
        @AttributeOverride(name="blockingLockType", column=@Column(name="blocking_lock_type", nullable=false, length=32) ), 
        @AttributeOverride(name="blockingLockDuration", column=@Column(name="blocking_lock_duration", nullable=false, length=32) ), 
        @AttributeOverride(name="sqlKillBlockingQuery", column=@Column(name="sql_kill_blocking_query", length=31) ), 
        @AttributeOverride(name="sqlKillBlockingConnection", column=@Column(name="sql_kill_blocking_connection", length=25) ) } )
    public X.schemaTableLockWaitsId getId() {
        return this.id;
    }
    
    public void setId(X.schemaTableLockWaitsId id) {
        this.id = id;
    }




}


