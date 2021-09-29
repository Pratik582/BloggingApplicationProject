package com.cg.blog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CommentTable")
public class Comment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CommentId")
	private Integer commentId;
	@Column(name="CommentDetails")
	private String commentDescription;
	@Column(name="TotalVotes")
	private Integer votes;
	
	@ManyToOne
	@JoinColumn(name="bloggerId")
	private Blogger blogger;
	
	@ManyToOne
	@JoinColumn(name="postId")
	private Post post;
	@Column(name="VoteUp")
	private boolean voteup;
	public Comment() {
		
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
	public Blogger getBlogger() {
		return blogger;
	}
	public void setBlogger(Blogger blogger) {
		this.blogger = blogger;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public boolean isVoteup() {
		return voteup;
	}
	public void setVoteup(boolean voteup) {
		this.voteup = voteup;
	}

}
