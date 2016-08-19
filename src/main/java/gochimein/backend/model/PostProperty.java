package gochimein.backend.model;

import javax.persistence.Entity;

@Entity
public class PostProperty extends BaseModel{

	private String name;

	private String text;

	private String href;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

}
