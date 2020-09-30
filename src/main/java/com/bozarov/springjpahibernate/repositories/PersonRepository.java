package com.bozarov.springjpahibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bozarov.springjpahibernate.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	
}
