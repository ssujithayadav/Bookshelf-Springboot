package com.store.bookshelf.service;

import com.store.bookshelf.entity.Books;
import com.store.bookshelf.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public List<Books> getAll(){
        return bookRepository.getAll();
    }

    public String add(Books book){
        return bookRepository.add(book);
    }

    public String edit(Books book) {
        return bookRepository.edit(book);
    }

    public String delete(int bookNo) {
        return bookRepository.delete(bookNo);
    }

}
