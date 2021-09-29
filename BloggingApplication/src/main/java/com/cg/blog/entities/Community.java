package com.cg.blog.entities;

import java.io.File;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CommunityTable")
public class Community 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer communityId;
	@Column(name="CommDescription")
	private String communityDescription;
	@Column(name="TotalMembers")
	private Integer totalMembers;
	@Column(name="OnlineMembers")
	private Integer onlineMembers;
	@Column(name="Image")
	private File image;
	@Column(name="Date")
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private Admin admin;
	public Community() {
		
	}
	
	
	
	public Community(String communityDescription, Integer totalMembers, File image, LocalDate date, Admin admin) {
		super();
		this.communityDescription = communityDescription;
		this.totalMembers = totalMembers;
		this.image = image;
		this.date = date;
		this.admin = admin;
	}



	public void add(Community comm) {
		comm.setCommunityId(comm.getCommunityId());
		comm.setCommunityDescription(comm.getCommunityDescription());
		comm.setTotalMembers(comm.getTotalMembers());
		comm.setImage(comm.getImage());
		comm.setDate(comm.getDate());
		comm.setAdmin(comm.getAdmin());
		
	}

	
	public Integer getCommunityId() {
		return communityId;
	}
	public void setCommunityId(int communityId) {
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
	public void setTotalMembers(int totalMembers) {
		this.totalMembers = totalMembers;
	}
	public Integer getOnlineMembers() {
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

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
