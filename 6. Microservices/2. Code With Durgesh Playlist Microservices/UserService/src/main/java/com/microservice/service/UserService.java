package com.microservice.service;

import java.util.List;

import com.microservice.dto.UserDto;

public interface UserService {
	
	public UserDto createUser(UserDto userDto);
	public UserDto getUser(int userId);
	public List<UserDto> getAllUser();
	public UserDto updateUser(UserDto userDto);
	public UserDto deleteUser(int userId);

}
