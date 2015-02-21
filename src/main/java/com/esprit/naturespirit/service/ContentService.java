package com.esprit.naturespirit.service;

import java.util.List;

import javax.ejb.Remote;
import com.esprit.naturespirit.domain.OfficialContent;
@Remote
public interface ContentService {

	
	
	void add(OfficialContent offcontent);
	void  delete(OfficialContent offcontent);
	void  update(OfficialContent offcontent);
	List<OfficialContent > findAll();
	OfficialContent findById(int id);
}
