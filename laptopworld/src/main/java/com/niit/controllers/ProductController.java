package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.niit.laptopworldbackend.dao.ProductDAO;

import com.niit.laptopworldbackend.model.Product;

import utility.FileUtil;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/product")
	public String getProducts(Model model ){
		
		List<Product> listcategory=productDAO.list();
		model.addAttribute("product", new Product());
		model.addAttribute("listproduct", listcategory);
		return "Product";
}
	
	
	@RequestMapping("/saveproduct")
	public String saveProduct(@ModelAttribute("product") Product product ){
	
		
		if((productDAO.get(product.getProductid()))==null)
		{
			productDAO.save(product);
		}
		else{
			productDAO.update(product);
		}
		MultipartFile file=product.getFile();
		FileUtil.upload("E:/Maven Workspace/laptopworld/src/main/webapp/resources/images/", file, product.getProductid()+".jpg");
		return "redirect:/product";
	}
	
	@RequestMapping("/editproduct/{id}")
	public String editProductPage(@PathVariable("id") String id, Model model){
		
	List<Product> listproduct=productDAO.list();
	model.addAttribute("listproduct", listproduct);
	
	Product product=productDAO.get(id);
	model.addAttribute("product", product);
	
	return "Product";
	}
	
	@RequestMapping("/deleteproduct/{id}")
	public String deleteProduct(@PathVariable("id") String id, Model model){
		
	
	Product product=productDAO.get(id);
	if(product!=null){
	productDAO.delete(product);
	}
	return "redirect:/product";
	}
}