package gochimein.backend.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Answer extends BaseModel{
	
	@ManyToOne
	private Attachment photo;
	
	private String text;
	
	private String link;

	public Attachment getPhoto() {
		return photo;
	}

	public void setPhoto(Attachment photo) {
		this.photo = photo;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	

}
