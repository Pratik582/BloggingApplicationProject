package com.cg.blog.dto;

import com.cg.blog.entities.Comment;

public class CommentDetails 
{
	Integer commentId;
	String commentDescription;
	Integer votes;
	BloggerDetails blogger;
	boolean voteup;
	
	
	
	public CommentDetails(int commentId, String commentDescription, int votes, BloggerDetails blogger, boolean voteup) {
		super();
		this.commentId = commentId;
		this.commentDescription = commentDescription;
		this.votes = votes;
		this.blogger = blogger;
		this.voteup = voteup;
	}
	
	public CommentDetails(Comment comments) {
		commentId=comments.getCommentId();
		commentDescription=comments.getCommentDescription();
		votes=comments.getVotes();
		voteup=comments.isVoteup();
		
	}
	
	@Override
	public String toString() {
		return "CommentDetails [commentId=" + commentId + ", commentDescription=" + commentDescription + ", votes="
				+ votes + ", blogger=" + blogger + ", voteup=" + voteup + "]";
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getCommentDescription() {
		return commentDescription;
	}
	public void setCommentDescription(String commentDescription) {
		this.commentDescription = commentDescription;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public BloggerDetails getBlogger() {
		return blogger;
	}
	public void setBlogger(BloggerDetails blogger) {
		this.blogger = blogger;
	}
	public boolean isVoteup() {
		return voteup;
	}
	public void setVoteup(boolean voteup) {
		this.voteup = voteup;
	}
	
	
}
