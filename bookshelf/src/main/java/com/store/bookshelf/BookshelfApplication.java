package com.store.bookshelf;

import com.store.bookshelf.entity.Books;
import com.store.bookshelf.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Arrays;

@SpringBootApplication
public class BookshelfApplication implements CommandLineRunner{

	@Autowired
	BookRepository bookRepository;
	public static void main(String[] args) {

		SpringApplication.run(BookshelfApplication.class, args);
	}

	 @Override
	public void run(String... args) throws Exception{
		 Books b1 = new Books("J.K Rowling", "Harry Potter", 1997);
		 Books b2 = new Books("Stephen King","IT", 1986 );

		 bookRepository.booky.addAll(Arrays.asList(b1,b2));
	 }
}
