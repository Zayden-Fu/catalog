package com.bookshop.catalog.domain;

/**
 * User: fuzongyang
 * Date: 2023/4/7
 * Time: 14:54
 */
public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
