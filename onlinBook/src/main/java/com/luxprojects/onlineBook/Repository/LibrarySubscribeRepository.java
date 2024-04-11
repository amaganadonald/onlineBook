package com.luxprojects.onlineBook.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.luxprojects.onlineBook.Entities.LibrarySubscribes;


public interface LibrarySubscribeRepository extends ReactiveCrudRepository<LibrarySubscribes, Long> {

}
