package com.niit.laptopworldbackend.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Product;
@EnableTransactionManagement
@Repository(value = "productDAO")

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	@Transactional
	public boolean save(Product product) {
		// TODO Auto-generated method stub
		try {

			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Product get(String id) {
		String hql = "from Product where id=" + "'" + id + "'";

		// TODO Auto-generated method stub
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> list = query.list();

		if (list.size()>0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	public List<Product> list() {
		String hql = "from Product";
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return query.list();
	}

}
