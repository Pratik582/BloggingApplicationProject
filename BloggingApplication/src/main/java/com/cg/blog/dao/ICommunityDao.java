package com.cg.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.cg.blog.entities.Community;
@Component
public interface ICommunityDao extends JpaRepository<Community, Integer>
{

}
