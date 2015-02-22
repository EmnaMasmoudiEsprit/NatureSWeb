package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.Action;
import com.esprit.naturespirit.domain.Alert;
import com.esprit.naturespirit.domain.Article;
import com.esprit.naturespirit.domain.Donation;
import com.esprit.naturespirit.domain.Newsletter;
import com.esprit.naturespirit.domain.Ship;
import com.esprit.naturespirit.domain.User;

@Remote
public interface newsletterService {

	void add (Newsletter newsletter);
	void delete(Newsletter newsletter);
	void update(Newsletter newsletter);
	public Newsletter findById(int id);
	List<Newsletter> findAll();
	String findAllemail();
	List<User> findAllUserEmail();
	List<Action> findAllAction();
	List<Alert> findAllAlert();
	List<Ship> findAllShip();
	List<Article>findAllArticle();
	List<Donation>findAllDonation();
	List<User> findAllUser();
	//
}
