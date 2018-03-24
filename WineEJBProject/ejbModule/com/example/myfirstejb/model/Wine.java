package com.example.myfirstejb.model;

import java.io.Serializable;
import java.lang.Enum;
import java.lang.String;
import javax.persistence.*;

import com.example.commons.WineType;

/**
 * Entity implementation class for Entity: Wine
 *
 */
@Entity
@Table(name="Wine")
public class Wine implements Serializable {

	   
	@Id
	@Column(name="wineId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int wineId;
	
	@Column(name="year")
	private int year;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="variety")
	private String variety;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "ENUM('Dry', 'Demidry', 'Sweet', 'Demisweet')")
	private WineType type;
	private static final long serialVersionUID = 1L;

	public Wine() {
		super();
	}   
	public int getWineId() {
		return this.wineId;
	}

	public void setWineId(int wineId) {
		this.wineId = wineId;
	}   
	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getVariety() {
		return this.variety;
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
}
