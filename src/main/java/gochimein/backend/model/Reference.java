package gochimein.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Reference extends BaseModel{

	@Column(name="COL_KEY")
	private  String key;

	private  String name;
	
	private String email;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
