package com.esprit.naturespirit.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.lang.String;
import java.util.Set;


@Entity
@Table(name="Newsletter")

public class Newsletter implements Serializable {

	private int id;
	private String content;
	private Set<User> User;
	private static final long serialVersionUID = 1L;

	public Newsletter() {
		super();
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	@OneToMany(mappedBy="newsletter")
	public Set<User> getUser() {
		return User;
	}
	public void setUser(Set<User> user) {
		User = user;
	}
	
	
	
	
}
