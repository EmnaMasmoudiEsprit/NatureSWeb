package com.esprit.naturespirit.domain;


import java.io.File;
import java.io.Serializable;
import java.lang.Boolean;
import java.util.List;




import javax.persistence.*;


@Entity
public class SimpleUser extends User implements Serializable {

	
	private Boolean state_journalist;
	private Newsletter newsletter;
	private File  cv;
	private Blog blog;
	private List<Article> articles;
	
	
	
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
	@ManyToOne
	public Newsletter getNewsletter() {
		return newsletter;
	}
	public void setNewsletter(Newsletter newsletter) {
		this.newsletter = newsletter;
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
	
	public File getCv() {
		return cv;
	}
	public void setCv(File cv) {
		this.cv = cv;
	}
   
}
