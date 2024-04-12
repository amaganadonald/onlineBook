package com.luxprojects.onlineBook.dto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;

import com.luxprojects.onlineBook.model.Address;
import com.luxprojects.onlineBook.model.Book;
import com.luxprojects.onlineBook.model.Category;
import com.luxprojects.onlineBook.model.Library;
import com.luxprojects.onlineBook.model.LibrarySubscribes;

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
public class LibraryResponseDTO {

	
	private Long id;
	private String libraryNmae;
	private Address address;
	private HashMap<Integer, Book> book;
	private Set<LibrarySubscribes> librarySubscribes;
}
