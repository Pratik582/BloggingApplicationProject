package com.cg.blog.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="BloggerTable")
public class Blogger 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BloggerId")
	private Integer userId;
	@Column(name="BloggerName")
	private String bloggerName;
	
	@Column(name="BloggerPost")
	@OneToMany(mappedBy="blogger",cascade=CascadeType.ALL)
	private List<Post> post;
	
	@Column(name="BloggerComment")
	@OneToMany(mappedBy="blogger",cascade=CascadeType.ALL)
	private List<Comment> comments;
	
	@OneToMany(mappedBy="blogger",cascade=CascadeType.ALL)
	private List<Post> upvoted;
	
	@OneToMany(mappedBy="blogger",cascade=CascadeType.ALL)
	private List<Post> downvoted;
	
	//@OneToMany(mappedBy="communityId",cascade=CascadeType.ALL)
	//@Column(name="BloggerInCommunity")
	//private List<Community> communities;
	
	public Blogger() {
		
	}
		
	
	public Blogger(String bloggerName, List<Post> post, List<Comment> comments, List<Post> upvoted,
			List<Post> downvoted) {
		super();
		this.bloggerName = bloggerName;
		this.post = post;
		this.comments = comments;
		this.upvoted = upvoted;
		this.downvoted = downvoted;
		
	}

	
	public Blogger(int userId, String bloggerName, List<Post> post, List<Comment> comments, List<Post> upvoted,
			List<Post> downvoted) {
		super();
		this.userId = userId;
		this.bloggerName = bloggerName;
		this.post = post;
		this.comments = comments;
		this.upvoted = upvoted;
		this.downvoted = downvoted;
	}

	public Blogger(String bloggerName) {
		super();
		this.bloggerName = bloggerName;
			}

	@Override
	public String toString() {
		return "Blogger [userId=" + userId + ", bloggerName=" + bloggerName + ", post=" + post + ", comments="
				+ comments + ", upvoted=" + upvoted + ", downvoted=" + downvoted + "]";
	}



	public Integer getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBloggerName() {
		return bloggerName;
	}
	public void setBloggerName(String blogger_name) {
		this.bloggerName = blogger_name;
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
		
	public void addpost(Post post) {
		
	}

	public void addcomment(Comment mycom) {
		// TODO Auto-generated method stub
	}



	public void addvote(Post upv) {
		// TODO Auto-generated method stub
		
	}



	public void removevote(Post dpv) {
		// TODO Auto-generated method stub
		
	}



	public void addcommunity(Community comm) {
		// TODO Auto-generated method stub
		
	}
	
	

}
