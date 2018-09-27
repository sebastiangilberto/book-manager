package com.sgilberto.bookmanager.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sgilberto.bookmanager.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

	@Override
	List<Book> findAll();

}
