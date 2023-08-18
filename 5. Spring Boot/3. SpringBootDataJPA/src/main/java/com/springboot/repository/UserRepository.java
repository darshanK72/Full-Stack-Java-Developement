package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.eitity.User;


public interface UserRepository extends CrudRepository <User,Integer>{
	
	public User findByFirstName(String name);
	public User findByFirstNameAndLastName(String firstName,String lastName);
	
	@Query("SELECT u FROM User u")
	public List<User> getAllUsers();
	
	@Query("SELECT u FROM User u WHERE u.firstName = :name")
	public User getUserByFirstName(@Param("name") String firstName);
	
	
	@Query(value = "SELECT * FROM user WHERE first_name = :firstName",nativeQuery = true)
	public User getUser(@Param("firstName") String firstName);
	
}
