package com.cg.blog.exception;

public class BloggerAlreadyExistsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BloggerAlreadyExistsException(String msg)
	{
		super(msg);
	}

}
