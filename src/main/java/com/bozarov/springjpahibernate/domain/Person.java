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

	public Person() {
		
	}
	
	public Person(Long id, String name, Account account, Set<Car> cars, Set<Hobby> hobbies) {
		this.id = id;
		this.name = name;
		this.account = account;
		this.cars = cars;
		this.hobbies = hobbies;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	public Set<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<Hobby> hobbies) {
		this.hobbies = hobbies;
	}
	
}

