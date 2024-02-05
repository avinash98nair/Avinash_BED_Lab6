package com.greatlearning.library.librarymanagement.service;

import java.util.List;

import com.greatlearning.library.librarymanagement.model.Book;

public interface BookService {
	List<Book> getAllBooks();
	void create(Book book);
	void update(Book book);
	void deleteById(int bookId);
	List<Book> searchByAuthorAndName(String author, String name);
	Book getBookById(int bookId);
}
