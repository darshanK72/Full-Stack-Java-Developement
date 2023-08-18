package com.springboot;

import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.entity.Address;
import com.springboot.entity.Book;
import com.springboot.entity.Certificate;
import com.springboot.entity.Reader;
import com.springboot.repository.ReaderRepository;

@SpringBootApplication
public class SpringDataJpaMappingsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaMappingsApplication.class, args);
		
		ReaderRepository repository = context.getBean(ReaderRepository.class);
		
//		Address address = new Address();
//		address.setCity("Malegoan");
//		address.setState("Maharashtra");
//		address.setPincode(423203);
//		address.setStreet("Anand Nagar");
//		
//		Reader reader = new Reader();
//		reader.setFirstName("Darshan");
//		reader.setLastName("Khairnar");
//		reader.setAddress(address);
//		address.setReader(reader);
//		
//		
//		Certificate certificate1 = new Certificate();
//		certificate1.setCertificateName("C Programming");
//		certificate1.setExpiryDate(new Date("20/12/2024"));
//		certificate1.setIssuingDate(new Date());
//		certificate1.setReader(reader);
//		
//		Certificate certificate2 = new Certificate();
//		certificate2.setCertificateName("Object Oriented Programming using C++");
//		certificate2.setExpiryDate(new Date("10/08/2025"));
//		certificate2.setIssuingDate(new Date());
//		certificate2.setReader(reader);
//		
//		
//		Certificate certificate3 = new Certificate();
//		certificate3.setCertificateName("Core Java & Advance Java");
//		certificate3.setExpiryDate(new Date("21/02/2023"));
//		certificate3.setIssuingDate(new Date());
//		certificate3.setReader(reader);		
//		
//		List<Certificate> certificates = List.of(certificate1,certificate2,certificate3);
//		reader.setCertificates(certificates);
//		
//		List<Reader> readers = List.of(reader);
//		
//		Book b1 = new Book();
//		b1.setBookName("The Game of Thrones");
//		b1.setBookAuthor("Jorge R. R. Martin");
//		b1.setBookPrice(1200);
//		b1.setReaders(readers);
//		
//		Book b2 = new Book();
//		b2.setBookName("Rich Dad, Poor Dad");
//		b2.setBookAuthor("Danial Creg");
//		b2.setBookPrice(800);
//		b2.setReaders(readers);
//		
//		List<Book> books = List.of(b1,b2);
//		
//		reader.setBooks(books);
//		
//		repository.save(reader);
	}

}
