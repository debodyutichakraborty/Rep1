package com.niit.laptopworldbackend.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.laptopworldbackend.model.Category;
import com.niit.laptopworldbackend.model.Supplier;
import com.niit.laptopworldbackend.model.UserDetails;

@Repository("userdetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO {
	

	@Autowired
	private SessionFactory sessionFactory;


	public UserDetailsDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<UserDetails> list() {
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) sessionFactory.getCurrentSession()
				.createCriteria(UserDetails.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;
	}

	@Transactional
	public boolean save(UserDetails userdetails) {
		sessionFactory.getCurrentSession().save(userdetails);
		return true;
	}
	
	/*@Transactional
	public void save(UserDetails userDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(userDetails);
	}*/


	@Transactional
	public void delete(String id) {
		UserDetails userdetails = new UserDetails();
		userdetails.setUsername(id);
		sessionFactory.getCurrentSession().delete(userdetails);
	}

	@Transactional
	public UserDetails get(String id) {
		String hql = "from UserDetails where username=" + "'"+ id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		
		return null;
	}
	
	@Transactional
	public boolean isValidUser(String id, String password) {
		String hql = "from UserDetails where username= '" + id + "' and " + " password ='" + password+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserDetails> list = (List<UserDetails>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return true;
		}
		
		return false;
	}

	public void update(UserDetails userDetails) {
		// TODO Auto-generated method stub
		
	}


}
