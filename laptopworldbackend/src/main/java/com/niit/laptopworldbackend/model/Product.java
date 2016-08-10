package com.niit.laptopworldbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Product {
	@Id
	private int productid;
	@Column(name="name")
	private String productname;
	private String price;
	private int supplierid;
	private int categoryid;
	
}


	


