package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{

}
