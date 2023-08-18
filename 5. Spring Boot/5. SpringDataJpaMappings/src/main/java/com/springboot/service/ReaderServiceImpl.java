package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Reader;
import com.springboot.repository.ReaderRepository;

@Service
public class ReaderServiceImpl implements ReaderService {

	@Autowired
	private ReaderRepository readerRepository;
	
	@Override
	public Reader getReader(int id) {
		
		return this.readerRepository.findById(id).orElse(null);
		
	}

	@Override
	public List<Reader> getAllReader() {
		return (List<Reader>) this.readerRepository.findAll();
	}

}
