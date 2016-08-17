package com.niit.laptopworldbackend;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.laptopworldbackend.dao.ProductDAO;
import com.niit.laptopworldbackend.model.Product;

public class TestCaseProduct {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	Product product;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
	
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.laptopworldbackend");
	context.refresh();
	productDAO=(ProductDAO)context.getBean("productDAO");
	product=(Product)context.getBean("product");
	
	}

	/*@Test
	public void deleteCategoryTestCase()
	{
		product
		boolean flag productDAO.delete(product);
		assertEquals("deleteproductTestCase",flag,true);
	}
	
	public void addProductTestCase(){
		
		product.setName("Product1");
		product.setDescription("Description");
		product.setPrice(2000.23);
		
		
	}*/
	
}
