package com.cg.blog.dto;

import java.util.Set;

public class AdminDetails {
	private Integer userId;
	private String admin_name;
	private String admin_contact;
	public Set<CommunityDetails> commDetails;
	
	public AdminDetails() {
		
	}
	public Set<CommunityDetails> getCommDetails() {
		return commDetails;
	}
	public void setCommDetails(Set<CommunityDetails> commDetails) {
		this.commDetails = commDetails;
	}
	public AdminDetails(Integer userId, String admin_name, String admin_contact) {
		super();
		this.userId = userId;
		this.admin_name = admin_name;
		this.admin_contact = admin_contact;
	}
	public AdminDetails(Integer userId, String admin_name, String admin_contact, Set<CommunityDetails> commDetails) {
		super();
		this.userId = userId;
		this.admin_name = admin_name;
		this.admin_contact = admin_contact;
		this.commDetails = commDetails;
	}
	@Override
	public String toString() {
		return "AdminDetails [userId=" + userId + ", admin_name=" + admin_name + ", admin_contact=" + admin_contact
				+ ", commDetails=" + commDetails + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_contact() {
		return admin_contact;
	}
	public void setAdmin_contact(String admin_contact) {
		this.admin_contact = admin_contact;
	}
		
}
