package com.cg.blog.exception;

public class CommunityAlreadyExistsException extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public CommunityAlreadyExistsException(String msg) {
	super(msg);
}
}
