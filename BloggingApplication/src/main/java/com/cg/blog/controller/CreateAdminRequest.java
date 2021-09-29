package com.cg.blog.controller;

import java.io.File;
import java.time.LocalDate;
import java.util.Set;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.cg.blog.entities.Admin;
import com.cg.blog.entities.Community;



public class CreateAdminRequest {
	
	String admin_name;
	String admin_contact;
	private Set<Community> community;
	@NotBlank @Size(min=2, max=20)
	private String communityDescription;
	@Max(100)
	private Integer totalMembers;
	private File image;
	private LocalDate date;
	private Admin admin;
	@Override
	public String toString() {
		return "CreateAdminRequest [admin_name=" + admin_name + ", admin_contact=" + admin_contact + ", community="
				+ community + ", communityDescription=" + communityDescription + ", totalMembers=" + totalMembers
				+ ", image=" + image + ", date=" + date + ", admin=" + admin + "]";
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
	public Set<Community> getCommunity() {
		return community;
	}
	public void setCommunity(Set<Community> community) {
		this.community = community;
	}
	public String getCommunityDescription() {
		return communityDescription;
	}
	public void setCommunityDescription(String communityDescription) {
		this.communityDescription = communityDescription;
	}
	public Integer getTotalMembers() {
		return totalMembers;
	}
	public void setTotalMembers(Integer totalMembers) {
		this.totalMembers = totalMembers;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	
}
