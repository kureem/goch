package gochimein.backend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity 
public class Post extends BaseModel {

	public static enum PostType {
		LINK, STATUS, PHOTO, VIDEO, UNKNOWN
	}

	public static enum StatusType {
		MOBILE_STATUS_UPDATE, CREATED_NOTE, ADDED_PHOTOS, ADDED_VIDEO, SHARED_STORY, CREATED_GROUP, CREATED_EVENT, WALL_POST, APP_CREATED_STORY, PUBLISHED_STORY, TAGGED_IN_PHOTO, APPROVED_FRIEND, UNKNOWN
	}

	public static enum PrivacyType {
		EVERYONE, ALL_FRIENDS, FRIENDS_OF_FRIENDS, SELF, CUSTOM, UNKNOWN
	}

	public static enum FriendsPrivacyType {
		ALL_FRIENDS, FRIENDS_OF_FRIENDS, SOME_FRIENDS, UNKNOWN
	}
 

	@ManyToMany
	private List<Answer> answers;
	
	private String caption;


	private String description;

	@ManyToOne
	private Reference creator;
	
	

	private String icon;

	private boolean isHidden;

	private boolean isPublished;

	private String link;

	private String message;

	@ManyToMany
	private List<MessageTag> messageTags;

	private String name;

	private String picture;

	private PrivacyType privacy;

	@ManyToMany
	private List<PostProperty> properties = new ArrayList<PostProperty>();

	private int sharesCount;

	private String source;

	private StatusType statusType;

	private String story;

	@ManyToMany
	private List<Reference> destination;

	private PostType type = PostType.UNKNOWN;

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Reference getCreator() {
		return creator;
	}

	public void setCreator(Reference creator) {
		this.creator = creator;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

	public boolean isPublished() {
		return isPublished;
	}

	public void setPublished(boolean isPublished) {
		this.isPublished = isPublished;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<MessageTag> getMessageTags() {
		return messageTags;
	}

	public void setMessageTags(List<MessageTag> messageTags) {
		this.messageTags = messageTags;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public PrivacyType getPrivacy() {
		return privacy;
	}

	public void setPrivacy(PrivacyType privacy) {
		this.privacy = privacy;
	}

	public List<PostProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<PostProperty> properties) {
		this.properties = properties;
	}

	public int getSharesCount() {
		return sharesCount;
	}

	public void setSharesCount(int sharesCount) {
		this.sharesCount = sharesCount;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public StatusType getStatusType() {
		return statusType;
	}

	public void setStatusType(StatusType statusType) {
		this.statusType = statusType;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	

	public List<Reference> getDestination() {
		return destination;
	}

	public void setDestination(List<Reference> destination) {
		this.destination = destination;
	}

	public PostType getType() {
		return type;
	}

	public void setType(PostType type) {
		this.type = type;
	}


	
	

}
