package com.niit.laptopworldbackend;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.laptopworldbackend.dao.ProductDAO;
import com.niit.laptopworldbackend.dao.SupplierDAO;
import com.niit.laptopworldbackend.model.Product;
import com.niit.laptopworldbackend.model.Supplier;

public class TestCaseSupplier {

	@Autowired
	SupplierDAO supplierDAO;
	
	@Autowired
	Supplier supplier;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
	
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.laptopworldbackend");
	context.refresh();
	supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	supplier=(Supplier)context.getBean("supplier");
	
	}

	/*@Test
	public void deleteCategoryTestCase()
	{
		supplier
		boolean flag supplierDAO.delete(supplier);
		assertEquals("deletesupplierTestCase",flag,true);
	}
	
	public void addProductTestCase(){
		
		supplier.setName("Product1");
		supplier.setSupplieraddress("Description");
		
		
		
	}*/
	
}
