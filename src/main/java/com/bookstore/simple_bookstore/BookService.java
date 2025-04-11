package com.bookstore.simple_bookstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;
    public void save(Book b){
        bRepo.save(b);
    }
    public List<Book> getallbook(){
        
        return bRepo.findAll();
        
    }
    public Book getbookbyid(int id){
        return bRepo.findById(id).get();
    }
}
