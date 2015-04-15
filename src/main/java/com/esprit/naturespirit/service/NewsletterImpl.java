package com.esprit.naturespirit.service;

import java.util.List;






import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.naturespirit.domain.Action;
import com.esprit.naturespirit.domain.Alert;
import com.esprit.naturespirit.domain.Article;
import com.esprit.naturespirit.domain.Donation;
import com.esprit.naturespirit.domain.Newsletter;
import com.esprit.naturespirit.domain.Ship;
import com.esprit.naturespirit.domain.User;


@LocalBean
@Stateless
public class NewsletterImpl implements newsletterService{
	
	@PersistenceContext(unitName="natureSJPA")
	EntityManager entityManager;

	@Override
	public void add(Newsletter newsletter) {
		entityManager.persist(newsletter);
		
	}

	@Override
	public void delete(Newsletter newsletter) {
		entityManager.remove(entityManager.merge(newsletter));
		
	}

	@Override
	public void update(Newsletter newsletter) {
		entityManager.merge(newsletter);
		
	}

	@Override
	public List<Action> findAllAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alert> findAllAlert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ship> findAllShip() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findAllArticle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Donation> findAllDonation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUser() {
		Query query = entityManager.createQuery("SELECT u FROM User u ") ; 
		return query.getResultList(); 
	}

	@Override
	public Newsletter findById(int id) {
		
		return entityManager.find(Newsletter.class, id);
	}


    @Override
	public List<Newsletter> findAll() {
	Query query = entityManager.createQuery("SELECT u FROM Newsletter u ") ; 
	return query.getResultList(); 
		
	}

	@Override
	public String findAllemail() {
		
		return null;
	}

//	@Override
//	public List<User> findAllUserEmail() {
//		Query query = entityManager.createQuery("SELECT u.email ||',' From User u ") ; 
//		return query.getResultList();
//		
//		
//	}

	@Override
	public List<User> findAllUserEmail() {
		Query query = entityManager.createQuery("SELECT u.email From User u ") ; 
		return query.getResultList();
		
		
	}
	
	

}
