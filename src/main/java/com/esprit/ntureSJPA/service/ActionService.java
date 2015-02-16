package com.esprit.ntureSJPA.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.Action;


@Remote
public interface ActionService {
	
	
	void add(Action action);
	void delete(Action action);
	void update(Action action);
	List<Action> findAll();
	Action findByLogin(String id);
	

}
