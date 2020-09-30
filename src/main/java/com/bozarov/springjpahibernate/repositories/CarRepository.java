package com.bozarov.springjpahibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bozarov.springjpahibernate.domain.Car;

public interface CarRepository extends CrudRepository<Car, Long> {

}
