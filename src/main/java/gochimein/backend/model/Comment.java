package gochimein.backend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Comment extends BaseModel{

	@ManyToOne
	private Attachment attachment;

	private boolean canComment;

	private boolean canRemove;

	private Integer commentCount;

	@ManyToOne
	private Reference source;

	private Integer likeCount;

	private String message;

	@ManyToMany
	private List<MessageTag> messageTags;

	@ManyToOne
	private Comment parent;
	
	@ManyToOne
	private Post post;

	private boolean userLikes;

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public boolean isCanComment() {
		return canComment;
	}

	public void setCanComment(boolean canComment) {
		this.canComment = canComment;
	}

	public boolean isCanRemove() {
		return canRemove;
	}

	public void setCanRemove(boolean canRemove) {
		this.canRemove = canRemove;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	

	public Reference getSource() {
		return source;
	}

	public void setSource(Reference source) {
		this.source = source;
	}

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
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

	public Comment getParent() {
		return parent;
	}

	public void setParent(Comment parent) {
		this.parent = parent;
	}

	public boolean isUserLikes() {
		return userLikes;
	}

	public void setUserLikes(boolean userLikes) {
		this.userLikes = userLikes;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}
