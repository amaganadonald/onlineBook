package com.luxprojects.onlineBook.mapper;

import org.modelmapper.ModelMapper;

import com.luxprojects.onlineBook.dto.LibraryRequestDTO;
import com.luxprojects.onlineBook.dto.LibraryResponseDTO;
import com.luxprojects.onlineBook.model.Library;

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
