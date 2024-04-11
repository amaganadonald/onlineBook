package com.luxprojects.onlineBook.ServiceTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.luxprojects.onlineBook.Dtos.AddressRequestDTO;
import com.luxprojects.onlineBook.Dtos.AddressResponseDTO;
import com.luxprojects.onlineBook.Entities.Address;
import com.luxprojects.onlineBook.Mappers.AddressMapper;
import com.luxprojects.onlineBook.Repository.AddressRepository;
import com.luxprojects.onlineBook.Services.AddressService;

@ExtendWith(MockitoExtension.class)
class AddressServiceTest {

	@Mock
	AddressRepository addressRepository;
	
	@InjectMocks
	AddressService addressService;
		
	AddressRequestDTO addressRequestDTO;
	AddressResponseDTO addressResponseDTO;
	Address address;
	
	@BeforeEach
	void setUp() throws Exception {
		mockStatic(AddressMapper.class);
		addressRequestDTO =	AddressRequestDTO.builder()
		.addressCity("Jean Huberty")
		.addressName("Mulhenbachh")
		.adressNumber(37)
		.build();
		addressResponseDTO = AddressResponseDTO.builder()
				.addressCity("Jean Huberty")
				.addressName("Mulhenbachh")
				.adressNumber(37)
				.id(1L)
				.build();
		address = Address.builder()
				.addressCity("Jean Huberty")
				.addressName("Mulhenbachh")
				.adressNumber(37)
				.id(1L)
				.build();
	}

	@Test
	void givenAddressRequestDTO_whenSave_ThenReturAddressSave() {
		when(AddressMapper.addressDtoToAddress(addressRequestDTO)).thenReturn(address);
		when(AddressMapper.addressToAddressResponseDTO(address)).thenReturn(addressResponseDTO);
		//when(addressRepository.save(address)).thenReturn(address);
		AddressResponseDTO addressResponseDTOSave = addressService.addAddress(addressRequestDTO);
		assertEquals("Mulhenbachh", addressResponseDTOSave.getAddressName());
		assertEquals(37, addressResponseDTOSave.getAdressNumber());
	}

}
