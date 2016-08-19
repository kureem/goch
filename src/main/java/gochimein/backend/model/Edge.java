package gochimein.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Edge extends BaseModel {

	@Column(name="COL_FROM")
	private Long from;

	@Column(name="COL_TO")
	private Long to;

	private Integer edgeType;

	private String description;

	

	public Integer getEdgeType() {
		return edgeType;
	}

	public void setEdgeType(Integer edgeType) {
		this.edgeType = edgeType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
