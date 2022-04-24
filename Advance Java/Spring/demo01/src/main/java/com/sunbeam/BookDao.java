package com.sunbeam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class BookDao implements AutoCloseable {
	private Session session;
	
	public BookDao() {
		SessionFactory factory = HbUtil.getSessionFactory();
		this.session = factory.openSession();
	}
	
	@Override
	public void close() {
		if(session != null)
			session.close();
	}
	
	public Book getBook(int id) {
		Book b = session.get(Book.class, id);
		return b;
	}
	
	public void addBook(Book b) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.persist(b);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	
	public void updateBook(Book b) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(b);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	
	public void deleteBook(int id) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Book b = session.get(Book.class, id);
			if(b != null)
				session.delete(b);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	
	public List<Book> getAll() {
		String hql = "from Book b"; // Book is class (not table)
		Query<Book> q = session.createQuery(hql);
		return q.getResultList();
	}

	public List<Book> getSubjectBooks(String subject) {
		String hql = "from Book b where b.subject=?1";
		Query<Book> q = session.createQuery(hql);
		q.setParameter(1, subject); // like JDBC -> stmt.setString(1, subject);
		return q.getResultList();
	}
}



