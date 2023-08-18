package com.microservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.microservice.dto.HotelDto;
import com.microservice.dto.RatingDto;
import com.microservice.dto.UserDto;
import com.microservice.entity.Hotel;
import com.microservice.entity.Rating;
import com.microservice.entity.User;
import com.microservice.exception.ResourceNotFoundException;
import com.microservice.external.HotelService;
import com.microservice.external.RatingService;
import com.microservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private RatingService ratingService;

	@Override
	public UserDto createUser(UserDto userDto) {
		
		User user = this.userRepository.save(this.mapDtoToUser(userDto));
		
		return this.mapUserToDto(user);
		
	}

	@Override
	public UserDto getUser(int userId) {
		
		User user = this.userRepository.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User is not found with User Id : " + userId));
		
//		Rating[] ratings = this.restTemplate.getForObject("http://rating-service/api/rating/get/user/" + userId,Rating[].class);
		Rating[] ratings = this.ratingService.getAllUserRating(userId);	
		List<Rating> ratingList = Arrays.stream(ratings).toList();
		
		System.out.println(ratingList);
		
		List<RatingDto> dtoList = ratingList.stream().map(rating -> {
			RatingDto ratingDto = RatingDto.builder()
					.ratingId(rating.getRatingId())
					.userId(rating.getUserId())
					.rating(rating.getRating())
					.feedback(rating.getFeedback())
					.build();
			
//			Hotel hotel = this.restTemplate.getForObject("http://hotel-service/api/hotel/get/" + rating.getHotelId(), Hotel.class);

			Hotel hotel = this.hotelService.getHotel(rating.getHotelId());
			
			System.out.println(hotel);
			
			ratingDto.setHotelDto(HotelDto.builder()
					.hotelId(hotel.getHotelId())
					.hotelName(hotel.getHotelName())
					.location(hotel.getLocation())
					.build());
			
			return ratingDto;
			
		}).collect(Collectors.toList());
		
		System.out.println(dtoList);
		
		user.setRatings(dtoList);
		
		return this.mapUserToDto(user);
	}

	@Override
	public List<UserDto> getAllUser() {
		
		List<User> userList = (List<User>) this.userRepository.findAll();
		
		return userList.stream().map(this::mapUserToDto).toList();
	}

	@Override
	public UserDto updateUser(UserDto userDto) {
		User user = this.userRepository.findById(userDto.getUserid()).orElseThrow(()-> new ResourceNotFoundException("User is not found with User Id : " + userDto.getUserid()));
		
		user.setUserId(userDto.getUserid());
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		
		this.userRepository.save(user);
		
		return this.mapUserToDto(user);
	}

	@Override
	public UserDto deleteUser(int userId) {
		User user = this.userRepository.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User is not found with User Id : " + userId));
		
		this.userRepository.delete(user);
		
		return this.mapUserToDto(user);
		
	}
	
	private User mapDtoToUser(UserDto userDto)
	{
		User user = User.builder()
						.firstName(userDto.getFirstName())
						.lastName(userDto.getLastName())
						.username(userDto.getUsername())
						.password(userDto.getPassword())
						.ratings(userDto.getRatings())
						.build();
		
		return user;

	}
	
	private UserDto mapUserToDto(User user)
	{
		UserDto userDto = UserDto.builder()
								.userid(user.getUserId())
								.firstName(user.getFirstName())
								.lastName(user.getLastName())
								.username(user.getUsername())
								.password(user.getPassword())
								.ratings(user.getRatings())
								.build();
		
		return userDto;
	}

}
