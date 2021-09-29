package com.cg.blog.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PostTable")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PostId")
	private Integer postId;

	@Column(name = "PostTitle")
	private String title;
	
	@Column(name = "PostDateTime")
	private LocalDateTime datetime;
	
	@OneToMany(mappedBy="post",cascade=CascadeType.ALL)
	private List<Comment> comments;
	
	@Column(name = "PostVote")
	private Integer votes;
	
	@Column(name = "VoteUpForPost")
	private boolean voteup;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private Blogger blogger;

	@Column(name = "TypeOfPost")
	private String content;

	public Post() {

	}

	public Blogger getBlogger() {
		return blogger;
	}

	public void setBlogger(Blogger blogger) {
		this.blogger = blogger;
	}

	public Post(Integer postId, String title, LocalDateTime datetime, List<Comment> comments,
			Integer votes, boolean voteup, String content) {
		super();
		this.postId = postId;
		this.title = title;
		this.datetime = datetime;
		this.comments = comments;
		this.votes = votes;
		this.voteup = voteup;
		this.content = content;
	}

	public Post(String title, LocalDateTime datetime, List<Comment> comments, Integer votes, boolean voteup,
			String content) {
		super();
		this.title = title;
		this.datetime = datetime;
		this.comments = comments;
		this.votes = votes;
		this.voteup = voteup;
		this.content = content;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
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
