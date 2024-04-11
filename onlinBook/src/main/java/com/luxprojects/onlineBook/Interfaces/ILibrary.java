package com.luxprojects.onlineBook.Interfaces;



import com.luxprojects.onlineBook.Dtos.LibraryRequestDTO;
import com.luxprojects.onlineBook.Dtos.LibraryResponseDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ILibrary {

	public Flux<LibraryResponseDTO> getAllLibrary();
	public Mono<LibraryResponseDTO> getLibraryById(Long id);
	public Mono<LibraryResponseDTO> addLibrary(LibraryRequestDTO libraryRequestDTO);
	public Mono<LibraryResponseDTO> updateLibrary(LibraryRequestDTO libraryRequestDTO, Long id);
	public String deleteLibrary(Long id);
}
