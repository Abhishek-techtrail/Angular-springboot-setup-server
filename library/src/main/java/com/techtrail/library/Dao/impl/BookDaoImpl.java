package com.techtrail.library.Dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.techtrail.library.Dao.BookDao;
import com.techtrail.library.Dao.GenericDao;
import com.techtrail.library.model.Book;

@Repository
@Transactional
public class BookDaoImpl extends GenericDao implements BookDao {

	@Override
	public List<Book> getAllBooks() {
		Session session = null;
		try {
			session = getSessionFactory().openSession();
			@SuppressWarnings("unchecked")
			List<Book> users = (List<Book>) session.createQuery("FROM Book").list();
			return users;

		} catch (RuntimeException re) {
			re.printStackTrace();
			throw new RuntimeException();			
		} finally {
			GenericDao.close(session);
		}
	}

}
