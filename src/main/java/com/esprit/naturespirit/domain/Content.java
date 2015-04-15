package com.esprit.naturespirit.domain;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="Content")
public class Content implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String type;
	private String description;
	private Date date;
	private byte[] blobcontent;
	private File file;
	private User user;
	
	
	
	public Content() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idc")
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
	
	
	@ManyToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Lob
	public byte[] getBlobcontent() {
		return blobcontent;
	}
	public void setBlobcontent(byte[] blobcontent) {
		this.blobcontent = blobcontent;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	

}
