package com.bimal.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
	@Id @GeneratedValue
	private long id;
	private String name;
	private String position;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public Player() {
		super();
	}
	public Player(String name, String position) {
		this();
		this.name = name;
		this.position = position;
	}
	
	

}
