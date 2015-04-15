package com.esprit.naturespirit.domain;


import java.io.File;
import java.io.Serializable;
import java.lang.Boolean;
import java.util.List;




import javax.persistence.*;


@Entity
public class SimpleUser extends User implements Serializable {

	
	private Boolean state_journalist;
	private String  cv;
	private Blog blog;
	
	private List<Article> articles;
	private Newsletter newsletter;
	
	
	
	private static final long serialVersionUID = 1L;

	public SimpleUser() {
		super();
	}   
	public Boolean getState_journalist() {
		return this.state_journalist;
	}

	public void setState_journalist(Boolean state_journalist) {
		this.state_journalist = state_journalist;
	}
	
	
	@OneToMany(mappedBy="simple")
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
	
	@OneToOne(mappedBy="simpleUser")
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	
	
}
