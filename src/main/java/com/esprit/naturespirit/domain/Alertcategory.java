package com.esprit.naturespirit.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Alertcategory implements Serializable {
	private int id;
	private String name;
	private List<Alert> alerts;

	public Alertcategory() {
		// TODO Auto-generated constructor stub
	}

	public Alertcategory(int id, String name) {

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
	public List<Alert> getAlerts() {
		return alerts;
	}

	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}
}
