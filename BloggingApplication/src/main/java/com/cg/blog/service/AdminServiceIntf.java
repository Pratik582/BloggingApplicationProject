package com.cg.blog.service;

import java.util.List;

import com.cg.blog.entities.Admin;
import com.cg.blog.entities.Community;

public interface AdminServiceIntf {

	Admin delete(Integer userId);

	Admin update(Integer userId);

	Admin register(Admin admin);

	Admin findById(Integer userId);

	Community deleteCommunity(Integer communityId);

	List<Community> listAllCommunity();

	Community updateCommunity(Integer communityId);

	Community createCommunity(Community community);

	
}
