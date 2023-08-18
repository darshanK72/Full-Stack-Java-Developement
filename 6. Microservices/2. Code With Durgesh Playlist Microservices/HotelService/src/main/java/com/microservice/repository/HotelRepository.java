package com.microservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.entity.Hotel;

public interface HotelRepository extends CrudRepository<Hotel,Integer>{

}
