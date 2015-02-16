package com.esprit.naturespirit.domain;

import java.io.Serializable;

import javax.persistence.Entity;


@Entity
public class Publication extends OfficialContent implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

}
