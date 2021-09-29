package com.cg.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogMain 
{
	public static void main(String[] args) {
		SpringApplication.run(BlogMain.class, args);
		System.out.println("Starting server");
	}

}
