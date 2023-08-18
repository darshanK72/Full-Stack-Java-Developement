package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.dto.RatingDto;
import com.microservice.service.RatingService;

@RestController
@RequestMapping("/api/rating")
public class RatingController {
	
	@Autowired
	private RatingService reatingService;
	
	@PreAuthorize("hasAuthority('SCOPE_internal')")
	@GetMapping("/get/{ratingId}")
	public ResponseEntity<RatingDto> getRating(@PathVariable("ratingId")int ratingId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.reatingService.getRating(ratingId));
		
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<RatingDto>> getAllReating()
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.reatingService.getAllReating());
	}
	
	@GetMapping("/get/hotel/{hotelId}")
	public ResponseEntity<List<RatingDto>> getAllHotelRating(@PathVariable("hotelId")int hotelId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.reatingService.getAllHotelRating(hotelId));
	}
	
	@GetMapping("/get/user/{userId}")
	public ResponseEntity<List<RatingDto>> getAllUserRating(@PathVariable("userId")int userId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.reatingService.getAllUserRating(userId));
	}
	
	@PostMapping("/create")
	public ResponseEntity<RatingDto> createRating(@RequestBody RatingDto ratingDto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.reatingService.createRating(ratingDto));
	}
	
	@PutMapping("/update")
	public ResponseEntity<RatingDto> updateRating(@RequestBody RatingDto ratingDto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.reatingService.updateRating(ratingDto));
	}
	
	@DeleteMapping("/delete/{ratingId}")
	public ResponseEntity<RatingDto> deleteRating(@PathVariable("ratingId") int ratingId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.reatingService.deleteRating(ratingId));
	}
}
