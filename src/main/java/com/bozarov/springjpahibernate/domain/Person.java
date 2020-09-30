package com.bozarov.springjpahibernate.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(name = "name")
	private String name; 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "person") 
	Set<Car> cars = new HashSet<>(); 
	
	
}
