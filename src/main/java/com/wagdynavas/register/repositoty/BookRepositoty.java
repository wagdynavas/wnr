package com.wagdynavas.register.repositoty;

import com.wagdynavas.register.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepositoty extends JpaRepository<Book, Long> {

    @Override
    List<Book> findAll();

    List<Book> findByReader(String reader);
}
