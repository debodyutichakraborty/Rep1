package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
@RequestMapping("/")
public String getIndex(){
	return "index";
}
@RequestMapping("/aboutus")
public String getAboutus(){
	return "Aboutus";
}
@RequestMapping("/login")
public String getLogin(){
	return "login";
}
@RequestMapping("/registration")
public String getRegistration(){
	return "Registration";
}
@RequestMapping("/supplier")
public String getSupplier(){
	return "Supplier";
}
@RequestMapping("/admin")
public String getAdmin(){
	return "Admin Home";
}
@RequestMapping("/catagory")
public String getCatagory(){
	return "Catagory";
}
@RequestMapping("/product")
public String getProduct(){
	return "Product";
}
@RequestMapping("/home")
public String getHome(){
	return "index";
}
}
