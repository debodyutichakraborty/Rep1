package com.niit.laptopworldbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
public class Product {
	
	@Id
	@Column(name="id")
	private String productid;
	@Column(name="productname")
	private String name;
	private String description;
	private double price;
	private String supplierid;
	private String categoryid;


	@ManyToOne
	@JoinColumn(name="CATEGORYID",insertable=false, updatable=false)
	private Category category;
	
	
	@ManyToOne
	@JoinColumn(name="SUPPLIERID",insertable=false, updatable=false)
	private Supplier supplier;
	
	public Category getCategory() {
		return category;
	}
	/*public void setCategory(Category category) {
		this.category = category;
	}*/
	
	public Supplier getSupplier() {
		return supplier;
	}
	
	/*public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}*/
	
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}


	@Transient
	MultipartFile file;

	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	
	
}


	


