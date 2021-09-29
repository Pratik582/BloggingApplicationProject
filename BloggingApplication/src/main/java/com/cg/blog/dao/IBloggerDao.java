package com.cg.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.blog.entities.Blogger;

public interface IBloggerDao extends JpaRepository<Blogger,Integer>
 {

}
