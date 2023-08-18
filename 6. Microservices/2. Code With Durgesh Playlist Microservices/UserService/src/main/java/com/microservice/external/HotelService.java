package com.microservice.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.entity.Hotel;

@FeignClient(name = "hotel-service")
public interface HotelService {
	
	@GetMapping("/api/hotel/get/{hotelId}")
	public Hotel getHotel(@PathVariable("hotelId") int hotelId);

}
