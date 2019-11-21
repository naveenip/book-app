package com.example.bookapp.service;

import com.example.bookapp.module.Book;
import com.example.bookapp.repositary.BookRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepositary bookRepositary;

    public Book saveBook(Book book){
        Book newBook = bookRepositary.save(book);
        return newBook;
    }

    public Book findBookById(int id){
        Book book = bookRepositary.findById(id).orElse(new Book());
        return book;
    }

    public List<Book> viewAllBooks()
    {
        return bookRepositary.findAll();
    }

    public int deleteBook(int id){
       // Book book = bookRepositary.findBookByName(name);
        bookRepositary.deleteById(id);
       // bookRepositary.delete(book);
        return id;

    }

    public int updateOrAddBook(Book  book){

          Book b =  bookRepositary.save(book);
          return b.getId();
    }


}
