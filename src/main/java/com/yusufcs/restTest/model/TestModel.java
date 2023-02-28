package com.yusufcs.restTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class TestModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long id;
	@Column(name="playerName")
	private  String playerName;
	@Column(name="shirtNumber")
	private  int shirtNumber;
	@Column(name="teamName")
	private  String teamName;

	

	public TestModel() {
		super();
	}
	
	

	public TestModel(String playerName, int shirtNumber, String teamName) {
		super();
		this.playerName = playerName;
		this.shirtNumber = shirtNumber;
		this.teamName = teamName;
	}



	public  long getId() {
		return id;
	}

	public  void setId(long id) {
		this.id = id;
	}

	public  String getPlayerName() {
		return playerName;
	}

	public  void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public  int getShirtNumber() {
		return shirtNumber;
	}

	public  void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public  String getTeamName() {
		return teamName;
	}

	public  void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
