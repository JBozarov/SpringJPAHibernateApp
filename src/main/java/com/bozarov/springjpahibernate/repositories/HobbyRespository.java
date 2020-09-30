package com.bozarov.springjpahibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bozarov.springjpahibernate.domain.Hobby;

public interface HobbyRespository extends CrudRepository<Hobby, Long> {

}
