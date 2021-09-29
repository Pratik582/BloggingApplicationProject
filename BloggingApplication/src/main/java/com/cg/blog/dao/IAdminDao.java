package com.cg.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.cg.blog.entities.Admin;
@Component
public interface IAdminDao extends JpaRepository<Admin, Integer>
{
	
}
