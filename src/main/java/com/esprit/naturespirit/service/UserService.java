package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.SimpleUser;
import com.esprit.naturespirit.domain.User;

@Remote
public interface UserService {
	
	void add(User user);
	void  delete(User user);
	void  update(User user);
	List<User> findAll();
	User findById(int id);

}
