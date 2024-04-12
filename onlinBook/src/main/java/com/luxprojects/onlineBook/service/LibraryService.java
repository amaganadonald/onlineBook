package com.luxprojects.onlineBook.service;



import com.luxprojects.onlineBook.dto.LibraryRequestDTO;
import com.luxprojects.onlineBook.dto.LibraryResponseDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LibraryService {

	public Flux<LibraryResponseDTO> getAllLibrary();
	public Mono<LibraryResponseDTO> getLibraryById(Long id);
	public Mono<LibraryResponseDTO> addLibrary(LibraryRequestDTO libraryRequestDTO);
	public Mono<LibraryResponseDTO> updateLibrary(LibraryRequestDTO libraryRequestDTO, Long id);
	public String deleteLibrary(Long id);
}
