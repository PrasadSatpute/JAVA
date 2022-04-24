package com.sunbeam;

import java.util.*;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Demo01Main {
	public static void main(String[] args) {
		SessionFactory factory = HbUtil.getSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		int id;
//		/int id = sc.nextInt();
		id = 11;
		Book b = session.get(Book.class, id);
		System.out.println("ID: " + b.getId());
		System.out.println("NAME: " + b.getName());
		System.out.println("AUTHOR: " + b.getAuthor());
		System.out.println("SUBJECT: " + b.getSubject());
		System.out.println("PRICE: " + b.getPrice());
		
		Book b1 = new Book(55, "The Alchemist", "Cohelo", "Novell", 523.90);
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.persist(b1);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		
		try (BookDao dao = new BookDao()) {
 			List<Book> list = dao.getAll();
 			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try (BookDao dao = new BookDao()) {
 			List<Book> list = dao.getSubjectBooks("C");
 			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try (BookDao dao = new BookDao()) {
 			Book b2 = dao.getBook(55);
 			// ...
 			b.setPrice(853.34);
 			dao.updateBook(b2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		session.close();
		HbUtil.shutdown();
	}
}
