package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.naturespirit.domain.Action;

@Stateless
public class ActionServiceImpl implements ActionService {

	@PersistenceContext(unitName = "natureSJPA")
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
	public List<Action> findByName(String name) {
		List<Action> actions=null;
		try {
			Query query = entityManager.createQuery("SELECT u FROM Action u WHERE u.name=:action1");
			query.setParameter("action1", name);
			 actions=query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return actions;
		}

	@Override
	public List<Action> findAll() {
		Query query = entityManager.createQuery("SELECT u FROM Action u");
		return query.getResultList();
	}

	@Override
	public Action  findById(int id){
		
		
		return entityManager.find(Action.class, id);
	}

	@Override
	public List<Action> findByPlace(String place) {
		// TODO Auto-generated method stub
		return null;
	}

}
