package com.esprit.naturespirit.service;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;





import com.esprit.naturespirit.domain.Admin;
import com.esprit.naturespirit.domain.SimpleUser;

@LocalBean
@Stateless
public class AdminServiceImpl implements AdminService{
	
	@PersistenceContext(unitName = "natureSJPA")
	EntityManager entityManager;

	@Override
	public void add(Admin admin) {
		entityManager.persist(admin);
		
	}

	@Override
	public void delete(Admin admin) {
		entityManager.remove(entityManager.merge(admin));
		
	}

	@Override
	public void update(Admin admin) {
		entityManager.merge(admin);
		
	}

	@Override
	public List<Admin> findAll() {
		Query query = entityManager.createQuery("SELECT u FROM Admin u");
		return query.getResultList();
	}
	
	@Override
	public Admin findById(int id) {
		return entityManager.find(Admin.class, id);
	}

	
	
	

}
