package com.luxprojects.onlineBook.dto;

import java.util.List;
import java.util.Set;

import com.luxprojects.onlineBook.model.Book;
import com.luxprojects.onlineBook.model.Category;
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
public class OnlineReaderResponseDTO {

	private Long id;
	private String readerName;
	private String readerEmail;
	private String readerPhone;
	private Set<Book> books;
    Set<LibrarySubscribes> librarySubscribes;
	private List<Category> categories;
}
