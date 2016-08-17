package com.niit.laptopworldbackend;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;
import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.dao.ProductDAO;
import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Product;

public class ProductTest {
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	Product product;
	
	AnnotationConfigApplicationContext context;
	

	
	@Before
	public  void init(){
	
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.laptopworldbackend");
	context.refresh();
	productDAO= (ProductDAO) context.getBean("productDAO");
	product= (Product)context.getBean("product");
	
	}
	
	@Test
	public void addProductTestCase()
	{
		
	product.setProductid("4"); 
	product.setName("Apple");
	product.setPrice(65000);
	product.setDescription(" Mac Book");
	product.setSupplierid("SP03");
	product.setCategoryid("CG03");
	productDAO.save(product);
	assertEquals("addProductTestCase",productDAO.save(product),true);

	}
	
	/*@Test
	public void updateProductTestCase()2
	{
		
	product.setProductid(2);
	product.setName("Dell");
	product.setDescription("Latest Product");
	product.setPrice(4000);
	product.setSupplierid(12);
	product.setCategoryid(222);
	productDAO.update(product);
	assertEquals("updateProductTestCase",productDAO.update(product),true);

	}*/
}


	
