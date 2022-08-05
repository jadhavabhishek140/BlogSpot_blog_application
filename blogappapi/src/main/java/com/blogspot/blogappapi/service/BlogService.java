package com.blogspot.blogappapi.service;

import org.springframework.stereotype.Service;

import com.blogspot.blogappapi.entity.Blog;
import com.blogspot.blogappapi.requestdto.BlogDto;

@Service
public interface BlogService {

	public Blog getBlog(int id);

	public void addBlog(BlogDto blogDto);

}
