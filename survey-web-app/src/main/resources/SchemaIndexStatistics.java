// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SchemaIndexStatistics generated by hbm2java
 */
@Entity
@Table(name = "schema_index_statistics", catalog = "sys")
public class SchemaIndexStatistics implements java.io.Serializable {

	private SchemaIndexStatisticsId id;

	public SchemaIndexStatistics() {
	}

	public SchemaIndexStatistics(SchemaIndexStatisticsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tableSchema", column = @Column(name = "table_schema", length = 64)),
			@AttributeOverride(name = "tableName", column = @Column(name = "table_name", length = 64)),
			@AttributeOverride(name = "indexName", column = @Column(name = "index_name", length = 64)),
			@AttributeOverride(name = "rowsSelected", column = @Column(name = "rows_selected", nullable = false)),
			@AttributeOverride(name = "selectLatency", column = @Column(name = "select_latency", length = 65535)),
			@AttributeOverride(name = "rowsInserted", column = @Column(name = "rows_inserted", nullable = false)),
			@AttributeOverride(name = "insertLatency", column = @Column(name = "insert_latency", length = 65535)),
			@AttributeOverride(name = "rowsUpdated", column = @Column(name = "rows_updated", nullable = false)),
			@AttributeOverride(name = "updateLatency", column = @Column(name = "update_latency", length = 65535)),
			@AttributeOverride(name = "rowsDeleted", column = @Column(name = "rows_deleted", nullable = false)),
			@AttributeOverride(name = "deleteLatency", column = @Column(name = "delete_latency", length = 65535)) })
	public SchemaIndexStatisticsId getId() {
		return this.id;
	}

	public void setId(SchemaIndexStatisticsId id) {
		this.id = id;
	}

}
