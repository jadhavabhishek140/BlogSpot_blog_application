package com.blogspot.blogappapi.service;

import org.springframework.stereotype.Service;

import com.blogspot.blogappapi.entity.Blog;

@Service
public interface BlogService {

	public Blog getBlog(int id);

}
