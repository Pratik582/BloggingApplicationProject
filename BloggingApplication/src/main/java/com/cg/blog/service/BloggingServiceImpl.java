package com.cg.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.blog.dao.IBloggerDao;
import com.cg.blog.entities.Blogger;
import com.cg.blog.exception.BloggerAlreadyExistsException;
import com.cg.blog.exception.BloggerNotExistsException;
import com.cg.blog.exception.BloggerNotFoundException;

@Component
public class BloggingServiceImpl implements BloggingServiceIntf 
{
	@Autowired
	private IBloggerDao bdao;

	@Override
	public Blogger addBlogger(Blogger blogger) throws BloggerAlreadyExistsException  {
		boolean exists= blogger.getUserId() != 0 && bdao.existsById(blogger.getUserId());
        if(exists){
            throw new BloggerAlreadyExistsException("blogger already exists for id="+blogger.getUserId());
        }
        blogger = bdao.save(blogger);
        System.out.println("returning saved blog: " + blogger);
        return blogger;
	}

	@Override
	public Blogger updateBlogger(Integer userId) {
		System.out.println("id :" +userId);
		
		 Optional<Blogger> optional = bdao.findById(userId);
	        if(!optional.isPresent()){
	        	System.out.println("***error***");
	            throw new BloggerNotExistsException("blogger not exist for id="+ userId);
	        }
	    Blogger blogger=optional.get();
		blogger=bdao.save(blogger);
		return blogger;
	}

	


	@Override
	public List<Blogger> viewAllBlogger() {
		List<Blogger> blist = bdao.findAll();
        return blist;
	}

	@Override
	public Blogger viewBlogger(int userId) throws BloggerNotFoundException {
		System.out.println("id: "+userId);
        Optional<Blogger> optional = bdao.findById(userId);
        if(!optional.isPresent()){
        	System.out.println("**error**");
            throw new BloggerNotFoundException("blogger not found for id="+ userId);
        }
        Blogger blogger=optional.get();
        System.out.println("blog: "+ blogger);
        return blogger;
	}

	@Override
	public Blogger deleteBlogger(int userId) {
		Blogger blogger=viewBlogger(userId);
		bdao.deleteById(userId);
		
		return blogger;
	}

}
