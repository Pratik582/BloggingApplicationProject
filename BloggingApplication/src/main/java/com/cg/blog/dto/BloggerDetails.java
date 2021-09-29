package com.cg.blog.dto;

import java.util.List;

public class BloggerDetails 
{
	private int userId;
	private String bloggerName;
	private List<PostDetails> post;
	private List<CommentDetails> comments;
	private List<PostDetails> upvoted;
	private List<PostDetails> downvoted;
	private List<CommunityDetails> communities;
	

	
	
	public BloggerDetails() {
		super();
	}



	
	
	public BloggerDetails(String bloggerName, List<PostDetails> post, List<CommentDetails> comments,
			List<PostDetails> upvoted, List<PostDetails> downvoted, List<CommunityDetails> communities) {
		super();
		this.bloggerName = bloggerName;
		this.post = post;
		this.comments = comments;
		this.upvoted = upvoted;
		this.downvoted = downvoted;
		this.communities = communities;
	}





	public BloggerDetails(int userId, String bloggerName, List<PostDetails> post, List<CommentDetails> comments,
			List<CommunityDetails> communities) {
		super();
		this.userId = userId;
		this.bloggerName = bloggerName;
		this.post = post;
		this.comments = comments;
		this.communities = communities;
	}



	public BloggerDetails(int userId, String bloggerName, List<PostDetails> post, List<CommentDetails> comments,
			List<PostDetails> upvoted, List<PostDetails> downvoted, List<CommunityDetails> communities) {
		super();
		this.userId = userId;
		this.bloggerName = bloggerName;
		this.post = post;
		this.comments = comments;
		this.upvoted = upvoted;
		this.downvoted = downvoted;
		this.communities = communities;
	}
	@Override
	public String toString() {
		return "BloggerDetails [userId=" + userId + ", bloggerName=" + bloggerName + ", post=" + post + ", comments="
				+ comments + ", upvoted=" + upvoted + ", downvoted=" + downvoted + ", communities=" + communities + "]";
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBloggerName() {
		return bloggerName;
	}
	public void setBloggerName(String bloggerName) {
		this.bloggerName = bloggerName;
	}
	public List<PostDetails> getPost() {
		return post;
	}
	public void setPost(List<PostDetails> post) {
		this.post = post;
	}
	public List<CommentDetails> getComments() {
		return comments;
	}
	public void setComments(List<CommentDetails> comments) {
		this.comments = comments;
	}
	public List<PostDetails> getUpvoted() {
		return upvoted;
	}
	public void setUpvoted(List<PostDetails> upvoted) {
		this.upvoted = upvoted;
	}
	public List<PostDetails> getDownvoted() {
		return downvoted;
	}
	public void setDownvoted(List<PostDetails> downvoted) {
		this.downvoted = downvoted;
	}
	public List<CommunityDetails> getCommunities() {
		return communities;
	}
	public void setCommunities(List<CommunityDetails> communities) {
		this.communities = communities;
	}

}
