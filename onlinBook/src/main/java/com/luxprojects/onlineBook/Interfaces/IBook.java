package com.luxprojects.onlineBook.Interfaces;


import com.luxprojects.onlineBook.Dtos.BookRequestDTO;
import com.luxprojects.onlineBook.Dtos.BookResponseDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IBook  {

	public Flux<BookResponseDTO> getAllBook();
	public Mono<BookResponseDTO> getBookById(Long id);
	public Mono<BookResponseDTO> addBook(BookRequestDTO bookRequestDTO);
	public Mono<BookResponseDTO> updateBook(BookRequestDTO bookRequestDTO, Long id);
	public String deleteBook(Long id);
}
