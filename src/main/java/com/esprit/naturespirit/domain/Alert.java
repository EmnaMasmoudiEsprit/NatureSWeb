package com.esprit.naturespirit.domain;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.lang.String;
import java.lang.Integer;
@Entity
public class Alert   implements Serializable{

	private int id;
	private String desciption;
	private String place;
	private String state;
	private String name;
	private Alertcategory categ;
	private Interaction decision;

	public Alert() {
		// TODO Auto-generated constructor stub
	}

	public Alert(int id, String name , String desciption, String place,
			String state) {

		this.id = id;
		this.name=name;
		this.desciption = desciption;
		this.place = place;
		this.state = state;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}


	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//@ManyToOne
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	public Alertcategory getCateg() {
		return categ;
	}

	public void setCateg(Alertcategory categ) {
		this.categ = categ;
	}
	
	@OneToOne(mappedBy="alert")
	public Interaction getDecision() {
		return decision;
	}
	public void setDecision(Interaction decision) {
		this.decision = decision;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
