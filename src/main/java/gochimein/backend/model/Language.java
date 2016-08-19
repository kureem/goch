package gochimein.backend.model;

import javax.persistence.Entity;

@Entity
public class Language extends BaseModel{
	
	private String language;
	
	private String code;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
