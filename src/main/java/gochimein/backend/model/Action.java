package gochimein.backend.model;

import javax.persistence.Entity;

@Entity
public class Action extends BaseModel{
	
	private  String name;
	
	private  String link;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	
}
