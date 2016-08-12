package com.niit.laptopworldbackend.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Supplier;
import com.niit.laptopworldbackend.model.UserDetails;

@Repository(value="userdetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO {


	@Autowired
	private SessionFactory sessionFactory;

	public UserDetailsDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	public boolean save(UserDetails userdetails) {
		// TODO Auto-generated method stub
		try {

			sessionFactory.getCurrentSession().save(userdetails);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean update(UserDetails userdetails) {
		// TODO Auto-generated method stub
		try {

			sessionFactory.getCurrentSession().update(userdetails);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		
	}

	public boolean delete(UserDetails userdetails) {
		// TODO Auto-generated method stub
		try {

			sessionFactory.getCurrentSession().delete(userdetails);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		
	}

	public UserDetails get(String id) {
		// TODO Auto-generated method stub
		String hql = "from userdetails where id=" + "'" + id + "'";

		
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<UserDetails> list = query.list();

		if (list == null) {
			return null;
		} else {
			return list.get(0);
		}

	}

	public List<UserDetails> list() {
		// TODO Auto-generated method stub
		String hql = "from userdetails";
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return query.list();
	}

}
