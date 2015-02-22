package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.Ship;
@Remote
public interface RechercheService {
//	Ship findByName(String name);
	List<Ship> findByName(String name);
	List<Ship> findAllShip();
}
