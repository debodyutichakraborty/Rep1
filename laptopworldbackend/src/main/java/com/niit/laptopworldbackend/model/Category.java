package com.niit.laptopworldbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Category {
	@Id
	private String categoryid;
	@Column(name="name")
	private String categoryname;
	private String categorydescription;
	

}
