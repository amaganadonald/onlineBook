package com.luxprojects.onlineBook.Dtos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;

import com.luxprojects.onlineBook.Entities.Address;
import com.luxprojects.onlineBook.Entities.Book;
import com.luxprojects.onlineBook.Entities.Category;
import com.luxprojects.onlineBook.Entities.Library;
import com.luxprojects.onlineBook.Entities.LibrarySubscribes;

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
