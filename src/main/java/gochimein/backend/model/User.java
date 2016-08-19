package gochimein.backend.model;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User extends Reference {

	private String about;

	@ManyToOne
	private Location address;

	private String ageRange;

	private String bio;

	private String birthday;

	@OneToOne
	private CoverPhoto cover;

	@ManyToOne
	private Currency currency;

	@ManyToMany
	private List<Device> devices;

	@ManyToMany
	private List<EducationExperience> education;


	@ManyToMany
	private List<Reference> favoriteAthletes;

	@ManyToMany
	private List<Reference> favoriteTeams;

	private String firstName;

	private String gender;

	@ManyToOne
	private Reference hometown;

	@ManyToMany
	private List<Reference> inspirationalPeople;

	private boolean installed;

	private String installType;

	private String interestedIn;

	private boolean isIdentityVerified;

	@ManyToMany
	private List<Reference> languages;

	private String lastName;

	private String link;

	private Locale locale;

	@ManyToOne
	private Location location;

	private String middleName;

	
	private String meetingFor;


	private String nameFormat;

	private String political;

	private String quotes;

	private String relationshipStatus;

	private String religion;

	@ManyToOne
	private Reference significantOther;

	@ManyToMany
	private List<Experience> sports;

	private Float timezone;

	private Date updatedTime;

	private Boolean verified;

	private boolean viewerCanSendGift;

	private String website;

	@ManyToMany
	private List<Reference> work;

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Location getAddress() {
		return address;
	}

	public void setAddress(Location address) {
		this.address = address;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public CoverPhoto getCover() {
		return cover;
	}

	public void setCover(CoverPhoto cover) {
		this.cover = cover;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public List<EducationExperience> getEducation() {
		return education;
	}

	public void setEducation(List<EducationExperience> education) {
		this.education = education;
	}

	

	public List<Reference> getFavoriteAthletes() {
		return favoriteAthletes;
	}

	public void setFavoriteAthletes(List<Reference> favoriteAthletes) {
		this.favoriteAthletes = favoriteAthletes;
	}

	public List<Reference> getFavoriteTeams() {
		return favoriteTeams;
	}

	public void setFavoriteTeams(List<Reference> favoriteTeams) {
		this.favoriteTeams = favoriteTeams;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Reference getHometown() {
		return hometown;
	}

	public void setHometown(Reference hometown) {
		this.hometown = hometown;
	}

	public List<Reference> getInspirationalPeople() {
		return inspirationalPeople;
	}

	public void setInspirationalPeople(List<Reference> inspirationalPeople) {
		this.inspirationalPeople = inspirationalPeople;
	}

	public boolean isInstalled() {
		return installed;
	}

	public void setInstalled(boolean installed) {
		this.installed = installed;
	}

	public String getInstallType() {
		return installType;
	}

	public void setInstallType(String installType) {
		this.installType = installType;
	}

	

	public boolean isIdentityVerified() {
		return isIdentityVerified;
	}

	public void setIdentityVerified(boolean isIdentityVerified) {
		this.isIdentityVerified = isIdentityVerified;
	}

	public List<Reference> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Reference> languages) {
		this.languages = languages;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	

	

	public String getNameFormat() {
		return nameFormat;
	}

	public void setNameFormat(String nameFormat) {
		this.nameFormat = nameFormat;
	}

	public String getPolitical() {
		return political;
	}

	public void setPolitical(String political) {
		this.political = political;
	}

	public String getQuotes() {
		return quotes;
	}

	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}

	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Reference getSignificantOther() {
		return significantOther;
	}

	public void setSignificantOther(Reference significantOther) {
		this.significantOther = significantOther;
	}

	public List<Experience> getSports() {
		return sports;
	}

	public void setSports(List<Experience> sports) {
		this.sports = sports;
	}

	public Float getTimezone() {
		return timezone;
	}

	public void setTimezone(Float timezone) {
		this.timezone = timezone;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public boolean isViewerCanSendGift() {
		return viewerCanSendGift;
	}

	public void setViewerCanSendGift(boolean viewerCanSendGift) {
		this.viewerCanSendGift = viewerCanSendGift;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<Reference> getWork() {
		return work;
	}

	
	public String getInterestedIn() {
		return interestedIn;
	}

	public void setInterestedIn(String interestedIn) {
		this.interestedIn = interestedIn;
	}

	public String getMeetingFor() {
		return meetingFor;
	}

	public void setMeetingFor(String meetingFor) {
		this.meetingFor = meetingFor;
	}

	public void setWork(List<Reference> work) {
		this.work = work;
	}

}
