package com.example.myfirstejb.dto;

import java.io.Serializable;

import com.example.commons.WineType;

public class WineDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int wineId;
	private int year;
	private String name;
	private String description;
	private String variety;
	private WineType type;
	
	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getVariety() {
		return variety;
	}


	public void setVariety(String variety) {
		this.variety = variety;
	}


	public WineType getType() {
		return this.type;
	}


	public void setType(WineType type) {
		this.type = type;
	}

	public int getWineId() {
		return wineId;
	}


	public void setWineId(int wineId) {
		this.wineId = wineId;
	}

}
