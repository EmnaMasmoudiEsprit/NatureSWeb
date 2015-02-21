package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.SimpleUser;


@Remote
public interface SimpleUserService {
	
	void add(SimpleUser spUser);
	void  delete(SimpleUser spUser);
	void  update(SimpleUser spUser);
	List<SimpleUser> findAll();
	SimpleUser findById(int id);

}
