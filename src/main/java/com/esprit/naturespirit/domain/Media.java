package com.esprit.naturespirit.domain;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Lob;



@Entity
public class Media extends OfficialContent implements Serializable{
	

	
	private static final long serialVersionUID = 1L;
  
	private String type;
	private String name;
	@Lob
    private byte[] picture;
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}


}
