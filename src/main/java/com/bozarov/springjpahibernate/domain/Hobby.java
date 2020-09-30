package com.bozarov.springjpahibernate.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity
public class Hobby {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name = "name")
	private String name; 
	
	@Column(name = "desc")
	@Lob
	private String description;
	
	@ManyToMany(mappedBy = "hobbies") // if we don't use mappedBy it will create 2 join tables 
	private Set<Person> persons; 
	
}
