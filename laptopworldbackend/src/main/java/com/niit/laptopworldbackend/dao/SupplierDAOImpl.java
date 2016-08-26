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
import com.niit.laptopworldbackend.model.Supplier;
@EnableTransactionManagement
@Repository(value="supplierDAO")

public class SupplierDAOImpl implements SupplierDAO {


	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	@Transactional
	public boolean save(Supplier supplier) {
		// TODO Auto-generated method stub
		try {

			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Transactional
	public boolean update(Supplier supplier) {
		// TODO Auto-generated method stub
		try {

			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		
	}
	@Transactional
	public boolean delete(Supplier supplier) {
		// TODO Auto-generated method stub
		try {

			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		
	}
	@Transactional
	public Supplier get(String id) {
		// TODO Auto-generated method stub
		String hql = "from Supplier where id=" + "'" + id + "'";

		
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> list = query.list();

		if (list.size()>0) {
			return list.get(0);
		} else {
			return null;
		}

	}
	@Transactional
	public List<Supplier> list() {
		// TODO Auto-generated method stub
		String hql = "from Supplier";
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return query.list();
	}

}
