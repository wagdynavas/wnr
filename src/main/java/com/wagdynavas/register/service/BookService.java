package com.wagdynavas.register.service;

import com.wagdynavas.register.domain.Book;

import java.io.Serializable;
import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    List<Book> getBooksByReader(Long id);

    void createBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);
}
