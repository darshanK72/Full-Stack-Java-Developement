package com.springboot.service;

import java.util.List;

import com.springboot.entity.Reader;

public interface ReaderService {
	public Reader getReader(int id);
	public List<Reader> getAllReader();

}
