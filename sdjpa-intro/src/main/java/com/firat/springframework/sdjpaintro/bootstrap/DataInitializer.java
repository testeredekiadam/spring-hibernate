package com.firat.springframework.sdjpaintro.bootstrap;

import org.springframework.boot.CommandLineRunner;

import com.firat.springframework.sdjpaintro.domain.Book;
import com.firat.springframework.sdjpaintro.repositories.BookRepository;

public class DataInitializer implements CommandLineRunner{

	
	private final BookRepository bookRepository;
	
	
	
	
	public DataInitializer(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}




	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse");
		
		System.out.println("Id: " + bookDDD.getId());
		
		Book savedDDD = bookRepository.save(bookDDD);
		
		System.out.println("Id: " + savedDDD.getId());
		
		Book bookSIA = new Book("Spring In Action", "234234", "Oriely");
		Book savedSIA = bookRepository.save(bookSIA);
		
		bookRepository.findAll().forEach(book -> {
			System.out.println("Book Id: " + book.getId());
			System.out.println("Book Title: " + book.getTitle());
			
		});
		
	}
	
}
