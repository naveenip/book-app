package com.example.bookapp.controller;


import com.example.bookapp.module.Book;
import com.example.bookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
@CrossOrigin(value = "http://localhost:4200")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/")
    public String[] test(){
        return new String[]{"Book app is up"};
    }

    @PostMapping("/add")
    public List<Book> addBook(@RequestBody Book book){
        Book savedBook = bookService.saveBook(book);
        return bookService.viewAllBooks();
    }

    @GetMapping("/id/{id}")
    public Book getBookById(@PathVariable("id") int id){
        Book book = bookService.findBookById(id);
        return  book;
    }

    @GetMapping("/viewall")
    public List<Book> getAllBooks(){
        return bookService.viewAllBooks();
    }


    @DeleteMapping("/delete/{id}")
    public List<Book> deleteBook(@PathVariable("id") int id){
         bookService.deleteBook(id);
        return bookService.viewAllBooks();
    }

    @PutMapping("/addUpdate")
    public List<Book> updateBook(@RequestBody Book book){
        bookService.updateOrAddBook(book);
        return bookService.viewAllBooks();
    }
}
