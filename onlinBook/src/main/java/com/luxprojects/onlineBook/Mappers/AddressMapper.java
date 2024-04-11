package com.luxprojects.onlineBook.Mappers;

import org.modelmapper.ModelMapper;

import com.luxprojects.onlineBook.Dtos.AddressRequestDTO;
import com.luxprojects.onlineBook.Dtos.AddressResponseDTO;
import com.luxprojects.onlineBook.Entities.Address;


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
