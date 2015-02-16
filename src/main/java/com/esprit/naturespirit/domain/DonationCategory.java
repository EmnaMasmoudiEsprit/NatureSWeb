package com.esprit.naturespirit.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity

public class DonationCategory implements Serializable {
	
	private int id;
	private String name;
	private List<Donation> donations;
	private static final long serialVersionUID = 1L;

	public DonationCategory() {
		super();
	}

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}     
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(mappedBy="donationCategory")
	public List<Donation> getDonations() {
		return donations;
	}
	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}
   
}
