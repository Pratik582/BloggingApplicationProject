package com.cg.blog.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.cg.blog.dto.AdminDetails;
import com.cg.blog.dto.CommunityDetails;
import com.cg.blog.entities.Admin;
import com.cg.blog.entities.Community;

@Component
public class AdminUtil
{
	public AdminDetails toDetails(Admin admin)
	{
		AdminDetails myAdmin = new AdminDetails();
		myAdmin.setUserId(admin.getUserId());
		myAdmin.setAdmin_name(admin.getAdmin_name());
		myAdmin.setAdmin_contact(admin.getAdmin_contact());
		
		Set<CommunityDetails> mySet = new HashSet<CommunityDetails>();
		Set<Community> setOfCommunity = admin.getCommunity();
		for(Community commty:setOfCommunity)
		{
			mySet.add(new CommunityDetails(commty));
		}
		myAdmin.setCommDetails(mySet);
		return myAdmin;
	}
	
	
	public CommunityDetails toDetails2(Community community)
	{
		CommunityDetails myCommunity = new CommunityDetails();
		myCommunity.setCommunityId(community.getCommunityId());
		myCommunity.setTotalMembers(community.getTotalMembers());
		myCommunity.setTotalMembers(community.getTotalMembers());
		myCommunity.setDate(community.getDate());
		myCommunity.setImage(community.getImage());
		return myCommunity;
	}
	
	public List<CommunityDetails> toDetails1(Collection<Community> community)
	{
		List<CommunityDetails> myCommunityList = new ArrayList<CommunityDetails>();
		for(Community myComm:community)
		{
			 CommunityDetails details = toDetails2(myComm);
	         System.out.println(details);
	         myCommunityList.add(details);
		}
		return myCommunityList;
	}
	
	public List<AdminDetails> toDetails(Collection<Admin> admin)
	{
		List<AdminDetails> myAdminList = new ArrayList<AdminDetails>();
		for(Admin myAdmin:admin)
		{
			 AdminDetails details = toDetails(myAdmin);
	         System.out.println(details);
	         myAdminList.add(details);
		}
		return myAdminList;
	}
}
