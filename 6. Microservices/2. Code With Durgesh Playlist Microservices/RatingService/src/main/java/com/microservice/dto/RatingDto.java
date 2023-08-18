package com.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RatingDto {

	private int ratingId;
	private int hotelId;
	private int userId;
	private int rating;
	private String feedback;
}
