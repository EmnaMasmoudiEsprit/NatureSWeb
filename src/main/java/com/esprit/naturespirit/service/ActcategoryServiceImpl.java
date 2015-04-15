package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.naturespirit.domain.Actcategory;
@LocalBean
@Stateless
public class ActcategoryServiceImpl implements ActcategoryService {
	@PersistenceContext(unitName = "natureSJPA")
	EntityManager entityManager;

	@Override
	public void add(Actcategory action) {
		entityManager.persist(action);
	}

	@Override
	public void delete(Actcategory action) {

		entityManager.remove(entityManager.merge(action));
	}
//ooooooooooo
	@Override
	public void update(Actcategory action) {
		entityManager.merge(action);

	}

	@Override
	public List<Actcategory> findByName(String name) {

		List<Actcategory> actions = null;
		try {
			Query query = entityManager
					.createQuery("SELECT u.name FROM Actcategory u WHERE u.name=:act");
			query.setParameter("act", name);
			actions = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return actions;
	}

	@Override
	public List<Actcategory> findAll() {
		Query query = entityManager.createQuery("SELECT u FROM Actcategory u");
		return query.getResultList();
	}

	@Override
	public Actcategory findById(int id) {

		return entityManager.find(Actcategory.class, id);
	}
	
	
	

}
