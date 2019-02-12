package com.lexsav.dao;

import com.lexsav.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<Customer> getCustomers() {
		
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer order by lastName", Customer.class);
		List<Customer> customers = query.getResultList();
		
		return customers;
	}

	public Customer getCustomer(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, id);
	}

	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.save(customer);
	}

	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.update(customer);
	}

	public void deleteCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(customer);
	}

}
