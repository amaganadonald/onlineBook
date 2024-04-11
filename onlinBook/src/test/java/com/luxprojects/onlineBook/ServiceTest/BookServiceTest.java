package com.luxprojects.onlineBook.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.luxprojects.onlineBook.Services.BookService;

public class BookServiceTest {
	
	@Test
	void isPqllindrme_withStringInput_returnTrue() {
		final var str= "a n,a @n ;a";
		assertTrue(BookService.isPalindrome(str));
	}
	
	@Test
	void givenString_checkIsNotPallindrome_returnFalse() {
		final var str= "a n,a @n ;am";
		assertFalse(BookService.isPalindrome(str));
	}

}
