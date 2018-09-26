package com.techtrail.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtrail.library.Dao.BookDao;
import com.techtrail.library.model.Book;
import com.techtrail.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

}
