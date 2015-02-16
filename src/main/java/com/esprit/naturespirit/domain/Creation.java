package com.esprit.naturespirit.domain;

import java.util.*;

import javax.persistence.Entity;

@Entity
public class Creation extends Interaction {
	private Date c_date;

	public Creation() {
		// TODO Auto-generated constructor stub
	}

	public Creation(Date c_date) {
		super();
		this.setC_date(c_date);
	}

	public Date getC_date() {
		return c_date;
	}

	public void setC_date(Date c_date) {
		this.c_date = c_date;
	}

}
