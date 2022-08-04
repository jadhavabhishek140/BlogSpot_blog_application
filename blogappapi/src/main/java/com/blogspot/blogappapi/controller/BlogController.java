package com.blogspot.blogappapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogspot.blogappapi.entity.Blog;
import com.blogspot.blogappapi.service.BlogService;

@RestController
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	public ResponseEntity<Object> getBlog(int id){
		Blog blog = blogService.getBlog(id);
		
		return new ResponseEntity<>(blog, HttpStatus.OK);
	}

}
