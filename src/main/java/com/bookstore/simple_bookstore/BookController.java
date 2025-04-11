package com.bookstore.simple_bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @Autowired
    private mybookservice mbs;

    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("/book_register")
    public String bookRegister(Model model) {
        model.addAttribute("book", new Book());
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBooks() {
        List<Book> list = service.getallbook();
        return new ModelAndView("availableBooks", "book", list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        service.save(b);
        return "redirect:/available_books";
    }

    @RequestMapping("/mylist/{id}")
    public String addToMyBooks(@PathVariable("id") int id) {
        Book b = service.getbookbyid(id);
        MyBooklist mb = new MyBooklist(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
        mbs.saveMyBooks(mb);
        return "redirect:/my_Books";
    }

    @GetMapping("/my_Books")
    public ModelAndView getMyBooks() {
        List<MyBooklist> list = mbs.getAllMyBooks();
        return new ModelAndView("myBooks", "book", list);
    }

    // @RequestMapping("/deleteBook/{id}")
    // public String deleteBook(@PathVariable("id") int id) {
    //     service.deleteById(id);
    //     return "redirect:/available_books";
    // }

    @RequestMapping("/deleteMyList/{id}")
    public String deleteFromMyBooks(@PathVariable("id") int id) {
        mbs.deleteById(id);
        return "redirect:/my_Books";
    }
    @GetMapping("/editMyList/{id}")
public String editMyList(@PathVariable("id") int id, Model model) {
    MyBooklist book = mbs.getBookById(id);
    model.addAttribute("book", book);
    return "editBook";
}

@PostMapping("/updateMyList")
public String updateMyList(@ModelAttribute MyBooklist book) {
    mbs.saveMyBooks(book);
    return "redirect:/my_Books";
}
}
