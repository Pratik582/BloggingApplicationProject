package com.cg.blog.exception;

public class BloggerNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BloggerNotFoundException(String msg)
	{
		super(msg);
	}
}
