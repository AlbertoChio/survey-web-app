// default package
// Generated 28 dic 2020 19:50:55 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * InnodbBufferStatsBySchema generated by hbm2java
 */
@Entity
@Table(name = "innodb_buffer_stats_by_schema", catalog = "sys")
public class InnodbBufferStatsBySchema implements java.io.Serializable {

	private InnodbBufferStatsBySchemaId id;

	public InnodbBufferStatsBySchema() {
	}

	public InnodbBufferStatsBySchema(InnodbBufferStatsBySchemaId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "objectSchema", column = @Column(name = "object_schema", length = 65535)),
			@AttributeOverride(name = "allocated", column = @Column(name = "allocated", length = 65535)),
			@AttributeOverride(name = "data", column = @Column(name = "data", length = 65535)),
			@AttributeOverride(name = "pages", column = @Column(name = "pages", nullable = false)),
			@AttributeOverride(name = "pagesHashed", column = @Column(name = "pages_hashed", nullable = false)),
			@AttributeOverride(name = "pagesOld", column = @Column(name = "pages_old", nullable = false)),
			@AttributeOverride(name = "rowsCached", column = @Column(name = "rows_cached", precision = 44, scale = 0)) })
	public InnodbBufferStatsBySchemaId getId() {
		return this.id;
	}

	public void setId(InnodbBufferStatsBySchemaId id) {
		this.id = id;
	}

}
