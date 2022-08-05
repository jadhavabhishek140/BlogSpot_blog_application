package com.blogspot.blogappapi.requestdto;

import java.util.Set;

import com.blogspot.blogappapi.entity.Category;

import lombok.Data;

@Data
public class BlogDto {
	
	private String title;
	
	private int authorId;
	
	private Set<Category> categories;
	
	private String content;

}
