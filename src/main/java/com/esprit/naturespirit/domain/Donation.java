package com.esprit.naturespirit.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Donation
 *
 */
@Entity
public class Donation implements Serializable {

	private int id;
	private float value;
	private User User;
	private DonationCategory donationCategory;
	private Date date;
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

	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	public User getUser() {
		return User;
	}

	public void setUser(User User) {
		this.User = User;
	}

	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	public DonationCategory getDonationCategory() {
		return donationCategory;
	}

	public void setDonationCategory(DonationCategory donationCategory) {
		this.donationCategory = donationCategory;
	}
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
