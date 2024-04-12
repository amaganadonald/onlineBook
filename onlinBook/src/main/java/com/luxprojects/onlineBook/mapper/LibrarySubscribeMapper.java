package com.luxprojects.onlineBook.mapper;

import org.modelmapper.ModelMapper;

import com.luxprojects.onlineBook.dto.LibrarySubscribeRequestDTO;
import com.luxprojects.onlineBook.dto.LibrarySubscribesResponseDTO;
import com.luxprojects.onlineBook.dto.OnlineReaderRequestDTO;
import com.luxprojects.onlineBook.dto.OnlineReaderResponseDTO;
import com.luxprojects.onlineBook.model.Library;
import com.luxprojects.onlineBook.model.LibrarySubscribes;
import com.luxprojects.onlineBook.model.OnlineReader;

public class LibrarySubscribeMapper {

	public static LibrarySubscribes librarySubscribesRequestDTOToLibrarySubscribes(LibrarySubscribeRequestDTO liSubscribeRequestDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(liSubscribeRequestDTO, LibrarySubscribes.class);
	}
	
	public static LibrarySubscribesResponseDTO librarySubscribeResponseDTOToLibrarySubscribes(Library library) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(library, LibrarySubscribesResponseDTO.class);
	}
}
