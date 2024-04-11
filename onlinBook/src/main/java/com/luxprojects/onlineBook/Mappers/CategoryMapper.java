package com.luxprojects.onlineBook.Mappers;

import org.modelmapper.ModelMapper;

import com.luxprojects.onlineBook.Dtos.CategoryResponseDTO;
import com.luxprojects.onlineBook.Dtos.CategoryResquestDTO;
import com.luxprojects.onlineBook.Entities.Category;

public class CategoryMapper {

	public static Category categoryRequestDTOToCategory(CategoryResquestDTO categoryRequestDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(categoryRequestDTO, Category.class);
	}
	
	public static CategoryResponseDTO categoryToCategoryResponseDTO(Category category) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(category, CategoryResponseDTO.class);
	}
}
