package com.cg.blog.dto;

import java.io.File;
import java.time.LocalDate;

import com.cg.blog.entities.Community;

public class CommunityDetails 
{
	private Integer communityId;
	private String communityDescription;
	private Integer totalMembers;
	private File image;
	private LocalDate date;
	public CommunityDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommunityDetails(Integer communityId, String communityDescription, Integer totalMembers, File image,
			LocalDate date) {
		super();
		this.communityId = communityId;
		this.communityDescription = communityDescription;
		this.totalMembers = totalMembers;
		this.image = image;
		this.date = date;
	}
	
	public CommunityDetails(Community comm) {//What is the work?
		communityId=comm.getCommunityId();
		communityDescription=comm.getCommunityDescription();
		totalMembers=comm.getTotalMembers();
		image=comm.getImage();
		date=comm.getDate();
	}
	
	public Integer getCommunityId() {
		return communityId;
	}
	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
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
	
}
