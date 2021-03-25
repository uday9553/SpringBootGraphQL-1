package com.uday.repository;

import org.springframework.data.repository.CrudRepository;

import com.uday.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

	Person findByEmail(String email);

}
