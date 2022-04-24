package com.sunbeam;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@PropertySource("classpath:database.properties")
@Configuration
public class HibernateConfig {
	@Value("${db.driver}")
	private String DRIVER;
	@Value("${db.url}")
	private String URL;
	@Value("${db.username}")
	private String USERNAME;
	@Value("${db.password}")
	private String PASSWORD;
	
	@Value("${hibernate.dialect}")
	private String DIALECT;
	@Value("${hibernate.show_sql}")
	private String SHOW_SQL;
	@Value("${hibernate.packagesToScan}")
	private String PACKAGES_TO_SCAN;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource(URL, USERNAME, PASSWORD);
		ds.setDriverClassName(DRIVER);
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(dataSource());
		sf.setPackagesToScan(PACKAGES_TO_SCAN); // auto detect all @Entity
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", DIALECT);
		props.setProperty("hibernate.show_sql", SHOW_SQL);
		sf.setHibernateProperties(props);
		return sf;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager txMgr = new HibernateTransactionManager();
		txMgr.setSessionFactory(sessionFactory().getObject());
		return txMgr;
	}
}





