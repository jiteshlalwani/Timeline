package com.synerzip.timeline.structures;

/**
 * PostDetails class has getters and setters methods for storing Post details (Avatar, Name and Description)
 * @author Jitesh Lalwani
 */
public class PostDetails {

	private String avatarURL;
	private String posterName;
	private String postText;

	public String getAvatarURL() {
		return avatarURL;
	}

	public void setAvatarURL(String avatarURL) {
		this.avatarURL = avatarURL;
	}

	public String getPosterName() {
		return posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

}
