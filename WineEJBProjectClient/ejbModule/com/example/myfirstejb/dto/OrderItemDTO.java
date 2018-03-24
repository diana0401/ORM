package com.example.myfirstejb.dto;

import java.io.Serializable;

public class OrderItemDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orderItemId;
	private int quantity;
	private float price;
	private int orderTableId;
	private int stockClientB2BId;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getOrderTableId() {
		return orderTableId;
	}
	public void setOrderTableId(int orderTableId) {
		this.orderTableId = orderTableId;
	}
	public int getStockClientB2BId() {
		return stockClientB2BId;
	}
	public void setStockClientB2BId(int stockClientB2BId) {
		this.stockClientB2BId = stockClientB2BId;
	}
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}
	
	
}
