package com.bozarov.springjpahibernate.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "people")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name = "name")
	private String name; 
	
	@OneToOne(cascade = CascadeType.ALL)
	private Account account; 
	
	
	@OneToMany(cascade = CascadeType.ALL) 
	Set<Car> cars = new HashSet<>();
	
	@ManyToMany
	@JoinTable(name = "peoples_hobbies", 
	joinColumns = @JoinColumn(name = "person_id"), 
	inverseJoinColumns = @JoinColumn(name = "hobby_id"))
	Set<Hobby> hobbies = new HashSet<>();
	
}

