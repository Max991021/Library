package org.example;

import java.lang.reflect.Array;

public class Member {

    private String[] books;

    public Member(String[] books){
        this.books = books;
    }

    public String[] getBooks() {
        return books;
    }

//    public void setBooks(String book) {
//        books += book;
//    }
}
