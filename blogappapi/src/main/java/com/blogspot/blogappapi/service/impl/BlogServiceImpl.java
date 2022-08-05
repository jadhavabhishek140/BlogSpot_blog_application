package com.blogspot.blogappapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogspot.blogappapi.entity.Author;
import com.blogspot.blogappapi.entity.Blog;
import com.blogspot.blogappapi.repository.AuthorRepository;
import com.blogspot.blogappapi.repository.BlogRepository;
import com.blogspot.blogappapi.requestdto.BlogDto;
import com.blogspot.blogappapi.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogRepository blogRepository;
	
	@Autowired
	AuthorRepository authorRepository;

	@Override
	public Blog getBlog(int id) {
		return blogRepository.findById(id).get();
	}

	@Override
	public void addBlog(BlogDto blogDto) {
		
		Blog blog = new Blog();
		
		Author author = authorRepository.getById(blogDto.getAuthorId());
		
		blog.setTitle(blogDto.getTitle());
		blog.setAuthor(author);
		blog.setCategories(blogDto.getCategories());
		blog.setContent(blogDto.getContent());
		
		blogRepository.save(blog);	
	}

}
