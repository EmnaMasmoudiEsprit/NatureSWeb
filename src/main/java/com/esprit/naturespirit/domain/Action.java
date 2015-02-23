package com.esprit.naturespirit.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity


public class Action implements Serializable {
/////////////////
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String desciption;
	private Date date;
	private String place;
	private String state;
	private String name;
	private Actcategory categ;
	private Interaction interaction;

	public Action() {
		// TODO Auto-generated constructor stub
	}

	public Action(int id, String name, String desciption, Date date,
			String place, String state) {

		this.id = id;
		this.name = name;
		this.desciption = desciption;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
	public Actcategory getCateg() {
		return categ;
	}

	public void setCateg(Actcategory categ) {
		this.categ = categ;
	}

	@OneToOne(mappedBy = "action")
	public Interaction getInteraction() {
		return interaction;
	}

	public void setInteraction(Interaction interaction) {
		this.interaction = interaction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
