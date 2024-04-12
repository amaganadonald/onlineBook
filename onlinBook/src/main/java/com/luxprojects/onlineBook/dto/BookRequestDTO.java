package com.luxprojects.onlineBook.dto;

import java.time.LocalDate;

import com.luxprojects.onlineBook.model.Category;
import com.luxprojects.onlineBook.model.Library;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class BookRequestDTO {
	
	private String bookName;
	private String isbn;
	private LocalDate outDate;
	private String author;
	private Boolean isAvailable;
	private Library library;
	private Category category;

}
