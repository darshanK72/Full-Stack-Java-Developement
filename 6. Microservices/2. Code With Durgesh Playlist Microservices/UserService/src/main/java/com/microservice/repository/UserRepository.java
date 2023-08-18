package com.microservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
