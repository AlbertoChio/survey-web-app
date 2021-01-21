// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PsCheckLostInstrumentation generated by hbm2java
 */
@Entity
@Table(name = "ps_check_lost_instrumentation", catalog = "sys")
public class PsCheckLostInstrumentation implements java.io.Serializable {

	private PsCheckLostInstrumentationId id;

	public PsCheckLostInstrumentation() {
	}

	public PsCheckLostInstrumentation(PsCheckLostInstrumentationId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "variableName", column = @Column(name = "variable_name", nullable = false, length = 64)),
			@AttributeOverride(name = "variableValue", column = @Column(name = "variable_value", length = 1024)) })
	public PsCheckLostInstrumentationId getId() {
		return this.id;
	}

	public void setId(PsCheckLostInstrumentationId id) {
		this.id = id;
	}

}