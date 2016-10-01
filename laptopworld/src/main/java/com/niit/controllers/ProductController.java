package com.niit.controllers;

import java.security.Principal;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.niit.laptopworldbackend.dao.CategoryDAO;
import com.niit.laptopworldbackend.dao.ProductDAO;
import com.niit.laptopworldbackend.dao.SupplierDAO;
import com.niit.laptopworldbackend.dao.UserDetailsDAO;
import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Product;
import com.niit.laptopworldbackend.model.Supplier;

import utility.FileUtil;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@Autowired
	UserDetailsDAO userdetailsDAO;

	
	@RequestMapping("/product")
	public String getProducts(Model model ){
		
		List<Product> listproduct=productDAO.list();
		List<Category> listcategory=categoryDAO.list();
		List<Supplier> listsupplier=supplierDAO.list();
		if(listproduct.size()>0){
		model.addAttribute("listproduct", listproduct);
		model.addAttribute("categorylist", listcategory);
		model.addAttribute("supplierlist", listsupplier);
		}
		else{
			
			model.addAttribute("msg", "no products available");
		
		}
		
		model.addAttribute("product",new Product());
		model.addAttribute("category",new Category());
		model.addAttribute("supplier",new Supplier());
		return "Product";
}
	@RequestMapping("/productsdetails")
	public String getProductsdetails(Model model){
		List<Product> listproduct=productDAO.list();
		List<Category> listcategory=categoryDAO.list();
		List<Supplier> listsupplier=supplierDAO.list();
		if(listproduct.size()>0){
		model.addAttribute("listproduct", listproduct);
		model.addAttribute("listcategory", listcategory);
		model.addAttribute("listsupplier", listsupplier);
		}
		else{
			
			model.addAttribute("msg", "no products available");
		
		}
		return "Productsdetails";
	}
	
	@RequestMapping("/saveproduct")
	public String saveProduct(@ModelAttribute("product") Product product, Principal principal ){
	
		String username=principal.getName();
		if(userdetailsDAO.get(username).getRole().equals("ADMIN")){
			
		
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
		else{
			return "redirect:/403";
		}
	}
	
	@RequestMapping("/editproduct/{id}")
	public String editProductPage(@PathVariable("id") String id, Model model){
		
	List<Product> listproduct=productDAO.list();
	List<Category> listcategory=categoryDAO.list();
	List<Supplier> listsupplier=supplierDAO.list();
	model.addAttribute("listproduct", listproduct);
	
	Product product=productDAO.get(id);
	model.addAttribute("product", product);
	model.addAttribute("listcategory", listcategory);
	model.addAttribute("listsupplier", listsupplier);
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
	
	@RequestMapping("/viewproduct/{id}")
	public String viewProductPage(@PathVariable("id") String id, Model model){
	
		Product product=productDAO.get(id);
		model.addAttribute("selectedproduct", product);
		return "Select Page";
	}
} 