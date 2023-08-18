package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Book;
import com.springboot.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/book/{bookId}")
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	public ResponseEntity<Book> getBook(@PathVariable("bookId") int bookId)
	{
		Book book = this.bookService.getBook(bookId);
		
		if(book == null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(book);
		
	}
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		List<Book> bookList = this.bookService.getAllBooks();
		if(bookList.size() == 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(bookList);
	}
	
	@PostMapping("/book")
	public String addBook(@RequestBody Book book)
	{
		return this.bookService.addBook(book);
	}
	
	@DeleteMapping("/book/{bookId}")
	public String deleteBook(@PathVariable("bookId") int bookId)
	{
		return this.bookService.deleteBook(bookId);
	}
	
	@PutMapping("/book/{bookId}")
	public String updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId)
	{
		return this.bookService.updateBook(bookId,book);
	}
}
