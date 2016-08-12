package com.niit.laptopworldbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class UserDetails {
	@Id
	private String userdetailsid;
	@Column(name="name")
	private String userdetailsname;
	private String userdetailsemail;
	private String userdetailscontact;
	private String userdetailspassword;
	private String userdetailsaddress;
	

}
