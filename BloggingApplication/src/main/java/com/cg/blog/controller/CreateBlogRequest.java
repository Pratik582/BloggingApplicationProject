package com.cg.blog.controller;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.cg.blog.entities.Comment;
import com.cg.blog.entities.Community;
import com.cg.blog.entities.Post;


public class CreateBlogRequest
{
	@NotBlank @Size(min=2, max=20)
	String blogger_name;
	List<Post> post;
	List<Comment> comments;
	List<Post> upvoted;
	List<Post> downvoted;
	List<Community> communities;
	
	
	
	@Override
	public String toString() {
		return "CreateBlogRequest [blogger_name=" + blogger_name + ", post=" + post + ", comments=" + comments
				+ ", upvoted=" + upvoted + ", downvoted=" + downvoted + ", communities=" + communities + "]";
	}
	
	
	public CreateBlogRequest(@NotBlank @Size(min = 2, max = 20) String blogger_name) {
		super();
		this.blogger_name = blogger_name;
	}
	public String getBlogger_name() {
		return blogger_name;
	}
	public void setBlogger_name(String blogger_name) {
		this.blogger_name = blogger_name;
	}
	public List<Post> getPost() {
		return post;
	}
	public void setPost(List<Post> post) {
		this.post = post;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public List<Post> getUpvoted() {
		return upvoted;
	}
	public void setUpvoted(List<Post> upvoted) {
		this.upvoted = upvoted;
	}
	public List<Post> getDownvoted() {
		return downvoted;
	}
	public void setDownvoted(List<Post> downvoted) {
		this.downvoted = downvoted;
	}
	
	public List<Community> getCommunities() {
		return communities;
	}
	public void setCommunities(List<Community> communities) {
		this.communities = communities;
	}
	

}
