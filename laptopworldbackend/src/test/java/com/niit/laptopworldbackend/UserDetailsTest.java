package com.niit.laptopworldbackend;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.niit.laptopworldbackend.dao.UserDetailsDAO;
import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.UserDetails;

public class UserDetailsTest {
	
	@Autowired
	UserDetailsDAO userdetailsDAO;
	
	@Autowired
	UserDetails userDetails;
	
	AnnotationConfigApplicationContext context;
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Before
	public  void init(){
	
	context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.laptopworldbackend");
	context.refresh();
	userdetailsDAO= (UserDetailsDAO) context.getBean("userdetailsDAO");
	userDetails= (UserDetails)context.getBean("userDetails");
	
	}
	
	/*@Test
	public void addUserDetailsTestCase()
	{
		
	userDetails.setName("Tom");
	userDetails.setUsername("tom01");
	userDetails.setPassword("tom123");
	userDetails.setEmail("tom01@gmail.com");
	userDetails.setContact("9901122330");
	userDetails.setAddress("kolkata");
	userDetails.setRole("user");
	assertEquals("addUserTestCase",userdetailsDAO.save(userDetails),true);

	}*/
	
/*
	@Test
	public void listCategoryTestCase()
	{
		
		List<Category> listcategory=categoryDAO.list();
		int rowcount=listcategory.size();
		assertEquals("listcategoryTestCase",rowcount,3);
		
		
	}*/
	
/*	@Test
	
	public void getUserTestCase() {
	    
		@SuppressWarnings("unchecked")
		List<UserDetails> list=(List<UserDetails>) userdetailsDAO.get("tom01");
		if (list != null && !list.isEmpty()) {
			int rowcount=list.size();
			assertEquals("getUserTestCase",rowcount,1);
		}
		
		//return null;
	}
*/

}
