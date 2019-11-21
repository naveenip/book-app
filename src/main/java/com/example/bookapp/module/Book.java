package com.example.bookapp.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    //private int id;
    private int id;

    private String name;
    private String author;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }


}
