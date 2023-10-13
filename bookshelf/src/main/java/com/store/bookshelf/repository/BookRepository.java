package com.store.bookshelf.repository;

import com.store.bookshelf.entity.Books;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    public List<Books> booky = new ArrayList<Books>();

    public List<Books> getAll() {
        return booky;
    }

    public String add(Books book) {
        booky.add(book);
        return "successfully added";
    }

    public String edit(Books book) {
        booky.stream().filter(b -> b.getAuthor() == book.getAuthor()).forEach(b -> {
            b.setBookName(book.getBookName());
            b.setYearOfPublish(book.getYearOfPublish());
        });

        return "Successfully updated";
    }

    public String delete(int bookNo) {

        booky.remove(bookNo-1);
        return "deleted";
    }
}
