package com.luxprojects.onlineBook.Interfaces;


import com.luxprojects.onlineBook.Dtos.CategoryResponseDTO;
import com.luxprojects.onlineBook.Dtos.CategoryResquestDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICategory {

	public Flux<CategoryResponseDTO> getAllCategory();
	public Mono<CategoryResponseDTO> getCategoryById(Long id);
	public Mono<CategoryResponseDTO> addCategory(CategoryResquestDTO categoryResquestDTO);
	public Mono<CategoryResponseDTO> updateCategory(CategoryResquestDTO categoryResquestDTO, Long id);
	public String deleteCategory(Long id);
}
