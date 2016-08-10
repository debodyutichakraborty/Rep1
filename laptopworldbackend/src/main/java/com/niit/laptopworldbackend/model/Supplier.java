package com.niit.laptopworldbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Supplier {
	@Id
	@Column(name="id")
	private int supplierid;
	@Column(name="name")
	private String suppliername;
	private String supplieraddress;

}
