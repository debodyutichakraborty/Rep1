package com.niit.laptopworldbackend;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;

import java.util.List;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.dao.ProductDAO;
import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Product;
import com.niit.laptopworldbackend.model.Supplier;

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
	
	@Test
	public void updateProductTestCase()
	{
		
	product.setProductid("2");
	product.setName("Dell");
	product.setDescription("Latest Product");
	product.setPrice(4000);
	product.setSupplierid("SP01");
	product.setCategoryid("CG01");
	productDAO.update(product);
	assertEquals("updateProductTestCase",productDAO.update(product),true);

	}
	
	
	@Test
	public void deleteProductTestCase()
	{
		
	product.setProductid("2");
	product.setName("Dell");
	product.setDescription("Latest Product");
	product.setPrice(4000);
	product.setSupplierid("SP01");
	product.setCategoryid("CG01");
	productDAO.update(product);
	assertEquals("deleteProductTestCase",productDAO.delete(product),true);

	}
	
	@Test
	public void listProductTestCase()
	{
		
		List<Product> listproduct=productDAO.list();
		int rowcount=listproduct.size();
		assertEquals("listproductTestCase",rowcount,2);
	
	}
	
	
	@Test
	public void getproductTestCase()
	{
		
		product=productDAO.get("4");
		
		assertEquals(product.getName(),"Apple");
		
		
	}
	
	
	
}


	
