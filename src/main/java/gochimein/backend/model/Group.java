package gochimein.backend.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import gochimein.backend.model.Post.PrivacyType;

@Entity
public class Group extends Reference {
	
	@ManyToOne
	private CoverPhoto cover;

	private String description;


	private String icon;

	private String link;


	@ManyToOne
	private Reference owner;

	private PrivacyType privacy;


	public CoverPhoto getCover() {
		return cover;
	}

	public void setCover(CoverPhoto cover) {
		this.cover = cover;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}


	public Reference getOwner() {
		return owner;
	}

	public void setOwner(Reference owner) {
		this.owner = owner;
	}

	public PrivacyType getPrivacy() {
		return privacy;
	}

	public void setPrivacy(PrivacyType privacy) {
		this.privacy = privacy;
	}
	
	
}
