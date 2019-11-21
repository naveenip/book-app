package com.example.bookapp.repositary;

import com.example.bookapp.module.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositary  extends JpaRepository<Book,Integer> {


    //public Book findBookByName(String name);

}
