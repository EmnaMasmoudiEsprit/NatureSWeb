package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.Action;

@Remote
public interface ActionService {

	public void add(Action action);

	void delete(Action action);

	void update(Action action);

	List<Action> findAll();

	List<Action> findByName(String name);

	public Action findById(int id);

	List<Action> findByPlace(String place);

	List<Action> findByState(String state);

}
