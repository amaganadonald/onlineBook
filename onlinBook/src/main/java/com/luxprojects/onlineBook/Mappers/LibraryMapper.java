package com.luxprojects.onlineBook.Mappers;

import org.modelmapper.ModelMapper;

import com.luxprojects.onlineBook.Dtos.LibraryRequestDTO;
import com.luxprojects.onlineBook.Dtos.LibraryResponseDTO;
import com.luxprojects.onlineBook.Entities.Library;

public class LibraryMapper {

	public static Library libraryRequestDTOToLibrary(LibraryRequestDTO libraryRequestDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(libraryRequestDTO, Library.class);
	}
	
	public static LibraryResponseDTO libraryToBookResponseDTO(Library library) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(library, LibraryResponseDTO.class);
	}
}
