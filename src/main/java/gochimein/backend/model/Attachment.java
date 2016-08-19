package gochimein.backend.model;

import javax.persistence.Entity;

@Entity
public class Attachment extends BaseModel {
	
	private String title;

	private String description;

	private String descriptionTags;

	
	private String type;

	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public String getDescriptionTags() {
		return descriptionTags;
	}

	public void setDescriptionTags(String descriptionTags) {
		this.descriptionTags = descriptionTags;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
