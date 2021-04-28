package com.example.teamproject.respository;


import org.springframework.data.repository.CrudRepository;
import com.example.teamproject.table.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
