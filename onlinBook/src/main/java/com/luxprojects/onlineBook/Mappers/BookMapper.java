package com.luxprojects.onlineBook.Mappers;

import org.modelmapper.ModelMapper;

import com.luxprojects.onlineBook.Dtos.BookRequestDTO;
import com.luxprojects.onlineBook.Dtos.BookResponseDTO;
import com.luxprojects.onlineBook.Entities.Book;

public class BookMapper {
	
	public static Book bookRequestToBook(BookRequestDTO bookRequestDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(bookRequestDTO, Book.class);
	}
	
	public static BookResponseDTO bookToBookResponseDTO(Book book) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(book, BookResponseDTO.class);
	}

}
