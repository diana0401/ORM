package com.example.myfirstejb.model;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ClientB2C
 *
 */
@Entity
@Table(name="ClientB2C")
@Inheritance(strategy=InheritanceType.JOINED)
public class ClientB2C extends User implements Serializable {

	@Column(name="name")   
	private String name;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="CNP")
	private String CNP;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dateRegister")
	private Date dateRegister;
	private static final long serialVersionUID = 1L;

	public ClientB2C() {
		super();
	}     
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}   
	public String getCNP() {
		return this.CNP;
	}

	public void setCNP(String CNP) {
		this.CNP = CNP;
	}   
	public Date getDateRegister() {
		return this.dateRegister;
	}

	public void setDateRegister(Date dateRegister) {
		this.dateRegister = dateRegister;
	}
   
}
