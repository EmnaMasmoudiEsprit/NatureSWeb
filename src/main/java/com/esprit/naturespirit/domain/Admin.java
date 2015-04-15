package com.esprit.naturespirit.domain;


import com.esprit.naturespirit.domain.User;

import java.io.Serializable;
import java.lang.Boolean;
import java.util.List;



import javax.persistence.*;


@Entity
public class Admin extends User implements Serializable {

	
	
	private static final long serialVersionUID = 1L;

	private Boolean state_agent;

	private List<Ship> ships;
	
	
	public Admin() {
		super();
	}   
	public Boolean getState_agent() {
		return this.state_agent;
	}

	public void setState_agent(Boolean state_agent) {
		this.state_agent = state_agent;
	}
	
	
	
	
	@OneToMany(mappedBy="admin")
	public List<Ship> getShips() {
		return ships;
	}
	public void setShips(List<Ship> ships) {
		this.ships = ships;
	}
   
}
