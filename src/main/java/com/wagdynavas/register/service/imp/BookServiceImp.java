package com.wagdynavas.register.service.imp;

import com.wagdynavas.register.domain.Book;
import com.wagdynavas.register.repositoty.BookRepositoty;
import com.wagdynavas.register.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookRepositoty bookRepositoty;

    @Override
    public List<Book> getAllBooks() {
        return bookRepositoty.findAll();
    }

    @Override
    public List<Book> getBooksByReader(Long id) {
        return null;
    }

    @Override
    public void createBook(Book book) {
        if(book != null) {
            bookRepositoty.save(book);
        }
    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public void deleteBook(Long id) {

    }
}
