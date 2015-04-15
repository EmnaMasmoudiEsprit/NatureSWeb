package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.naturespirit.domain.SimpleUser;
@LocalBean
@Stateless

public class SimpleUserServiceImpl implements SimpleUserService {

	@PersistenceContext(unitName = "natureSJPA")
	EntityManager entityManager;

	@Override
	public void add(SimpleUser spUser) {
		entityManager.persist(spUser);
		
	}

	@Override
	public void delete(SimpleUser spUser) {
		entityManager.remove(entityManager.merge(spUser));
		
	}
//
	@Override
	public void update(SimpleUser spUser) {
		entityManager.merge(spUser);
		
	}

	@Override
	public List<SimpleUser> findAll() {
		Query query = entityManager.createQuery("SELECT u FROM SimpleUser u");
		return query.getResultList();
	}

	@Override
	public SimpleUser findById(int id) {
		return entityManager.find(SimpleUser.class, id);
	}

	
}
