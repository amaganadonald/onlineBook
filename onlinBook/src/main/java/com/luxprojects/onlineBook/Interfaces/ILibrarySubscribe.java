package com.luxprojects.onlineBook.Interfaces;

import java.util.List;

import org.springframework.data.domain.Page;

import com.luxprojects.onlineBook.Dtos.LibrarySubscribeRequestDTO;
import com.luxprojects.onlineBook.Dtos.LibrarySubscribesResponseDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ILibrarySubscribe {

	public Flux<LibrarySubscribesResponseDTO> getAllLibrarySubscribes();
	public Mono<LibrarySubscribesResponseDTO> getLibrarySubscribesById(Long id);
	public Mono<LibrarySubscribesResponseDTO> addLibrarySubscribes(LibrarySubscribeRequestDTO librarySubscribesRequestDTO);
	public Mono<LibrarySubscribesResponseDTO> updateLibrarySubscribes(LibrarySubscribeRequestDTO librarySubscribesRequestDTO, Long id);
	public String deleteLibrarySubscribes(Long id);
}
