package com.luxprojects.onlineBook.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.luxprojects.onlineBook.Entities.Category;

public interface CategoryRepository extends ReactiveCrudRepository<Category, Long> {

}
