package gochimein.backend.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Place extends BaseModel {

	@ManyToOne
	private Location location; 

	private String name;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
