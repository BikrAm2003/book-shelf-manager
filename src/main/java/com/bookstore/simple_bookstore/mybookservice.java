package com.bookstore.simple_bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class mybookservice {
    
    @Autowired
	private mybookrepository mybook;

    public void saveMyBooks(MyBooklist book) {
		mybook.save(book);
	}
	
	public List<MyBooklist> getAllMyBooks(){
		return mybook.findAll();
	}
	
	public void deleteById(int id) {
		mybook.deleteById(id);
	}

    // ✅ Add this method for editing support
    public MyBooklist getBookById(int id) {
        return mybook.findById(id).orElse(null);
    }
}
