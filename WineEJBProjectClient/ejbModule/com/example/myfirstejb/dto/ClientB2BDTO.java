package com.example.myfirstejb.dto;

import java.io.Serializable;

public class ClientB2BDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5863231744490628747L;
	/**
	 * 
	 */
	private int userId;
	private boolean visibility;
	private String companyName;
	private String CUI;
	private boolean subscribed;
	
	
	public ClientB2BDTO() {
		super();
	}
	public boolean isVisibility() {
		return visibility;
	}
	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCUI() {
		return CUI;
	}
	public void setCUI(String cUI) {
		CUI = cUI;
	}
	public boolean isSubscribed() {
		return subscribed;
	}
	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
