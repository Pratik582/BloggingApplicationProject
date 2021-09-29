package com.cg.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;




	@RestControllerAdvice
	public class CentralizedExceptionHandler {
		@ResponseStatus(HttpStatus.NOT_FOUND)
		@ExceptionHandler(BloggerNotFoundException.class)
		public String handleBloggerNotFound(BloggerNotFoundException e) {
			return e.getMessage();
		}
		
		@ResponseStatus(HttpStatus.BAD_REQUEST)
		@ExceptionHandler(BloggerAlreadyExistsException.class)
		public String handleBloggerExists(BloggerAlreadyExistsException e) {
			return e.getMessage();
		}
		
		@ResponseStatus(HttpStatus.NOT_FOUND)
		@ExceptionHandler(BloggerNotExistsException.class)
		public String handleBloggerNotExists(BloggerNotExistsException e) {
			return e.getMessage();
		}
		
		@ResponseStatus(HttpStatus.NOT_FOUND)
		@ExceptionHandler(CommunityNotFoundException.class)
		public String handleCommunityNotFound(CommunityNotFoundException e) {
			return e.getMessage();
		}
		
		@ResponseStatus(HttpStatus.BAD_REQUEST)
		@ExceptionHandler(CommunityAlreadyExistsException.class)
		public String handleCommunityExists(CommunityAlreadyExistsException e) {
			return e.getMessage();
		}
		
		@ResponseStatus(HttpStatus.NOT_FOUND)
		@ExceptionHandler(CommunityNotExistsException.class)
		public String handleCommunityNotExists(CommunityNotExistsException e) {
			return e.getMessage();
		}
		
		@ResponseStatus(HttpStatus.BAD_REQUEST)
		@ExceptionHandler(AdminAlreadyExistsException.class)
		public String handleAdminAlreadyExists(AdminAlreadyExistsException e) {
			return e.getMessage();
		}
		
		@ResponseStatus(HttpStatus.NOT_FOUND)
		@ExceptionHandler(AdminNotExistsException.class)
		public String handleAdminNotExists(AdminNotExistsException e) {
			return e.getMessage();
		}
		
		@ResponseStatus(HttpStatus.NOT_FOUND)
		@ExceptionHandler(AdminNotFoundException.class)
		public String handleAdminNotFound(AdminNotFoundException e) {
			return e.getMessage();
		}
		
		@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
		@ExceptionHandler(Exception.class)
		public String handleError(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
}
