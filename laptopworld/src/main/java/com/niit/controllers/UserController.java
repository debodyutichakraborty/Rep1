package com.niit.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

@RequestMapping("/login")
public String getLogin(){
	return "login";
}
@RequestMapping("/logout")
public String getLogout(){
	return "home";
}
}
