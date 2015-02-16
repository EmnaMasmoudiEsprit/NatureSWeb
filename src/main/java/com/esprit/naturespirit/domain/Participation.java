package com.esprit.naturespirit.domain;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Participation extends Interaction{
	
	
private Date p_date;
public Participation() {
	// TODO Auto-generated constructor stub
}
public Participation(Date p_date) {
	super();
	this.setP_date(p_date);
}
public Date getP_date() {
	return p_date;
}
public void setP_date(Date p_date) {
	this.p_date = p_date;
}

}
