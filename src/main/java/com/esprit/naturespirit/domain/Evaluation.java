package com.esprit.naturespirit.domain;

import java.util.*;

import javax.persistence.Entity;
@Entity
public class Evaluation extends Interaction {
	private Date eval_date;
	private String type;
	private String content;
	private int score;
	
	public Evaluation() {
		// TODO Auto-generated constructor stub
	}

	public Evaluation(Date eval_date, String type, String content, int score) {
		super();
		this.eval_date = eval_date;
		this.type = type;
		this.content = content;
		this.score = score;
	}

	public Date getEval_date() {
		return eval_date;
	}

	public void setEval_date(Date eval_date) {
		this.eval_date = eval_date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	

}
