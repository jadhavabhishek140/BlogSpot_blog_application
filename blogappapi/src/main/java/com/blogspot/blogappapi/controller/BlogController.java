package com.blogspot.blogappapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogspot.blogappapi.entity.Blog;
import com.blogspot.blogappapi.requestdto.BlogDto;
import com.blogspot.blogappapi.service.BlogService;

@RestController
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getBlog(@PathVariable int id){
		
		Blog blog = blogService.getBlog(id);
		
		return new ResponseEntity<>(blog, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> addBlog(@RequestBody BlogDto blogDto){
		
		blogService.addBlog(blogDto);
		
		return new ResponseEntity<>("Blog added Successfully.", HttpStatus.OK);
	}

}
