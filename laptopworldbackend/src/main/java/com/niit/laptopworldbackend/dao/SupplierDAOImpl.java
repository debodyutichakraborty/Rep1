package com.niit.laptopworldbackend.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Supplier;

@Repository(value="supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {


	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

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

	public Supplier get(String id) {
		// TODO Auto-generated method stub
		String hql = "from supplier where id=" + "'" + id + "'";

		
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> list = query.list();

		if (list == null) {
			return null;
		} else {
			return list.get(0);
		}

	}

	public List<Supplier> list() {
		// TODO Auto-generated method stub
		String hql = "from supplier";
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return query.list();
	}

}
