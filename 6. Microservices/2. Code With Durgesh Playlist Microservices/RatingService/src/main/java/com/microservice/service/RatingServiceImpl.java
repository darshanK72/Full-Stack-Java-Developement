package com.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dto.RatingDto;
import com.microservice.entity.Rating;
import com.microservice.exception.ResourceNotFoundException;
import com.microservice.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public List<RatingDto> getAllReating() {
		List<Rating> ratingList = (List<Rating>) this.ratingRepository.findAll();
		
		return ratingList.stream().map(this::mapRatingToDto).toList();
		
	}

	@Override
	public RatingDto getRating(int ratingId) {
		Rating rating = this.ratingRepository.findById(ratingId)
								.orElseThrow(() -> new ResourceNotFoundException("Rating is not found with Id : " + ratingId));
		return this.mapRatingToDto(rating);
	}

	@Override
	public RatingDto createRating(RatingDto ratingDto) {
		Rating rating = this.mapDtoToRating(ratingDto);
		
		return this.mapRatingToDto(this.ratingRepository.save(rating));
	}

	@Override
	public RatingDto updateRating(RatingDto ratingDto) {
		Rating rating = this.ratingRepository.findById(ratingDto.getRatingId())
				.orElseThrow(() -> new ResourceNotFoundException("Rating is not found with Id : " + ratingDto.getRatingId()));
		
		rating.setRatingId(ratingDto.getRatingId());
		rating.setUserId(ratingDto.getUserId());
		rating.setHotelId(ratingDto.getHotelId());
		rating.setRating(ratingDto.getRating());
		rating.setFeedback(ratingDto.getFeedback());
		
		return this.mapRatingToDto(this.ratingRepository.save(rating));
	}

	@Override
	public RatingDto deleteRating(int ratingId) {
		Rating rating = this.ratingRepository.findById(ratingId).orElseThrow(() -> new ResourceNotFoundException("Rating is not found with Id : " + ratingId));
		
		this.ratingRepository.delete(rating);
		
		return this.mapRatingToDto(rating);
	}
	
	private RatingDto mapRatingToDto(Rating rating)
	{
		RatingDto ratingDto = RatingDto.builder()
									.ratingId(rating.getRatingId())
									.userId(rating.getUserId())
									.hotelId(rating.getHotelId())
									.rating(rating.getRating())
									.feedback(rating.getFeedback())
									.build();
		return ratingDto;
	}
	
	private Rating mapDtoToRating(RatingDto ratingDto)
	{
		Rating rating = Rating.builder()
									.ratingId(ratingDto.getRatingId())
									.userId(ratingDto.getUserId())
									.hotelId(ratingDto.getHotelId())
									.rating(ratingDto.getRating())
									.feedback(ratingDto.getFeedback())
									.build();
		return rating;
	}

	@Override
	public List<RatingDto> getAllUserRating(int userId) {
		List<Rating> ratingList = this.ratingRepository.findRatingByUserId(userId);
		
		return ratingList.stream().map(this::mapRatingToDto).toList();
	}

	@Override
	public List<RatingDto> getAllHotelRating(int hotelId) {
		List<Rating> ratingList = this.ratingRepository.findRatingByHotelId(hotelId);
		
		return ratingList.stream().map(this::mapRatingToDto).toList();
	
	}

}
