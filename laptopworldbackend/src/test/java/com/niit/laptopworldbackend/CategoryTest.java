package com.niit.laptopworldbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.model.Category;

public class CategoryTest {
	
	public static void main(String [] args){
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext ();
	context.scan("com.niit");
	context.refresh();;
	
	CategoryDAO categoryDAO= (CategoryDAO) context.getBean("categoryDAO");
	Category category= (Category)context.getBean("categoryDAO");
	category.setCategoryid("cg01");
	category.setCategoryname("Apple");
	category.setCategorydescription("Tis is Descrtyui");
	if (categoryDAO.save(category))
	{
	System.out.println ("Category Created");
	
	}
	else
	{
	System.out.println ("Not Created");
	}
}
	
}


	
