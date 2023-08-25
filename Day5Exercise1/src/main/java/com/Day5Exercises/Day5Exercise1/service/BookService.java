package com.Day5Exercises.Day5Exercise1.service;

import java.util.List;

import com.Day5Exercises.Day5Exercise1.model.Book;

public interface BookService {

	Book getBook(int id);

	int addBook(Book book);

	List<Book> getAllBooks();

	void updateBook(Book book);

	void deleteBook(int id);
	
}
