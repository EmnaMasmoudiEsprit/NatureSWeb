package com.esprit.naturespirit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Blog {

	private int id;
	private String Title;
	private SimpleUser simpleUser;
	
	
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	@OneToOne
	public SimpleUser getSimpleUser() {
		return simpleUser;
	}
	public void setSimpleUser(SimpleUser simpleUser) {
		this.simpleUser = simpleUser;
	}
	
	
	
}
