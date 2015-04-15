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
public class JournalistServiceImpl implements JournalistService {
	
	@PersistenceContext(unitName="natureSJPA")
	EntityManager entityManager ; 
	
	
	@Override
	public void add(SimpleUser simpleuser) {
		 
		entityManager.persist(simpleuser);
	}

	@Override
	public void delete(SimpleUser simpleuser) {
		
		entityManager.remove (entityManager.merge(simpleuser)); 
	}

	@Override
	public void update(SimpleUser simpleuser) {
		entityManager.merge (simpleuser); 
		
	}
    @Override
	public SimpleUser findById(int Id) {
		return entityManager.find(SimpleUser.class, Id) ;
	}
	
	
	@Override
	public List<SimpleUser> findAll() {
	Query query = entityManager.createQuery("SELECT u FROM SimpleUser u ") ; 
	return query.getResultList(); 
		
	}
	
	public void validateUser(SimpleUser simpleUser) {
		simpleUser.setState_journalist(true);
		entityManager.merge(simpleUser);
   }

}
