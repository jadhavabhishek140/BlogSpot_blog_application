package com.blogspot.blogappapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogspot.blogappapi.entity.Blog;
import com.blogspot.blogappapi.repository.BlogRepository;
import com.blogspot.blogappapi.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogRepository blogRepository;

	@Override
	public Blog getBlog(int id) {
		return blogRepository.findById(id).get();
	}

}
