package com.example.myfirstejb.dto;

import java.io.Serializable;

public class StockSupplierDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int stockSupplierId;
	private float price;
	private int quantity;
	private int supplierId;
	private int wineId;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getWineId() {
		return wineId;
	}
	public void setWineId(int wineId) {
		this.wineId = wineId;
	}
	public int getStockSupplierId() {
		return stockSupplierId;
	}
	public void setStockSupplierId(int stockSupplierId) {
		this.stockSupplierId = stockSupplierId;
	}
	
}
