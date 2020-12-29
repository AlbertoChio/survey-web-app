// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final


import X.statementsWithSortingId;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * X.statementsWithSorting generated by hbm2java
 */
@Entity
@Table(name="x$statements_with_sorting"
    ,catalog="sys"
)
public class X.statementsWithSorting  implements java.io.Serializable {


     private X.statementsWithSortingId id;

    public X.statementsWithSorting() {
    }

    public X.statementsWithSorting(X.statementsWithSortingId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="query", column=@Column(name="query") ), 
        @AttributeOverride(name="db", column=@Column(name="db", length=64) ), 
        @AttributeOverride(name="execCount", column=@Column(name="exec_count", nullable=false) ), 
        @AttributeOverride(name="totalLatency", column=@Column(name="total_latency", nullable=false) ), 
        @AttributeOverride(name="sortMergePasses", column=@Column(name="sort_merge_passes", nullable=false) ), 
        @AttributeOverride(name="avgSortMerges", column=@Column(name="avg_sort_merges", nullable=false, precision=21, scale=0) ), 
        @AttributeOverride(name="sortsUsingScans", column=@Column(name="sorts_using_scans", nullable=false) ), 
        @AttributeOverride(name="sortUsingRange", column=@Column(name="sort_using_range", nullable=false) ), 
        @AttributeOverride(name="rowsSorted", column=@Column(name="rows_sorted", nullable=false) ), 
        @AttributeOverride(name="avgRowsSorted", column=@Column(name="avg_rows_sorted", nullable=false, precision=21, scale=0) ), 
        @AttributeOverride(name="firstSeen", column=@Column(name="first_seen", nullable=false, length=26) ), 
        @AttributeOverride(name="lastSeen", column=@Column(name="last_seen", nullable=false, length=26) ), 
        @AttributeOverride(name="digest", column=@Column(name="digest", length=64) ) } )
    public X.statementsWithSortingId getId() {
        return this.id;
    }
    
    public void setId(X.statementsWithSortingId id) {
        this.id = id;
    }




}


