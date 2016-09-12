package com.niit.controllers;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.dao.UserDetailsDAO;
import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.UserDetails;

@Controller
public class HomeController {
@Autowired
ServletContext servletContext;

	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	UserDetailsDAO userdetailsDAO;

	@RequestMapping("/")
	public String getIndex(Model model) {
List<String> listCategoryNames=categoryDAO.categoryNameList();
servletContext.setAttribute("listcategorynames",listCategoryNames);
		return "index";
	}

	@RequestMapping("/aboutus")
	public String getAboutus() {
		return "Aboutus";
	}

	
	@RequestMapping("/registration")
	public String getRegistration(Model model) {

		model.addAttribute("user", new UserDetails());

		return "Registration";
	}
	
	@RequestMapping("/saveuser")
	public ModelAndView saveuser(@ModelAttribute("user") UserDetails newuser){

		
		ModelAndView mv;
		if(userdetailsDAO.get(newuser.getUsername())==null){
		   userdetailsDAO.save(newuser);
		   mv=new ModelAndView("login");
		   mv.addObject("msgreg","Registration Successful , Login here !");
		}
		else{
			mv=new ModelAndView("Register");
			mv.addObject("msgreg","This username already exists");
			
		}
		
		return mv ;
	}

	@RequestMapping("/admin")
	public String getAdmin() {
		return "Admin Home";
	}

	@RequestMapping("/home")
	public String getHome() {
		return "index";
	}

	@RequestMapping("/paymentpage")
	public String getPaymentpage() {
		return "Payment Page";
	}

	@RequestMapping("/selectpage")
	public String getselectpage() {
		return "Select Page";

	}

	@RequestMapping("/finalpage")
	public String getfinalpage() {
		return "Final Page";

	}

	@RequestMapping("/cart")
	public String getcart() {
		return "cart";

	}

	@RequestMapping("/homee")
	public String gethomee() {
		return "Homee";

	}

}
