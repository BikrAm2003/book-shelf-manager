package com.bookstore.simple_bookstore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mybookrepository extends JpaRepository<MyBooklist,Integer>{

}
