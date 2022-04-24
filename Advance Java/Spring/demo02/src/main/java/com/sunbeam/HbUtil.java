package com.sunbeam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HbUtil {
	private static SessionFactory sessionFactory = createSessionFactory();
	private static ServiceRegistry serviceRegistry;
	
	public static SessionFactory createSessionFactory() {
		serviceRegistry = new StandardServiceRegistryBuilder()
				.configure() // read hibernate.cfg.xml
				.build();
		
		Metadata metadata = new MetadataSources(serviceRegistry)
				.buildMetadata();
		
		return metadata.getSessionFactoryBuilder().build();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		sessionFactory.close();
		serviceRegistry.close();
	}
	
	public static void beginTransaction() {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().begin();
	}
	
	public static void commitTransaction() {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().commit();
	}
	
	public static void rollbackTransaction() {
		Session session = sessionFactory.getCurrentSession();
		session.getTransaction().rollback();
	}
	
	/*
	public static SessionFactory createSessionFactory() {
		serviceRegistry = new StandardServiceRegistryBuilder()
				.applySetting("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
				.applySetting("hibernate.connection.url", "jdbc:mysql://localhost:3306/sunbeam_db")
				.applySetting("hibernate.connection.username", "sunbeam")
				.applySetting("hibernate.connection.password", "sunbeam")
				.applySetting("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect")
				.build();
		
		Metadata metadata = new MetadataSources(serviceRegistry)
				.addAnnotatedClass(Customer.class)
				.buildMetadata();
		
		return metadata.getSessionFactoryBuilder().build();
	}
	*/
}











