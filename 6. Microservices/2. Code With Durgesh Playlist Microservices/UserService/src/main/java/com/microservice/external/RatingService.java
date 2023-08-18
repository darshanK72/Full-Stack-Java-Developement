package com.microservice.external;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.entity.Rating;

@FeignClient(name = "rating-service")
public interface RatingService {
	
	@GetMapping("/api/rating/get/user/{userId}")
	public Rating[] getAllUserRating(@PathVariable("userId") int userId);

}
