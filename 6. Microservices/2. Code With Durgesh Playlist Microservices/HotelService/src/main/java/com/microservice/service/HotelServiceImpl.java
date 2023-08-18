package com.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.dto.HotelDto;
import com.microservice.entity.Hotel;
import com.microservice.exception.ResourceNotFoundException;
import com.microservice.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public HotelDto getHotel(int hotelId) {
		Hotel hotel = this.hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel Not found with Hotel Id : " + hotelId));
		return this.mapHotelToDto(hotel);
	}

	@Override
	public List<HotelDto> getAllHotels() {
		List<Hotel> hotelList= (List<Hotel>) this.hotelRepository.findAll();
		
		return hotelList.stream().map(this::mapHotelToDto).toList();
		
	}

	@Override
	public HotelDto createHotel(HotelDto hotelDto) {
		Hotel hotel = this.mapDtoHotel(hotelDto);
		
		return this.mapHotelToDto(this.hotelRepository.save(hotel));
		
	}

	@Override
	public HotelDto updateHotel(HotelDto hotelDto) {
		Hotel hotel = this.hotelRepository.findById(hotelDto.getHotelId())
				.orElseThrow(()-> new ResourceNotFoundException("Hotel Not Found with Hotel Id : " + hotelDto.getHotelId()));
				
		hotel.setHotelId(hotelDto.getHotelId());
		hotel.setHotelName(hotelDto.getHotelName());
		hotel.setLocation(hotelDto.getLocation());
		
		return this.mapHotelToDto(this.hotelRepository.save(hotel));
	}
	@Override
	public HotelDto deleteHotel(int hotelId) {
		Hotel hotel = this.hotelRepository.findById(hotelId)
				.orElseThrow(()-> new ResourceNotFoundException("Hotel Not Found with Hotel Id : " + hotelId));
				
		this.hotelRepository.delete(hotel);
		return this.mapHotelToDto(hotel);
	}
	
	private HotelDto mapHotelToDto(Hotel hotel)
	{
		HotelDto hotelDto = HotelDto.builder()
								.hotelId(hotel.getHotelId())
								.hotelName(hotel.getHotelName())
								.location(hotel.getLocation())
								.build();
		
		return hotelDto;
	}
	
	private Hotel mapDtoHotel(HotelDto hotelDto)
	{
		Hotel hotel = Hotel.builder()
								.hotelId(hotelDto.getHotelId())
								.hotelName(hotelDto.getHotelName())
								.location(hotelDto.getLocation())
								.build();
		
		return hotel;
	}

}
