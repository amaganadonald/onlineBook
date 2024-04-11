package com.luxprojects.onlineBook.Mappers;

import org.modelmapper.ModelMapper;

import com.luxprojects.onlineBook.Dtos.LibrarySubscribeRequestDTO;
import com.luxprojects.onlineBook.Dtos.LibrarySubscribesResponseDTO;
import com.luxprojects.onlineBook.Dtos.OnlineReaderRequestDTO;
import com.luxprojects.onlineBook.Dtos.OnlineReaderResponseDTO;
import com.luxprojects.onlineBook.Entities.Library;
import com.luxprojects.onlineBook.Entities.LibrarySubscribes;
import com.luxprojects.onlineBook.Entities.OnlineReader;

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
