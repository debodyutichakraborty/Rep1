package com.niit.laptopworldbackend.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.niit.laptopworldbackend.model.Category;

@Repository
public interface CategoryDAO {
public boolean save(Category category);
public boolean update(Category category);
public boolean delete(Category category);
public Category get(String id);
public List<Category> list();
public List<String> categoryNameList();
}
