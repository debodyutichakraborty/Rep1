package com.niit.laptopworldbackend.dao;

import java.util.List;

import com.niit.laptopworldbackend.model.UserDetails;





public interface UserDetailsDAO {


	public List<UserDetails> list();

	public UserDetails get(String id);

	public boolean save(UserDetails userdetails);
	
	public void update(UserDetails userDetails);

	public void delete(String id);
	
	public boolean isValidUser(String id, String password);


}
