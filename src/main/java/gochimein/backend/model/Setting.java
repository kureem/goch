package gochimein.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Setting extends BaseModel{
	
	@Column(name="COL_KEY")
	private  String key;

	@Column(name="COL_VALUE")
	private  String value;
	
	private String description;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
