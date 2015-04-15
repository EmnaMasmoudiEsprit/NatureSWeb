package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.naturespirit.domain.Content;
@Remote
public interface ContentService {

	
	
	void add(Content offcontent);
	void  delete(Content offcontent);
	void  update(Content offcontent);
	List<Content > findAll();
	Content findById(int id);
	List<Content> findByType(String type);
}
