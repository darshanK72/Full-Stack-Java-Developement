package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Book;
import com.springboot.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book getBook(int bookId) {
		return this.bookRepository.findById(bookId).orElse(null);
	}

	@Override
	public List<Book> getAllBooks() {
		return (List<Book>) this.bookRepository.findAll();
		
	}

	@Override
	public String addBook(Book book) {
		this.bookRepository.save(book);
		return "Book Saved Successfully";
	}

	@Override
	public String deleteBook(int bookId) {
		this.bookRepository.deleteById(bookId);
		return "Book Deleted Successfully";
	}

	@Override
	public String updateBook(int bookId,Book book) {
		Book book1 = this.bookRepository.findById(bookId).orElse(null);
		System.out.println(book1);
		if(book1 != null)
		{
			book1.setBookAuthor(book.getBookAuthor());
			book1.setBookName(book.getBookName());
			book1.setBookPrice(book.getBookPrice());
		}
		this.bookRepository.save(book);
		return "Book Updated Successfully";
	}

}
