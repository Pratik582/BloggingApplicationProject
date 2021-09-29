package com.cg.blog.service;

import java.util.List;

import com.cg.blog.entities.Blogger;
import com.cg.blog.exception.BloggerAlreadyExistsException;
import com.cg.blog.exception.BloggerNotFoundException;

public interface BloggingServiceIntf {

	Blogger addBlogger(Blogger blogger) throws BloggerAlreadyExistsException;

	Blogger viewBlogger(int userId) throws BloggerNotFoundException ;

	Blogger deleteBlogger(int userId);

	List<Blogger> viewAllBlogger();

	Blogger updateBlogger(Integer userId);

}
