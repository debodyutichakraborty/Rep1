package com.niit.laptopworldbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.dao.CategoryDAOImpl;
import com.niit.laptopworldbackend.dao.ProductDAO;
import com.niit.laptopworldbackend.dao.ProductDAOImpl;
import com.niit.laptopworldbackend.dao.SupplierDAO;
import com.niit.laptopworldbackend.dao.SupplierDAOImpl;
import com.niit.laptopworldbackend.dao.UserDetailsDAO;
import com.niit.laptopworldbackend.dao.UserDetailsDAOImpl;
import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Product;
import com.niit.laptopworldbackend.model.Supplier;
import com.niit.laptopworldbackend.model.UserDetails;

@Configuration
@ComponentScan("com.niit.laptopworldbackend")
@EnableTransactionManagement
public class ApplicationContextConfig {

	@Bean(name="dataSource")
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource =new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		
		return dataSource;
	}
	
	public Properties getHibernateProperties(){
		Properties properties =new Properties();
		properties.put("hibernate.show_sql", "true");//Shows SQL Statements in the console
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");//hibernate will use the dialect used for h2 database
		properties.put("hibernate.hbm2ddl.auto", "update");//either create or update the database schema
		return properties;
	}
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource){
		LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(UserDetails.class);
		return sessionBuilder.buildSessionFactory();
	}
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getHibernateTransaction(SessionFactory sessionFactory){
		HibernateTransactionManager transactionManager =new HibernateTransactionManager(sessionFactory);
		
		return transactionManager;
	}
	
	@Autowired
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDao(SessionFactory sessionFactory){
		return new CategoryDAOImpl(sessionFactory);
		
	}
	@Autowired
	@Bean(name="supplierDAO")
	public SupplierDAO getsupplierDao(SessionFactory sessionFactory){
		return new SupplierDAOImpl(sessionFactory);
		
	}
	@Autowired
	@Bean(name="productDAO")
	public ProductDAO getproductDao(SessionFactory sessionFactory){
		return new ProductDAOImpl(sessionFactory);
		
	}
	@Autowired
	@Bean(name="userdetailsDAO")
	public UserDetailsDAO getuserdetailsDao(SessionFactory sessionFactory){
		return new UserDetailsDAOImpl(sessionFactory);
		
	}
}
