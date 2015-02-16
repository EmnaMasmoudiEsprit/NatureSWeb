package com.esprit.naturespirit.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;




@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class OfficialContent implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String description;
	private Date datePublish;
	private Admin admin;
	
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDatePublish() {
		return datePublish;
	}
	public void setDatePublish(Date datePublish) {
		this.datePublish = datePublish;
	}
	
	@ManyToOne
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
