package com.luxprojects.onlineBook.Interfaces;


import com.luxprojects.onlineBook.Dtos.AddressRequestDTO;
import com.luxprojects.onlineBook.Dtos.AddressResponseDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAddress {
	
	public Flux<AddressResponseDTO> getAllAddress();
	public Mono<AddressResponseDTO> getAddressById(Long id);
	public Mono<AddressResponseDTO> addAddress(AddressRequestDTO addressRequestDTO);
	public Mono<AddressResponseDTO> updateAddress(AddressRequestDTO addressRequestDTO, Long id);
	public String deleteAddress(Long id);

}
