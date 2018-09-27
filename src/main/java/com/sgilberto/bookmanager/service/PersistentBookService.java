package com.sgilberto.bookmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgilberto.bookmanager.entity.Book;
import com.sgilberto.bookmanager.repository.BookRepository;

@Service
public class PersistentBookService implements BookService {

	@Autowired
	private BookRepository repository;

	@Override
	public Book create(Book book) {
		return repository.save(book);
	}

	@Override
	public Book delete(int id) {
		Book book = findById(id);
		if (book != null) {
			repository.delete(book);
		}
		return book;
	}

	@Override
	public List<Book> findAll() {
		return repository.findAll();
	}

	@Override
	public Book findById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Book update(Book book) {
		return null;
	}

}