package com.esprit.ntureSJPA.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.naturespirit.domain.Alert;
@Stateless
public class AlertServiceImpl implements AlertService {
	
	@PersistenceContext(unitName="natureSJPA")
	EntityManager entityManager;

	@Override
	public void add(Alert alert) {
		entityManager.persist(alert);
	}

	@Override
	public void delete(Alert alert) {

		entityManager.remove(entityManager.merge(alert));
		
	}

	@Override
	public void update(Alert alert) {
		entityManager.merge(alert);
		
	}

	@Override
	public Alert findByLogin(String login){
		
		return entityManager.find(Alert.class, login);
		
	}
	
	@Override
	public List<Alert> findAll() {
	
		Query query=entityManager.createQuery("SELECT u FROM Alert u");
		
		return query.getResultList();
	}

}
