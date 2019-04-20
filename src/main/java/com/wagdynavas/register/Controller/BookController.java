package com.wagdynavas.register.Controller;

import com.wagdynavas.register.domain.Book;
import com.wagdynavas.register.repositoty.BookRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class BookController {

    private BookRepositoty bookRepositoty;

    @Autowired
    public BookController(BookRepositoty bookRepositoty){
        this.bookRepositoty  = bookRepositoty;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model) {
        List<Book> books = bookRepositoty.findByReader(reader);
        if (books != null) {
            model.addAttribute("books", books);
        }
        return "bookList";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addBook(@PathVariable("reader") String reader, Book book){
        book.setReader(reader);
        bookRepositoty.save(book);
        return "redirect:/{reader}";
    }
}
