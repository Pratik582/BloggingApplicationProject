package com.cg.blog.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.blog.dto.BloggerDetails;
import com.cg.blog.dto.CommentDetails;
import com.cg.blog.dto.PostDetails;
import com.cg.blog.entities.Blogger;
import com.cg.blog.entities.Comment;
import com.cg.blog.entities.Post;

@Component
public class BloggerUtil 
{
	public BloggerDetails toDetails(Blogger blogger)
	{
		BloggerDetails blog = new BloggerDetails();
		blog.setUserId(blogger.getUserId());
		blog.setBloggerName(blogger.getBloggerName());
		ArrayList<PostDetails> myList = new ArrayList<PostDetails>();
		ArrayList<CommentDetails> myList1 = new ArrayList<CommentDetails>();
		//ArrayList<CommunityDetails> myList2 = new ArrayList<CommunityDetails>();
		
		List<Post> blogPost = blogger.getPost();
		for (Post post : blogPost) {
			myList.add(new PostDetails(post));
		}
		blog.setPost(myList);
		
		List<Comment> bloggerComments = blogger.getComments();
		for (Comment commt : bloggerComments) {
			myList1.add(new CommentDetails(commt));
		}
		blog.setComments(myList1);
		
		/*List<Community> bloggerInCommunities = blogger.getCommunities();
		for (Community commty : bloggerInCommunities) {
			myList2.add(new CommunityDetails(commty));
		}
		blog.setCommunities(myList2);*/
		
		return blog;
		
	}
	
	
	public List<BloggerDetails> toDetails(Collection<Blogger> blog)
	{
		List<BloggerDetails> myBlogList = new ArrayList<BloggerDetails>();
		for(Blogger myblog:blog)
		{
			 BloggerDetails details = toDetails(myblog);
	         System.out.println(details);
	         myBlogList.add(details);
		}
		return myBlogList;
	}
}
