package com.microservice.service;

import java.util.List;

import com.microservice.dto.RatingDto;

public interface RatingService {
	
	public List<RatingDto> getAllReating();
	public RatingDto getRating(int ratingId);
	public RatingDto createRating(RatingDto ratingDto);
	public RatingDto updateRating(RatingDto ratingDto);
	public RatingDto deleteRating(int ratingId);
	public List<RatingDto> getAllUserRating(int userId);
	public List<RatingDto> getAllHotelRating(int hotelId);
	
}
