package gochimein.backend.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class EducationExperience extends BaseModel{
	
	@ManyToMany
	private List<Experience> classes;
	
	@ManyToMany
	private List<Reference> concentration;
	
	@ManyToOne
	private Reference degree;
	
	@ManyToOne
	private Reference school;

	private String type;
	
	@ManyToMany
	
	@Column
	private List<Reference> withInstitutions;

	private String year;

	public List<Experience> getClasses() {
		return classes;
	}

	public void setClasses(List<Experience> classes) {
		this.classes = classes;
	}

	public List<Reference> getConcentration() {
		return concentration;
	}

	public void setConcentration(List<Reference> concentration) {
		this.concentration = concentration;
	}

	public Reference getDegree() {
		return degree;
	}

	public void setDegree(Reference degree) {
		this.degree = degree;
	}

	public Reference getSchool() {
		return school;
	}

	public void setSchool(Reference school) {
		this.school = school;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<Reference> getWithInstitutions() {
		return withInstitutions;
	}

	public void setWithInstitutions(List<Reference> withInstitutions) {
		this.withInstitutions = withInstitutions;
	}
	
	

}
