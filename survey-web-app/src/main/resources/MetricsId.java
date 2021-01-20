// default package
// Generated 19 ene 2021 3:30:01 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MetricsId generated by hbm2java
 */
@Embeddable
public class MetricsId implements java.io.Serializable {

	private String variableName;
	private String variableValue;
	private String type;
	private String enabled;

	public MetricsId() {
	}

	public MetricsId(String variableName, String type, String enabled) {
		this.variableName = variableName;
		this.type = type;
		this.enabled = enabled;
	}

	public MetricsId(String variableName, String variableValue, String type, String enabled) {
		this.variableName = variableName;
		this.variableValue = variableValue;
		this.type = type;
		this.enabled = enabled;
	}

	@Column(name = "Variable_name", nullable = false, length = 193)
	public String getVariableName() {
		return this.variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	@Column(name = "Variable_value", length = 65535)
	public String getVariableValue() {
		return this.variableValue;
	}

	public void setVariableValue(String variableValue) {
		this.variableValue = variableValue;
	}

	@Column(name = "Type", nullable = false, length = 210)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "Enabled", nullable = false, length = 7)
	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MetricsId))
			return false;
		MetricsId castOther = (MetricsId) other;

		return ((this.getVariableName() == castOther.getVariableName()) || (this.getVariableName() != null
				&& castOther.getVariableName() != null && this.getVariableName().equals(castOther.getVariableName())))
				&& ((this.getVariableValue() == castOther.getVariableValue())
						|| (this.getVariableValue() != null && castOther.getVariableValue() != null
								&& this.getVariableValue().equals(castOther.getVariableValue())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null && castOther.getType() != null
						&& this.getType().equals(castOther.getType())))
				&& ((this.getEnabled() == castOther.getEnabled()) || (this.getEnabled() != null
						&& castOther.getEnabled() != null && this.getEnabled().equals(castOther.getEnabled())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getVariableName() == null ? 0 : this.getVariableName().hashCode());
		result = 37 * result + (getVariableValue() == null ? 0 : this.getVariableValue().hashCode());
		result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result + (getEnabled() == null ? 0 : this.getEnabled().hashCode());
		return result;
	}

}
