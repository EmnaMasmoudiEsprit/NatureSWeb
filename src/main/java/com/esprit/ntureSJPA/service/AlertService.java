package com.esprit.ntureSJPA.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.Alert;


@Remote
public interface AlertService {
	
	
	void add(Alert alert);
	void delete(Alert alert);
	void update(Alert alert);
	List<Alert> findAll();
	Alert findByLogin(String id);
	

}
