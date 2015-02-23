package com.esprit.naturespirit.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Actcategory implements Serializable{
	private int id;
	private String name;
	private List<Action> actions;

	public Actcategory() {
		// TODO Auto-generated constructor stub
	}
//////////////////////////
	public Actcategory(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//@OneToMany(mappedBy="categ")
	@OneToMany(mappedBy="categ")
	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
}
