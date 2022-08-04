package com.blogspot.blogappapi.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.blogspot.blogappapi.enums.Usertype;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private String password;
	
	private String email;

	private Set<Usertype> usertype;
	
	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "reader_id")
	private Reader reader;

	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id")
	private Author author;
	
}
