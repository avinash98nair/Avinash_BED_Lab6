package com.greatlearning.library.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.greatlearning.library.librarymanagement.model.Book;
import com.greatlearning.library.librarymanagement.repository.BookRepository;

public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository repository;
	
	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public void create(Book book) {
		repository.save(book);	
	}

	@Override
	public void update(Book book) {
		repository.save(book);	
	}

	@Override
	public void deleteById(int bookId) {
		repository.deleteById(bookId);
	}

	@Override
	public List<Book> searchByAuthorAndName(String author, String name) {
		return repository.findByAuthorAndNameContainsAllIgnorCase(author, name);
	}

	@Override
	public Book getBookById(int bookId) {
		return repository.findById(bookId).orElse(null);
	}

}
