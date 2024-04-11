package com.luxprojects.onlineBook.Dtos;

import java.time.LocalDate;

import com.luxprojects.onlineBook.Entities.Category;
import com.luxprojects.onlineBook.Entities.Library;

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
public class BookResponseDTO {

	private Long id;
	private String bookName;
	private String isbn;
	private LocalDate outDate;
	private String author;
	private Boolean isAvailable;
	private Library library;
	private Category category;
}
