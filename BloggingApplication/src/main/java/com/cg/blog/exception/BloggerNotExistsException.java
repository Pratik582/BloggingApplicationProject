package com.cg.blog.exception;

public class BloggerNotExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BloggerNotExistsException(String msg) {
		super(msg);
	}

}
