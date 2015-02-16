package com.esprit.naturespirit.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Donation
 *
 */
@Entity
public class Donation implements Serializable {

	private int id;
	private float value;
	private SimpleUser simpleUser;
	private DonationCategory donationCategory;
	private static final long serialVersionUID = 1L;

	public Donation() {
		super();
	}

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	
	public float getValue() {
		return this.value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@ManyToOne
	public SimpleUser getSimpleUser() {
		return simpleUser;
	}

	public void setSimpleUser(SimpleUser simpleUser) {
		this.simpleUser = simpleUser;
	}

	@ManyToOne
	public DonationCategory getDonationCategory() {
		return donationCategory;
	}

	public void setDonationCategory(DonationCategory donationCategory) {
		this.donationCategory = donationCategory;
	}

}
