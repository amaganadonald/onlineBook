package com.luxprojects.onlineBook.service;


import com.luxprojects.onlineBook.dto.CategoryResponseDTO;
import com.luxprojects.onlineBook.dto.CategoryResquestDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CategoryService {

	public Flux<CategoryResponseDTO> getAllCategory();
	public Mono<CategoryResponseDTO> getCategoryById(Long id);
	public Mono<CategoryResponseDTO> addCategory(CategoryResquestDTO categoryResquestDTO);
	public Mono<CategoryResponseDTO> updateCategory(CategoryResquestDTO categoryResquestDTO, Long id);
	public String deleteCategory(Long id);
}
