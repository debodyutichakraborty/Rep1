package com.niit.laptopworldbackend;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;

import java.util.List;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.dao.ProductDAO;
import com.niit.laptopworldbackend.dao.SupplierDAO;
import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Product;
import com.niit.laptopworldbackend.model.Supplier;

public class SupplierTest {
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@Autowired
	Supplier supplier;
	
	AnnotationConfigApplicationContext context;
	

	
	@Before
	public  void init(){
	
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.laptopworldbackend");
	context.refresh();
	supplierDAO= (SupplierDAO) context.getBean("supplierDAO");
	supplier= (Supplier)context.getBean("supplier");
	
	}
	
	@Test
	public void addSupplierTestCase()
	{
		
	supplier.setSupplierid("SP03");
	supplier.setName("Apple");
	supplier.setSupplieraddress("Florida");
	supplierDAO.save(supplier);
	assertEquals("addsupplierTestCase",supplierDAO.save(supplier),true);

	}
	
	@Test
	public void updateSupplierTestCase()
	{
		
	supplier.setSupplierid("SP02");
	supplier.setName("Lenovo");
	supplier.setSupplieraddress("Kolkata");
	supplierDAO.update(supplier);
	assertEquals("updateSupplierTestCase",supplierDAO.update(supplier),true);

	}
	
	
	@Test
	public void deleteCategoryTestCase()
	{
		
	supplier.setSupplierid("SP01");
	supplier.setName("Sri Dell");
	supplier.setSupplieraddress("Kolkata");
	supplierDAO.delete(supplier);
	assertEquals("deleteSupplierTestCase",supplierDAO.delete(supplier),true);

	}
	
	@Test
	public void listSupplierTestCase()
	{
		
		List<Supplier> listsupplier=supplierDAO.list();
		int rowcount=listsupplier.size();
		assertEquals("listsupplierTestCase",rowcount,3);
	
	}
	
	
	
	
	
	@Test
	public void getsupplierTestCase()
	{
		
		supplier=supplierDAO.get("SP02");
		
		assertEquals(supplier.getName(),"Lenovo");
		
		
	}
	
	
	
}


	
