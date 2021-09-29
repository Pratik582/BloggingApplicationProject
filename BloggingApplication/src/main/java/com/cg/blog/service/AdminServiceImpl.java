package com.cg.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.blog.dao.IAdminDao;
import com.cg.blog.dao.ICommunityDao;
import com.cg.blog.entities.Admin;
import com.cg.blog.entities.Community;
import com.cg.blog.exception.AdminAlreadyExistsException;
import com.cg.blog.exception.AdminNotExistsException;
import com.cg.blog.exception.AdminNotFoundException;
import com.cg.blog.exception.CommunityAlreadyExistsException;
import com.cg.blog.exception.CommunityNotExistsException;
import com.cg.blog.exception.CommunityNotFoundException;

@Component
public class AdminServiceImpl implements AdminServiceIntf 
{

	@Autowired
	public ICommunityDao cDao;
	@Autowired
	public IAdminDao aDao;

	@Override
	public Community createCommunity(Community community) {
		boolean exists= community.getCommunityId() != 0 && aDao.existsById(community.getCommunityId());
        if(exists){
            throw new CommunityAlreadyExistsException("community already exists for id="+community.getCommunityId());
        }
        community = cDao.save(community);
        System.out.println("returning saved blog: " + community);
        return community;
		
	}

	@Override
	public Community updateCommunity(Integer communityId) {
		Optional<Community> op=cDao.findById(communityId);
		if(!op.isPresent())
			throw new CommunityNotExistsException("no community exist for id:"+communityId);
		Community community=op.get();
		cDao.save(community);
		return community;
	}

	
	@Override
	public List<Community> listAllCommunity() {
		List<Community> community=cDao.findAll();
		return community;
	}

	@Override
	public Community deleteCommunity(Integer communityId) {
		Optional<Community> op=cDao.findById(communityId);
		if(!op.isPresent())
			throw new CommunityNotFoundException("no community find for id:"+communityId);
		Community community=op.get();
		cDao.deleteById(communityId);
		
		return community;
	}

	@Override
	public Admin findById(Integer userId) {
		System.out.println("id: "+userId);
        Optional<Admin> optional = aDao.findById(userId);
        if(!optional.isPresent()){
        	System.out.println("***error***");
            throw new AdminNotFoundException("Admin not found for id="+ userId);
        }
        Admin admin=optional.get();
        System.out.println("admin: "+ admin);
        return admin;
		
	}

	@Override
	public Admin register(Admin admin) {
		boolean exists= admin.getUserId() != 0 && cDao.existsById(admin.getUserId());
        if(exists){
            throw new AdminAlreadyExistsException("admin already exists for id="+admin.getUserId());
        }
        admin = aDao.save(admin);
        System.out.println("returning saved : " + admin);
        return admin;
		
	}

	@Override
	public Admin update(Integer userId) {
		System.out.println("id :" +userId);
		Optional<Admin> op=aDao.findById(userId);
		if(!op.isPresent())
			throw new AdminNotExistsException("no community exist for id:"+userId);
		Admin admin=op.get();
		aDao.save(admin);
		return admin;
		
		
	}

	@Override
	public Admin delete(Integer userId) {
		Optional<Admin> op=aDao.findById(userId);
		if(!op.isPresent())
			throw new AdminNotFoundException("no admin found for id:" +userId);
	   Admin admin=op.get();
		aDao.deleteById(userId);
		
		return admin;	
		
	}

	
}
