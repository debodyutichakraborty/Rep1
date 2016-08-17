package com.niit.laptopworldbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.model.Category;
public class TestCaseCategory {
	/*@Autowired
	CategoryDAO categoryDAO;
	@Autowired
	Category category;
	AnnotationConfigApplicationContext context;
	@Before
	public Void Init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		category=(Category)context.getBean("category");
	}
	@Test
	public void categoryListTestCase()
	{
		List<Category>list=categoryDAO.list();
		int rowCount=list.size();
		assertEquals("Categry List TestbCase",rowCount,5);
	}*/
}