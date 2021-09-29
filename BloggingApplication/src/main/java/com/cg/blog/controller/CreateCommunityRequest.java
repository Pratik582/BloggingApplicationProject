package com.cg.blog.controller;

import java.io.File;
import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateCommunityRequest 
{
	@NotBlank @Size(min=2, max=20)
	String communityDescription;
	@Max(100)
	int totalMembers;
	@Max(1000)
	int onlineMembers;
	File image;
	LocalDate date;
	
	
	
	public CreateCommunityRequest(@NotBlank @Size(min = 2, max = 20) String communityDescription,
			@Max(100) int totalMembers, @Max(1000) int onlineMembers, File image, LocalDate date) {
		super();
		this.communityDescription = communityDescription;
		this.totalMembers = totalMembers;
		this.onlineMembers = onlineMembers;
		this.image = image;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "CreateCommunityRequest [communityDescription=" + communityDescription + ", totalMembers=" + totalMembers
				+ ", onlineMembers=" + onlineMembers + ", image=" + image + ", date=" + date + "]";
	}

	public String getCommunityDescription() {
		return communityDescription;
	}
	public void setCommunityDescription(String communityDescription) {
		this.communityDescription = communityDescription;
	}
	public int getTotalMembers() {
		return totalMembers;
	}
	public void setTotalMembers(int totalMembers) {
		this.totalMembers = totalMembers;
	}
	public int getOnlineMembers() {
		return onlineMembers;
	}
	public void setOnlineMembers(int onlineMembers) {
		this.onlineMembers = onlineMembers;
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
