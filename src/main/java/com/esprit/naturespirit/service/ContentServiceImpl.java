package com.esprit.naturespirit.service;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.EntityManager;

import com.esprit.naturespirit.domain.Content;


@LocalBean
@Stateless
public class ContentServiceImpl implements ContentService{

	
	@PersistenceContext(unitName="natureSJPA") //dependencyinjection : design pattern
	EntityManager entityManager;
	
	
	@Override
	public void add(Content offcontent ) {
		entityManager.persist(offcontent);//ajouter une ligne
		
		
	}

	

	@Override
	public void update(Content offcontent) {
		entityManager.merge(offcontent);
		
	}
	
	@Override
	public Content  findById(int id){
		
		
		return entityManager.find(Content.class, id);
	}

	@Override
    public void delete(Content offcontent){
		
		entityManager.remove(entityManager.merge(offcontent));
	}


	@Override
	public List<Content> findAll() {
		Query query = entityManager.createQuery("select u from OfficialContent u");
		return query.getResultList();//langage jpql //jpa norme
	}
	
	@Override
	public List<Content> findByType(String type) {
		Query query = entityManager.createQuery("select u from OfficialContent u WHERE u.type like '%"+type+"%'");
		return query.getResultList();//langage jpql //jpa norme
	}

}
