package com.luxprojects.onlineBook.Repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.luxprojects.onlineBook.Entities.Book;

public interface BookRepository extends ReactiveCrudRepository<Book, Long> {

}
