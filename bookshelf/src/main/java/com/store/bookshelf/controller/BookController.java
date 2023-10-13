package com.store.bookshelf.controller;

import com.store.bookshelf.entity.Books;
import com.store.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class BookController {
    @Autowired
    BookService bookService;

   @GetMapping("/get/all")
    public List<Books> getAll(){

       return bookService.getAll();
   }
    @PostMapping("/add")
    public String getAll(@RequestBody Books book){
        return bookService.add(book);
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Books book){
        return bookService.edit(book);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam int bookNo){
        return bookService.delete(bookNo);
    }


}
