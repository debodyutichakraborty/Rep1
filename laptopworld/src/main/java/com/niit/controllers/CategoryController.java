package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.model.Category;

@Controller
public class CategoryController {

	
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/category")
	public String getCatagory(Model model ){
		
		List<Category> listcategory=categoryDAO.list();
		model.addAttribute("category", new Category());
		model.addAttribute("listcategory", listcategory);
		return "Category";
	}
	
	@RequestMapping("/savecategory")
	public String saveCatagory(@ModelAttribute("category") Category category ){
	
		if((categoryDAO.get(category.getCategoryid()))==null)
		{
			categoryDAO.save(category);
		}
		else{
			categoryDAO.update(category);
		}
		
	//		categoryDAO.update(category);
	//	categoryDAO.save(category);
	return "redirect:/category";
	}
	
	@RequestMapping("/edit/{id}")
	public String editCategoryPage(@PathVariable("id") String id, Model model){
		
	List<Category> listcategory=categoryDAO.list();
	model.addAttribute("listcategory", listcategory);
	
	Category category=categoryDAO.get(id);
	model.addAttribute("category", category);
	
	return "Category";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteCategory(@PathVariable("id") String id, Model model){
		
	
	Category category=categoryDAO.get(id);
	categoryDAO.delete(category);
	
	return "redirect:/category";
	}
/*	@RequestMapping("/editcategory")
	public String editCatagory(@ModelAttribute("category") Category category ){
	
	categoryDAO.update(category);
	return "redirect:/category";
	}*/
	
}
