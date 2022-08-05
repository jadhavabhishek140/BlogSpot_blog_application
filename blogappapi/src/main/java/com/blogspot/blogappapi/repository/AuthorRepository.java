package com.blogspot.blogappapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogspot.blogappapi.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
