package com.niit.shoopingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCatagory {
	public static void main (String[]args){
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
	Catagory catagory=(Catagory)		context.getBean("catagory");
catagory.setDescription("Catagory of Lap");
catagory.setId(255);
catagory.setName("ione");
	System.out.println("Bean Created Sucessfully");
	System.out.println("Catagory ID "+catagory.getId());
	System.out.println("Catagory name "+catagory.getName());
	System.out.println("Catagory Description "+catagory.getDescription());
	}
	

}
