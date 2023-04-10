package com.bookshop.catalog.domain;

import java.util.Optional;

/**
 * User: fuzongyang
 * Date: 2023/4/7
 * Time: 14:30
 */
public interface BookRepository {

    Iterable<Book> findAll();
    Optional<Book> findByIsbn(String isbn);
    boolean existByIsbn(String isbn);
    Book save(Book book);
    void deleteBook(String isbn);

}
