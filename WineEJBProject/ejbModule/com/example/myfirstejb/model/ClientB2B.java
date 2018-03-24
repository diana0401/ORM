package com.example.myfirstejb.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ClientB2B
 *
 */
@Entity
@Table(name="ClientB2B")
@Inheritance(strategy=InheritanceType.JOINED)
public class ClientB2B extends User implements Serializable{

	@Column(name="visibility")
	private boolean visibility;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="CUI")
	private String CUI;
	
	@Column(name="subscribed")
	private boolean subscribed;
	private static final long serialVersionUID = 1L;

	public ClientB2B() {
		super();
	}   
	public boolean getVisibility() {
		return this.visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}   
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}   
	public String getCUI() {
		return this.CUI;
	}

	public void setCUI(String CUI) {
		this.CUI = CUI;
	}   
	public boolean getSubscribed() {
		return this.subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
   
}
