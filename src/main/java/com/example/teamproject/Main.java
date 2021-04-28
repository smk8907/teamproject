package com.example.teamproject;

import com.example.teamproject.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.teamproject.table.Book;



@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Choco");
        Book book2 = new Book("Milk");

        bookRepository.save(book1);
        bookRepository.save(book2);
    }
}
