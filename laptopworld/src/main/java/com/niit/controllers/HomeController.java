package com.niit.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.model.Category;

@Controller
public class HomeController {
	
	@Autowired
	CategoryDAO categoryDAO;
	
@RequestMapping("/")
public String getIndex(Model model){

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

@RequestMapping("/admin")
public String getAdmin(){
	return "Admin Home";
}



@RequestMapping("/home")
public String getHome(){
	return "index";
}
@RequestMapping("/productsdetails")
public String getProductsdetails(){
	return "Productsdetails";
}
@RequestMapping("/paymentpage")
public String getPaymentpage(){
	return "Payment Page";
}
@RequestMapping("/selectpage")
public String getselectpage(){
	return "Select Page";
	
}
@RequestMapping("/finalpage")
public String getfinalpage(){
	return "Final Page";
	
}

@RequestMapping("/cart")
public String getcart(){
	return "cart";
	
}

@RequestMapping("/homee")
public String gethomee(){
	return "Homee";
	
}



}
