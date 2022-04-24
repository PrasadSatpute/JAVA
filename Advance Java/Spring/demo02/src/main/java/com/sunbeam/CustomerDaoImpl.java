package com.sunbeam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class CustomerDaoImpl {
	private SessionFactory factory;
	public CustomerDaoImpl() {
		factory = HbUtil.getSessionFactory();
	}
	public Customer findById(int id) {
		Session session = factory.getCurrentSession();
		Customer cust = session.get(Customer.class, id);
		return cust;
	}
	public Customer findByEmail(String email) {
		Session session = factory.getCurrentSession();
		String hql = "from Customer c where c.email = :p_email";
		Query<Customer> q = session.createQuery(hql);
		q.setParameter("p_email", email);
		return q.getSingleResult();
	}
	public List<Customer> findAll() {
		Session session = factory.getCurrentSession();
		String hql = "from Customer c";
		Query<Customer> q = session.createQuery(hql);
		return q.getResultList();
	}
	public void save(Customer cust) {
		Session session = factory.getCurrentSession();
		session.persist(cust);
	}
	public void deleteById(int id) {
		Session session = factory.getCurrentSession();
		Customer cust = session.get(Customer.class, id);
		if(cust != null)
			session.delete(cust);
	}
}


