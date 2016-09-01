package com.niit.laptopworldbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table (name="USER_DETAILS")
@Component
public class UserDetails {
	@Id
	@Column(name="id")
	private String username;
	private String name;
	private String email;
	private String contact;
	private String password;
	private String address;
	private String role;

}
