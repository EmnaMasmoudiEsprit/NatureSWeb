package com.esprit.naturespirit.service;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.EntityManager;

import com.esprit.naturespirit.domain.OfficialContent;


@Stateless
public class ContentServiceImpl implements ContentService{

	
	@PersistenceContext(unitName="natureSJPA") //dependencyinjection : design pattern
	EntityManager entityManager;
	
	
	@Override
	public void add(OfficialContent offcontent ) {
		entityManager.persist(offcontent);//ajouter une ligne
		
		
	}

	

	@Override
	public void update(OfficialContent offcontent) {
		entityManager.merge(offcontent);
		
	}
	
	@Override
	public OfficialContent  findById(int id){
		
		
		return entityManager.find(OfficialContent.class, id);
	}

	@Override
    public void delete(OfficialContent offcontent){
		
		entityManager.remove(entityManager.merge(offcontent));
	}


	@Override
	public List<OfficialContent> findAll() {
		Query query = entityManager.createQuery("select u from OfficialContent u");
		return query.getResultList();//langage jpql //jpa norme
	}
	
	@Override
	public List<OfficialContent> findByType(String type) {
		Query query = entityManager.createQuery("select u from OfficialContent u WHERE u.type like '%"+type+"%'");
		return query.getResultList();//langage jpql //jpa norme
	}

}
