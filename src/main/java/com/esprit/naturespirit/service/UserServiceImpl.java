package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.naturespirit.domain.User;

@LocalBean
@Stateless

public class UserServiceImpl implements UserService{
	
	@PersistenceContext(unitName = "natureSJPA")
	EntityManager entityManager;


	@Override
	public void add(User user) {
		entityManager.persist(user);
		
	}

	@Override
	public void delete(User user) {
		entityManager.remove(entityManager.merge(user));
		
	}

	@Override
	public void update(User user) {
		entityManager.merge(user);
		
	}

	@Override
	public List<User> findAll() {
		Query query = entityManager.createQuery("SELECT u FROM User u");
		return query.getResultList();
	}

	@Override
	public User findById(int id) {
		return entityManager.find(User.class, id);
	}

}
