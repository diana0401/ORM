package com.example.myfirstejb.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Supplier
 *
 */
@Entity
@Table(name="Supplier")
@Inheritance(strategy=InheritanceType.JOINED)
public class Supplier extends User implements Serializable {

	@Column(name="visibility")
	private boolean visibility;
	
	@Column(name="wineryName")
	private String wineryName;
	
	@Column(name="age")
	private int age;
	private static final long serialVersionUID = 1L;

	public Supplier() {
		super();
	}    
	public boolean getVisibility() {
		return this.visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}   
	public String getWineryName() {
		return this.wineryName;
	}

	public void setWineryName(String wineryName) {
		this.wineryName = wineryName;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
   
}
