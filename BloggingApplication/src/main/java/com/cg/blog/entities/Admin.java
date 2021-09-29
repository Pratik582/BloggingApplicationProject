package com.cg.blog.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@Column(name="AdminName")
	private String admin_name;
	@Column(name="AdminContact")
	private String admin_contact;
	@Column(name="ConnectedCommunity")
	@OneToMany(mappedBy="admin",cascade=CascadeType.ALL)
	private Set<Community> comm = new HashSet<>();
	public Admin(int userId, String admin_name, String admin_contact) {
		super();
		this.userId = userId;
		this.admin_name = admin_name;
		this.admin_contact = admin_contact;
	}
	public Admin() {
		
	}
	
	
	
	public Admin(String admin_name, String admin_contact) {
		super();
		this.admin_name = admin_name;
		this.admin_contact = admin_contact;
	}
	public Set<Community> getCommunity() {
		return comm;
	}

	public void setCommunity(Set<Community> comm) {
		this.comm = comm;
	}
	public void addCommunity(Community comm) {
		comm.setAdmin(this);
		comm.add(comm);
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
