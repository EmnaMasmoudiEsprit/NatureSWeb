package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.naturespirit.domain.Ship;


@LocalBean
@Stateless
public class RechercheImpl implements RechercheService {

	@PersistenceContext(unitName="natureSJPA")
	EntityManager entityManager;
	


	@Override
	public List<Ship> findByName(String name) {
		List<Ship> actions=null;
		try {
			Query query = entityManager.createQuery("SELECT u FROM ship u WHERE u.name=:casandra");
			query.setParameter("casandra", name);
			 actions=query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return actions;
		}
	
	
	@Override
	public List<Ship> findAllShip() {
		Query query =entityManager.createQuery("SELECT u FROM Ship u");
		return query.getResultList();
	}

}
