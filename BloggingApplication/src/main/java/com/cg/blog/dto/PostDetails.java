package com.cg.blog.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.cg.blog.entities.Comment;
import com.cg.blog.entities.Post;

public class PostDetails 
{
	private Integer postId;
	 private String title;
	 private LocalDateTime datetime;
	 private List<CommentDetails> comments;
	 private Integer votes;
	 private boolean voteup;
	 private String content;

	

	@Override
	public String toString() {
		return "PostDetails [postId=" + postId + ", title=" + title + ", datetime=" + datetime + ", comments="
				+ comments + ", votes=" + votes + ", voteup=" + voteup + ", content=" + content + "]";
	}


	public PostDetails(int postId, String title,LocalDateTime 
			datetime, int votes, boolean voteup,
			String content) {
		super();
		this.postId = postId;
		this.title = title;
		this.datetime = datetime;
		this.votes = votes;
		this.voteup = voteup;
		this.content = content;
	}


	public PostDetails(int postId, String title, LocalDateTime datetime,
			List<CommentDetails> comments,
			int votes, boolean voteup, String content) {
		super();
		this.postId = postId;
		this.title = title;
		this.datetime = datetime;
		this.comments = comments;
		this.votes = votes;
		this.voteup = voteup;
		this.content = content;
	}

	
	public PostDetails(Post post) 
	{
		postId=post.getPostId();
		title=post.getTitle();
		datetime=post.getDatetime();
		votes=post.getVotes();
		voteup=post.isVoteup();
		content=post.getContent();
		List<Comment> commentsList = post.getComments();
		for (Comment comment : commentsList) {
			comments.add(new CommentDetails(comment));
		}
		
	}
	


	public int getPostId() {
		return postId;
	}


	public void setPostId(int postId) {
		this.postId = postId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public LocalDateTime getDatetime() {
		return datetime;
	}


	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}


	public List<CommentDetails> getComments() {
		return comments;
	}


	public void setComments(List<CommentDetails> comments) {
		this.comments = comments;
	}


	public int getVotes() {
		return votes;
	}


	public void setVotes(int votes) {
		this.votes = votes;
	}


	public boolean isVoteup() {
		return voteup;
	}


	public void setVoteup(boolean voteup) {
		this.voteup = voteup;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

	
}
