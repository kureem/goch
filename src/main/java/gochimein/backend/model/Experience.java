package gochimein.backend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Experience extends BaseModel{

	private String description;

	private String name;

	@ManyToOne
	private Reference providedBy;

	@ManyToMany
	private List<Reference> togetherWith;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reference getProvidedBy() {
		return providedBy;
	}

	public void setProvidedBy(Reference providedBy) {
		this.providedBy = providedBy;
	}

	public List<Reference> getTogetherWith() {
		return togetherWith;
	}

	public void setTogetherWith(List<Reference> togetherWith) {
		this.togetherWith = togetherWith;
	}

}
