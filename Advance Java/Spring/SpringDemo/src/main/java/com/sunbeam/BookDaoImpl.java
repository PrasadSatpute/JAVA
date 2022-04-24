package com.sunbeam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BookDaoImpl {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Book findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Book b = session.get(Book.class, id);
		return b;
	}
	
	public void save(Book b) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(b);
	}
	
	public void deleteById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Book b = session.get(Book.class, id);
		if(b != null)
			session.delete(b);
	}
	
	public List<Book> findAll() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Book b";
		Query<Book> q = session.createQuery(hql);
		return q.getResultList();
	}
	
	public List<Book> findBySubject(String subject) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Book b where b.subject = :p_subject";
		Query<Book> q = session.createQuery(hql);
		q.setParameter("p_subject", subject);
		return q.getResultList();
	}
	
	public List<Object[]> sumPriceBySubject() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select b.subject, sum(b.price) from Book b group by b.subject";
		Query<Object[]> q = session.createQuery(hql);
		return q.getResultList();
	}
	
	public List<String> findSubjects() {
		Session session = sessionFactory.getCurrentSession();
		String sql = "SELECT DISTINCT subject FROM books";
		NativeQuery<String> q = session.createNativeQuery(sql);
		return q.getResultList();
	}
}









