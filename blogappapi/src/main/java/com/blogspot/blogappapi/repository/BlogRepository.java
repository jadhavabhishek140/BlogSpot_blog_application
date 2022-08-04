package com.blogspot.blogappapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogspot.blogappapi.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
