package com.bookshop.catalog.domain;

/**
 * User: fuzongyang
 * Date: 2023/4/7
 * Time: 14:53
 */
public class BookAlreadyExistsException extends RuntimeException{

    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }

}
