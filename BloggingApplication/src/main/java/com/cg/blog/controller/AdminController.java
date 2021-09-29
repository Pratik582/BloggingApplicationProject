package com.cg.blog.controller;

import java.util.List;
import java.util.Set;

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

import com.cg.blog.dto.AdminDetails;
import com.cg.blog.dto.CommunityDetails;
import com.cg.blog.entities.Admin;
import com.cg.blog.entities.Community;
import com.cg.blog.service.AdminServiceIntf;
import com.cg.blog.util.AdminUtil;

@RestController
@RequestMapping("/admin")
@Validated
public class AdminController 
{
	@Autowired
	private AdminServiceIntf aserv;
	@Autowired
	private AdminUtil autil;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/create")
	public CommunityDetails createCommunity(@RequestBody @Valid CreateAdminRequest requestData)
	{
		System.out.println("req data: " + requestData);
		Community community = new Community(requestData.getCommunityDescription(),
				requestData.getTotalMembers(),requestData.getImage(),
				requestData.getDate(),requestData.getAdmin());
		
		System.out.println("Community came: " + community);
		community = aserv.createCommunity(community);
		CommunityDetails details = autil.toDetails2(community);
		return details;
		
		
	}
	
	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping("/delete/id/{id}")
	public CommunityDetails deleteCommunity(@PathVariable("id") Integer communityId)
	{
		System.out.println("cntrlr fetch id: " + communityId);
		Community community = aserv.deleteCommunity(communityId);
		CommunityDetails details =  autil.toDetails2(community);
		
		return details;
	
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/update/id/{id}")
	public CommunityDetails updateCommunity(@PathVariable("id") Integer communityId)
	{
		System.out.println("cntrlr fetched id:" +communityId);
		Community community=aserv.updateCommunity(communityId);
		CommunityDetails details = autil.toDetails2(community);
		System.out.println("details: " + details);
		return details;
		
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public List<CommunityDetails> listAllCommunity()
	{

		List<Community> community = aserv.listAllCommunity();
		List<CommunityDetails> response = autil.toDetails1(community);
		return response;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping("/delete")
	public AdminDetails delete(@PathVariable("id") Integer userId) {
		System.out.println("cntrlr fetch id: " + userId);
		Admin admin = aserv.delete(userId);
		AdminDetails details =  autil.toDetails(admin);
		
		return details;
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/update")
	public AdminDetails update(@PathVariable("id") Integer userId) {
		
		System.out.println("cntrlr fetched id:" +userId);
		Admin admin=aserv.update(userId);
		AdminDetails details = autil.toDetails(admin);
		System.out.println("details: " + details);
		return details;
	}
	
	

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
	public AdminDetails add(@RequestBody @Valid CreateAdminRequest requestData) {
		System.out.println("req data: " + requestData);
		Admin admin = new Admin(requestData.getAdmin_name(),requestData.getAdmin_contact());
		Set<Community> comm = requestData.getCommunity();
		if (comm != null) {
			for (Community community : comm) {
				admin.addCommunity(community);
			}
		}
		System.out.println("Admin came: " + admin);
		admin = aserv.register(admin);
		AdminDetails details = autil.toDetails(admin);
		return details;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/by/id/{id}")
	public AdminDetails findById(@PathVariable("id") Integer userId) {
		System.out.println("cntrlr fetch id: " + userId);
		Admin admin = aserv.findById(userId);
		AdminDetails details = autil.toDetails(admin);
		System.out.println("details: " + details);
		return details;
	}
	
}
