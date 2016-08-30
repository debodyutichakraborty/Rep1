package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.niit.laptopworldbackend.dao.SupplierDAO;
import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping("/supplier")
	public String getSupplier(Model model ){
		
		List<Supplier> listsupplier=supplierDAO.list();
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("listsupplier", listsupplier);
		return "Supplier";
	}
	
	@RequestMapping("/savesupplier")
	public String saveSupplier(@ModelAttribute("supplier") Supplier supplier ){
	
		if((supplierDAO.get(supplier.getSupplierid()))!=null)
		{
			supplierDAO.update(supplier);
		}
		else{
			supplierDAO.save(supplier);
		}
		//supplierDAO.save(supplier);
		return "redirect:/supplier";
	}
	
	@RequestMapping("/editsup/{id}")
	public String editSupplierPage(@PathVariable("id") String id, Model model){
		
	List<Supplier> listsupplier=supplierDAO.list();
	model.addAttribute("listsupplier", listsupplier);
	
	Supplier supplier=supplierDAO.get(id);
	model.addAttribute("supplier", supplier);
	
	return "Supplier";
	}
	
	@RequestMapping("/deletesup/{id}")
	public String deleteSupplier(@PathVariable("id") String id, Model model){
		
	
	Supplier supplier=supplierDAO.get(id);
	supplierDAO.delete(supplier);
	
	return "redirect:/supplier";
	}
	
}
