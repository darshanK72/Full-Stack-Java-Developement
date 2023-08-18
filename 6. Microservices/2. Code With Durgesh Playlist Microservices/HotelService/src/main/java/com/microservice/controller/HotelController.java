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

import com.microservice.dto.HotelDto;
import com.microservice.service.HotelService;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	
	
	@GetMapping("/get")
	public ResponseEntity<List<HotelDto>> getAllHotel()
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.hotelService.getAllHotels());
	}
	
	@PreAuthorize("hasAuthority('SCOPE_internal')")
	@GetMapping("/get/{hotelId}")
	public ResponseEntity<HotelDto> getHotel(@PathVariable("hotelId") int hotelId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.hotelService.getHotel(hotelId));
	}
	
	@PostMapping("/create")
	public ResponseEntity<HotelDto> createHotel(@RequestBody HotelDto hotelDto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.hotelService.createHotel(hotelDto));
	}
	
	@PutMapping("/update")
	public ResponseEntity<HotelDto> updateHotel(@RequestBody HotelDto hotelDto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.hotelService.updateHotel(hotelDto));
	}
	
	@DeleteMapping("/delete/{hotelId}")
	public ResponseEntity<HotelDto> deleteHotel(@PathVariable("hotelId") int hotelId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(this.hotelService.deleteHotel(hotelId));
	}
	
	

}
