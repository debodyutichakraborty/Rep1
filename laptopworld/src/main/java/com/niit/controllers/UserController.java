package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.laptopworldbackend.dao.UserDetailsDAO;
import com.niit.laptopworldbackend.model.UserDetails;

public class UserController {

	@Autowired
	UserDetailsDAO userdetailsDAO;
	
	
@RequestMapping("/login")
public String getLogin(Model model){
	model.addAttribute("user", new UserDetails());
	return "login";
}


@RequestMapping("/loginuser")
public ModelAndView login(@RequestParam(value="id")String id, @RequestParam(value="password") String password){
	ModelAndView mv;
	
	String msg;
	if(!userdetailsDAO.isValidUser(id, password)){
		
		mv=new ModelAndView("login");
		mv.addObject("msglogin","Incorrect Username and Password! Try again");
	}
	else{
				UserDetails userdetails=userdetailsDAO.get(id);
					if(userdetails.getRole().equals("admin")){
						
						mv=new ModelAndView("AdminHome");
				    }
					else{
						
						mv=new ModelAndView("AdminHome");
					}
		
	}
	return mv;
}
@RequestMapping("/logout")
public String getLogout(){
	return "home";
}
}
