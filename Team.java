package com.bimal.example;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
public class Team {
	@Id @GeneratedValue
	private long id;
	private String name;
	private String location;
	private String mascotte;
	@OneToMany(cascade=CascadeType.ALL) @JoinColumn(name="teamId")
	Set<Player> player;
	
	public Team() {
		super();
	}
	public Team(String name, String location, Set<Player> player) {
		this();
		this.name = name;
		this.location = location;
		this.player = player;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascotte() {
		return mascotte;
	}
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	public Set<Player> getPlayer() {
		return player;
	}
	public void setPlayer(Set<Player> player) {
		this.player = player;
	}
	

}
