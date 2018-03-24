package com.example.myfirstejb.dto;

import java.io.Serializable;

public class StockClientB2BDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int stockClientB2BId;
	private double price;
	private int quantity;
	private boolean active;
	private int limitProduct;
	private int clientB2BId;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getLimitProduct() {
		return limitProduct;
	}
	public void setLimitProduct(int limitProduct) {
		this.limitProduct = limitProduct;
	}
	public int getClientB2BId() {
		return clientB2BId;
	}
	public void setClientB2BId(int clientB2BId) {
		this.clientB2BId = clientB2BId;
	}
	public int getStockClientB2BId() {
		return stockClientB2BId;
	}
	public void setStockClientB2BId(int stockClientB2BId) {
		this.stockClientB2BId = stockClientB2BId;
	}
	
	
}
