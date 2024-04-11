package com.luxprojects.onlineBook.Interfaces;


import com.luxprojects.onlineBook.Dtos.OnlineReaderRequestDTO;
import com.luxprojects.onlineBook.Dtos.OnlineReaderResponseDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IOnlineReader {

	public Flux<OnlineReaderResponseDTO> getAllOnlineReader();
	public Mono<OnlineReaderResponseDTO> getOnlineReaderById(Long id);
	public Mono<OnlineReaderResponseDTO> addOnlineReader(OnlineReaderRequestDTO onlineReaderRequestDTO);
	public Mono<OnlineReaderResponseDTO> updateOnlineReader(OnlineReaderRequestDTO onlineReaderRequestDTO, Long id);
	public String deleteOnlineReader(Long id);
}
