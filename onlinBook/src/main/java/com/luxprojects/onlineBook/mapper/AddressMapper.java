package com.luxprojects.onlineBook.mapper;

import org.modelmapper.ModelMapper;

import com.luxprojects.onlineBook.dto.AddressRequestDTO;
import com.luxprojects.onlineBook.dto.AddressResponseDTO;
import com.luxprojects.onlineBook.model.Address;


public class AddressMapper {
	
	public static Address addressDtoToAddress(AddressRequestDTO addressRequestDTO) {
		 ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(addressRequestDTO, Address.class);
	}
	
	public static AddressResponseDTO addressToAddressResponseDTO(Address address) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(address, AddressResponseDTO.class);
	}

}
