package com.esprit.naturespirit.domain;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class Invitation extends Interaction {
	private Date inv_date;
	private User user;

	public Invitation() {
		// TODO Auto-generated constructor stub
	}

	public Invitation(Date inv_date) {
		super();

		this.setInv_date(inv_date);
	}

	public Date getInv_date() {
		return inv_date;
	}

	public void setInv_date(Date inv_date) {
		this.inv_date = inv_date;
	}

	
	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
