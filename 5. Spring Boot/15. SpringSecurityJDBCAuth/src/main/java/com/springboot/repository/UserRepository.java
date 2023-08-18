package com.springboot.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{
    
    Optional<User> findByUsername(String username);
}
