// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SchemaObjectOverview generated by hbm2java
 */
@Entity
@Table(name = "schema_object_overview", catalog = "sys")
public class SchemaObjectOverview implements java.io.Serializable {

	private SchemaObjectOverviewId id;

	public SchemaObjectOverview() {
	}

	public SchemaObjectOverview(SchemaObjectOverviewId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "db", column = @Column(name = "db", length = 64)),
			@AttributeOverride(name = "objectType", column = @Column(name = "object_type", length = 19)),
			@AttributeOverride(name = "count", column = @Column(name = "count", nullable = false)) })
	public SchemaObjectOverviewId getId() {
		return this.id;
	}

	public void setId(SchemaObjectOverviewId id) {
		this.id = id;
	}

}
