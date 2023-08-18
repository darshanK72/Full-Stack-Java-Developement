package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Reader;
import com.springboot.service.ReaderService;

@RestController
public class ReaderController {

	@Autowired
	private ReaderService readerService;
	
	@GetMapping("/reader/{readerId}")
	public ResponseEntity<Reader> getReader(@PathVariable("readerId") int id)
	{
		Reader reader = this.readerService.getReader(id);
		if(reader == null)
		{	
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(reader);
	}
	
	@GetMapping("/reader")
	public ResponseEntity<List<Reader>> getAllReaders()
	{
		List<Reader> readerList = this.readerService.getAllReader();
		
		if(readerList == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(readerList);
	}
}
