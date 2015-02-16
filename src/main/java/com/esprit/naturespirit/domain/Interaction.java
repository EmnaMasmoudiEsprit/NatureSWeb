package com.esprit.naturespirit.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Interaction {
	
	private int id;
	
	private List<User> users;
	
	
	private Action action;
	private Alert alert;
	public Interaction() {
		
	}
	

	

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@OneToOne 
	@JoinColumn(name="fk_action ")
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}




	@ManyToMany
	public List<User> getUsers() {
		return users;
	}




	public void setUsers(List<User> users) {
		this.users = users;
	}



	@OneToOne 
	@JoinColumn(name="fk_alert ")
	public Alert getAlert() {
		return alert;
	}




	public void setAlert(Alert alert) {
		this.alert = alert;
	}
}
