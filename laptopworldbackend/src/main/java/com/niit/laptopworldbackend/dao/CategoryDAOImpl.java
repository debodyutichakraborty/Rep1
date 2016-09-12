package com.niit.laptopworldbackend.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.laptopworldbackend.model.Category;
@EnableTransactionManagement
@Repository(value = "categoryDAO")

public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	@Transactional
	public boolean save(Category category) {
		// TODO Auto-generated method stub
		try {

			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Category get(String id) {
		String hql = "from Category where id=" + "'" + id + "'";

		// TODO Auto-generated method stub
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> list = query.list();

		if (list.size()>0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	public List<Category> list() {
		String hql = "from Category";
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return query.list();
	}
	@Transactional
	public List<String> categoryNameList(){
		String hql="select name from Category";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		List<String> listCategory=query.list();
		return listCategory;
	}

}
