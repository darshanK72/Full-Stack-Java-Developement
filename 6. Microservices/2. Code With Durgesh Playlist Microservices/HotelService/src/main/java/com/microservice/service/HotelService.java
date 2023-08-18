package com.microservice.service;


import java.util.List;

import com.microservice.dto.HotelDto;

public interface HotelService {
	
	public HotelDto getHotel(int hotelId);
	public List<HotelDto> getAllHotels();
	public HotelDto createHotel(HotelDto hotelDto);
	public HotelDto updateHotel(HotelDto hotelDto);
	public HotelDto deleteHotel(int hotelId);
}
