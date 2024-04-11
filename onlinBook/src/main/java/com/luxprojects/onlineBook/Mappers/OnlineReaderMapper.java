package com.luxprojects.onlineBook.Mappers;

import org.modelmapper.ModelMapper;

import com.luxprojects.onlineBook.Dtos.OnlineReaderRequestDTO;
import com.luxprojects.onlineBook.Dtos.OnlineReaderResponseDTO;
import com.luxprojects.onlineBook.Entities.OnlineReader;

public class OnlineReaderMapper {

	public static OnlineReader onlineReaderRequestDTOToOnlineReader(OnlineReaderRequestDTO onlineReaderRequestDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(onlineReaderRequestDTO, OnlineReader.class);
	}
	
	public static OnlineReaderResponseDTO onlineReaderToOnlineReaderResponseDTO(OnlineReader onlineReader) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(onlineReader, OnlineReaderResponseDTO.class);
	}
}
