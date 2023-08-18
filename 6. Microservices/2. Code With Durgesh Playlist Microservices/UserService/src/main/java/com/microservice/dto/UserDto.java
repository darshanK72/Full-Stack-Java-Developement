package com.microservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDto {
	
	private int userid;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private List<RatingDto> ratings;

}
