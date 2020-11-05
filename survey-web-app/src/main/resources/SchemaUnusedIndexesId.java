// default package
// Generated 21 oct 2020 17:29:49 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SchemaUnusedIndexesId generated by hbm2java
 */
@Embeddable
public class SchemaUnusedIndexesId implements java.io.Serializable {

	private String objectSchema;
	private String objectName;
	private String indexName;

	public SchemaUnusedIndexesId() {
	}

	public SchemaUnusedIndexesId(String objectSchema, String objectName, String indexName) {
		this.objectSchema = objectSchema;
		this.objectName = objectName;
		this.indexName = indexName;
	}

	@Column(name = "object_schema", length = 64)
	public String getObjectSchema() {
		return this.objectSchema;
	}

	public void setObjectSchema(String objectSchema) {
		this.objectSchema = objectSchema;
	}

	@Column(name = "object_name", length = 64)
	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	@Column(name = "index_name", length = 64)
	public String getIndexName() {
		return this.indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SchemaUnusedIndexesId))
			return false;
		SchemaUnusedIndexesId castOther = (SchemaUnusedIndexesId) other;

		return ((this.getObjectSchema() == castOther.getObjectSchema()) || (this.getObjectSchema() != null
				&& castOther.getObjectSchema() != null && this.getObjectSchema().equals(castOther.getObjectSchema())))
				&& ((this.getObjectName() == castOther.getObjectName()) || (this.getObjectName() != null
						&& castOther.getObjectName() != null && this.getObjectName().equals(castOther.getObjectName())))
				&& ((this.getIndexName() == castOther.getIndexName()) || (this.getIndexName() != null
						&& castOther.getIndexName() != null && this.getIndexName().equals(castOther.getIndexName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getObjectSchema() == null ? 0 : this.getObjectSchema().hashCode());
		result = 37 * result + (getObjectName() == null ? 0 : this.getObjectName().hashCode());
		result = 37 * result + (getIndexName() == null ? 0 : this.getIndexName().hashCode());
		return result;
	}

}
