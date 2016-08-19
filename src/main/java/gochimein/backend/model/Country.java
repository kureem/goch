package gochimein.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Country extends BaseModel{

	private String country;
	
	@Column(name="COL_CODE")
	private String code;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
