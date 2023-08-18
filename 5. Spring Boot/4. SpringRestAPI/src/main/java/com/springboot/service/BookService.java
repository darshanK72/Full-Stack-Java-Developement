package com.springboot.service;

import java.util.List;

import com.springboot.entity.Book;

public interface BookService {
	
	public Book getBook(int bookId);
	public List<Book> getAllBooks();
	public String addBook(Book book);
	public String deleteBook(int bookId);
	public String updateBook(int bookId,Book book);

}
