package com.techtrail.library.Dao;

import java.util.List;

import com.techtrail.library.model.Book;

public interface BookDao extends Dao {

	List<Book> getAllBooks();
}
