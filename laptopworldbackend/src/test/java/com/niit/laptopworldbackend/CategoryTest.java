package com.niit.laptopworldbackend;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.dao.ProductDAO;
import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Product;

public class CategoryTest {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	
	AnnotationConfigApplicationContext context;
	@Autowired
	private SessionFactory sessionFactory;

	
	@Before
	public  void init(){
	
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.laptopworldbackend");
	context.refresh();
	categoryDAO= (CategoryDAO) context.getBean("categoryDAO");
	category= (Category)context.getBean("category");
	
	}
	
	@Test
	public void addCategoryTestCase()
	{
		
	category.setCategoryid("CG04");
	category.setCategoryname("Laptops");
	category.setCategorydescription("Laptop all Description");
	categoryDAO.save(category);
	assertEquals("addCategoryTestCase",categoryDAO.save(category),true);

	}
	
	@Test
	public void deleteCategoryTestCase()
	{
		
	category.setCategoryid("CG04");
	category.setCategoryname("Laptops");
	category.setCategorydescription("Laptop all Description");
	categoryDAO.delete(category);
	assertEquals("deleteCategoryTestCase",categoryDAO.delete(category),true);

	}
	
	@Test
	public void updateCategoryTestCase()
	{
		
	category.setCategoryid("CG02");
	category.setCategoryname("Dell");
	category.setCategorydescription("Latest Product");
	categoryDAO.update(category);
	assertEquals("updateCategoryTestCase",categoryDAO.update(category),true);

	}
	@Test
	public void listCategoryTestCase()
	{
		
		List<Category> listcategory=categoryDAO.list();
		int rowcount=listcategory.size();
		assertEquals("listcategoryTestCase",rowcount,3);
		
		
	}
	
	@Test
	public void getCategoryTestCase()
	{
		
		category=categoryDAO.get("CG01");
		
		assertEquals(category.getCategoryname(),"Apple");
		
		
	}
	

}


