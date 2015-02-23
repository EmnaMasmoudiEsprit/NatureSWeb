package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.Alert;

@Remote
public interface AlertService {

	void add(Alert alert);

	void delete(Alert alert);

	void update(Alert alert);

	List<Alert> findAll();

	List<Alert> findByName(String name);

	public Alert findById(int id);


	List<Alert> findByPlace(String place);
}
