package com.cg.blog.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.blog.entities.User;
import com.cg.blog.service.UserServiceIntf;

@RestController
@RequestMapping("/user")
@Validated
public class UserController 
{
	@Autowired
	private UserServiceIntf userv;

	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/add")
	public User addNewUser(@RequestBody @Valid CreateUserRequest requestData)
	{
		return null;
		
	}
}
