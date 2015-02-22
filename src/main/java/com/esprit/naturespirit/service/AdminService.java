package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.Admin;


@Remote
public interface AdminService {
	
	void add(Admin admin);
	void  delete(Admin admin);
	void  update(Admin admin);
	List<Admin> findAll();
	Admin findById(int id);
//
}
