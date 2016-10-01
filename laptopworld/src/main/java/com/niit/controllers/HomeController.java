package com.niit.controllers;

import java.security.Principal;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("/login")
	public String getLogin(Model model) {
		model.addAttribute("user", new UserDetails());
		return "login";
	}
	
	@RequestMapping("/loginerror")
	public String getLoginError(Model model) {
		//model.addAttribute("user", new UserDetails());
		return "LoginError";
	}

	/*@RequestMapping(value = "/loginuser", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam(value = "id") String id,
			@RequestParam(value = "password") String password, HttpServletRequest request) {
		ModelAndView mv = null;
		
		String msg;
		
		if (!userdetailsDAO.isValidUser(id, password)) {

			mv = new ModelAndView("login");
			mv.addObject("msglogin", "Incorrect Username and Password! Try again");
		} 
		else {
			
			UserDetails validuser=userdetailsDAO.get(id);
			HttpSession session=request.getSession();
			session.setAttribute("user", validuser);
			
			UserDetails userdetails = userdetailsDAO.get(id);
			
			
			if (userdetails.getRole().equals("admin")) {

				mv = new ModelAndView("Admin Home");
			}

			else {
				mv = new ModelAndView("Homee");
			}

		}
		return mv;
	}
*/
	@RequestMapping("/logout")
	public String getLogout(HttpServletRequest request) {
	HttpSession session=request.getSession(false);
		try{
				if(session!=null){
			
					session.invalidate();
					
				}
			
		}
		catch(Exception ex){
			
		}
		return "home";
	}

	@RequestMapping("/")
	public String getIndex(Model model) {
		List<String> listCategoryNames = categoryDAO.categoryNameList();
		servletContext.setAttribute("listcategorynames", listCategoryNames);
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
	public ModelAndView saveuser(@ModelAttribute("user") UserDetails newuser) {

		ModelAndView mv;
		if (userdetailsDAO.get(newuser.getUsername()) == null) {
			newuser.setEnabled('1');
			userdetailsDAO.save(newuser);
			mv = new ModelAndView("login");
			mv.addObject("msgreg", "Registration Successful , Login here !");
		} else {
			mv = new ModelAndView("Register");
			mv.addObject("msgreg", "This username already exists");

		}

		return mv;
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

	@RequestMapping("/purchasedetails")
	public String getpurchasedetails() {
		return "purchasedetails";

	}

	@RequestMapping("/cart")
	public String getcart() {
	
		return "cart";

	}

	@RequestMapping("/homee")
	public String gethomee(Principal principal,HttpServletRequest request) {
	
	String username=principal.getName();
	UserDetails userdetails=userdetailsDAO.get(username);
	String role=userdetailsDAO.get(username).getRole();
	
	HttpSession session=request.getSession();
	if(role.equals("ADMIN")){
		
		
		session.setAttribute("userdetails",userdetails );
		return "Admin Home";
	}
	else{
		session.setAttribute("userdetails",userdetails );
		return "Homee";
		
	}

	}
	
	@RequestMapping("/403")
	public String get403() {
		return "403";

	}
	@RequestMapping("/thanks")
	public String getThanks() {
		return "Thanks";

	}

}
