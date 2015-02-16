package com.esprit.ntureSJPA.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.naturespirit.domain.Action;
@Stateless
public class ActionServiceImpl implements ActionService {
	
	@PersistenceContext(unitName="natureSJPA")
	EntityManager entityManager;

	@Override
	public void add(Action action) {
		entityManager.persist(action);
	}

	@Override
	public void delete(Action action) {

		entityManager.remove(entityManager.merge(action));
		
	}

	@Override
	public void update(Action action) {
		entityManager.merge(action);
		
	}

	@Override
	public Action findByLogin(String login){
		
		return entityManager.find(Action.class, login);
		
	}
	
	@Override
	public List<Action> findAll() {
	
		Query query=entityManager.createQuery("SELECT u FROM Action u");
		
		return query.getResultList();
	}

}
