package gochimein.backend.model;

import javax.persistence.Entity;

@Entity
public class CoverPhoto extends Attachment {

	private Integer offsetX;

	private Integer offsetY;

	public Integer getOffsetX() {
		return offsetX;
	}

	public void setOffsetX(Integer offsetX) {
		this.offsetX = offsetX;
	}

	public Integer getOffsetY() {
		return offsetY;
	}

	public void setOffsetY(Integer offsetY) {
		this.offsetY = offsetY;
	}
	
	

}
