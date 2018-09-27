package com.sgilberto.bookmanager.service;

import java.util.List;

import com.sgilberto.bookmanager.entity.Book;

public interface BookService {

	Book create(Book book);

	Book delete(int id);

	List<Book> findAll();

	Book findById(int id);

	Book update(Book book);

}
