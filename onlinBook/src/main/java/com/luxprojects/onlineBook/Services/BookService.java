package com.luxprojects.onlineBook.Services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.luxprojects.onlineBook.Dtos.BookRequestDTO;
import com.luxprojects.onlineBook.Dtos.BookResponseDTO;
import com.luxprojects.onlineBook.Interfaces.IBook;

public class BookService implements IBook{

	@Override
	public List<BookResponseDTO> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<BookResponseDTO> getAllBookPage(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookResponseDTO getBookById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookResponseDTO addBook(BookRequestDTO bookRequestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookResponseDTO updateBook(BookRequestDTO bookRequestDTO, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBook(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Boolean isPalindrome(String str) {
		String st = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		return st.equals(new StringBuilder(st).reverse().toString());
	}
	
	public static String browseHashMap(HashMap<Integer, String> map)  {
		map.put(1, "donald");
		map.put(2, "evann");
		map.put(3, "lauricee");
		var str = "";
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			str = str + entry.getValue();
		}
		return str;
	}

}
