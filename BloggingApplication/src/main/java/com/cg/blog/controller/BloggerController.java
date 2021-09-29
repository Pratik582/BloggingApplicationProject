package com.cg.blog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.blog.dto.BloggerDetails;
import com.cg.blog.entities.Blogger;
import com.cg.blog.entities.Comment;
import com.cg.blog.entities.Post;
import com.cg.blog.exception.BloggerAlreadyExistsException;
import com.cg.blog.service.BloggingServiceIntf;
import com.cg.blog.util.BloggerUtil;

@RestController
@RequestMapping("/blogger")
@Validated
public class BloggerController 
{
	
	@Autowired
	private BloggingServiceIntf blogserv;
	@Autowired
	private BloggerUtil butil;

	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
	public BloggerDetails addBlogger(@RequestBody @Valid CreateBlogRequest requestData) throws BloggerAlreadyExistsException
	{
		System.out.println("req data: " + requestData);
		Blogger blogger = new Blogger(requestData.getBlogger_name(),requestData.getPost(),
				requestData.getComments(), requestData.getUpvoted(), 
				requestData.getDownvoted());
		List<Post> postList = requestData.getPost();
		if (postList != null) {
			for (Post post : postList) {
				blogger.addpost(post);
			}
		}
		List<Comment> cmntList=requestData.getComments();
		if(cmntList != null) {
			for(Comment comment: cmntList) {
				blogger.addcomment(comment);
			}
		}
		
		System.out.println("Blogger came: " + blogger);
		blogger = blogserv.addBlogger(blogger);
		BloggerDetails details = butil.toDetails(blogger);
		return details;	
		}
	
	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping("/delete/id/{id}")
	public BloggerDetails deleteBlogger(@PathVariable("id") Integer id)
	{
		Blogger removeBlogi = blogserv.deleteBlogger(id);
		BloggerDetails response =  butil.toDetails(removeBlogi);
		return response;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public List<BloggerDetails> viewAllBlogger()
	{
		List<Blogger> allBloggers = blogserv.viewAllBlogger();
		List<BloggerDetails> response = butil.toDetails(allBloggers);
		System.out.println("details: " + response);
		return response;	
	}

	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/update/id/{id}")
	public BloggerDetails updateBlogger(@PathVariable("id") Integer userId)
	{
		System.out.println("cntrlr fetched id:" +userId);
		Blogger blogger=blogserv.updateBlogger(userId);
		BloggerDetails details = butil.toDetails(blogger);
		System.out.println("details: " + details);
		return details;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/by/id/{id}")
	public BloggerDetails viewBlogger(@PathVariable("id") Integer id)
	{
		Blogger helloBlogi = blogserv.viewBlogger(id);
		BloggerDetails response = butil.toDetails(helloBlogi);
		return response;
	}
	
}
