package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.naturespirit.domain.Alert;

@LocalBean
@Stateless
public class AlertServiceImpl implements AlertService {

	@PersistenceContext(unitName = "natureSJPA")
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
	public List<Alert> findByName(String name) {
		List<Alert> alerts = null;
		try {
			Query query = entityManager
					.createQuery("SELECT u FROM Alert u WHERE u.name=:alert1");
			query.setParameter("alert1", name);
			alerts = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alerts;
	}

	@Override
	public List<Alert> findAll() {

		Query query = entityManager.createQuery("SELECT u FROM Alert u");

		return query.getResultList();
	}

	@Override
	public Alert findById(int id) {

		return entityManager.find(Alert.class, id);
	}
	@Override
	public List<Alert> findByPlace(String place) {
		List<Alert> alerts1 = null;
		try {
			Query query1 = entityManager
					.createQuery("SELECT u FROM Alert u WHERE u.place=:Tunisia");
			query1.setParameter("Tunisia", place);
			alerts1 = query1.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alerts1;
	}
}
