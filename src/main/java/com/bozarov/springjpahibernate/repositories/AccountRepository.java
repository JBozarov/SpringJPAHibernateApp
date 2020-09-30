package com.bozarov.springjpahibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bozarov.springjpahibernate.domain.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
