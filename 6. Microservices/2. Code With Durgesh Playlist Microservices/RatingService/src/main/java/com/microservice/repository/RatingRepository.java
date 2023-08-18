package com.microservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.microservice.entity.Rating;

public interface RatingRepository extends CrudRepository<Rating,Integer> {
	
	List<Rating> findRatingByUserId(int userId);
	List<Rating> findRatingByHotelId(int hotelId);
}
