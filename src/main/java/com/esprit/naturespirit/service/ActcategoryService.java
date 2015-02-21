package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.Actcategory;
@Remote
public interface ActcategoryService {

	
		public void add(Actcategory action);

		void delete(Actcategory action);

		void update(Actcategory action);

		List<Actcategory> findAll();

		List<Actcategory> findByName(String name);

		public Actcategory findById(int id);

	}



