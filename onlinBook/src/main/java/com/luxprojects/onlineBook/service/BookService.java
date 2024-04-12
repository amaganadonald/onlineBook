package com.luxprojects.onlineBook.service;


import com.luxprojects.onlineBook.dto.BookRequestDTO;
import com.luxprojects.onlineBook.dto.BookResponseDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService  {

	public Flux<BookResponseDTO> getAllBook();
	public Mono<BookResponseDTO> getBookById(Long id);
	public Mono<BookResponseDTO> addBook(BookRequestDTO bookRequestDTO);
	public Mono<BookResponseDTO> updateBook(BookRequestDTO bookRequestDTO, Long id);
	public String deleteBook(Long id);
}
