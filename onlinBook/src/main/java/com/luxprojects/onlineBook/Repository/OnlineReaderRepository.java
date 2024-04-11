package com.luxprojects.onlineBook.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.luxprojects.onlineBook.Entities.OnlineReader;

public interface OnlineReaderRepository extends ReactiveCrudRepository<OnlineReader, Long> {

}
