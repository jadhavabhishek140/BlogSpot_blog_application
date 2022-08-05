package com.blogspot.blogappapi.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Blog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	@ManyToOne(optional = false, cascade = { CascadeType.PERSIST, CascadeType.MERGE})
	private Author author;
	
	@CreationTimestamp
	private LocalDateTime datePosted;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdatedOn;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private Set<Category> categories;
	
	private String content;

}
