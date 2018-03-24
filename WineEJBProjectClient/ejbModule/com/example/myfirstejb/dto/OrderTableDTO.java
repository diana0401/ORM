package com.example.myfirstejb.dto;

import java.io.Serializable;
import java.util.Date;

public class OrderTableDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int orderTableId;
	private int orderNumber;
	private Date date;
	private int clientB2CId;
	
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getClientB2CId() {
		return clientB2CId;
	}
	public void setClientB2CId(int clientB2CId) {
		this.clientB2CId = clientB2CId;
	}
	public int getOrderTableId() {
		return orderTableId;
	}
	public void setOrderTableId(int orderTableId) {
		this.orderTableId = orderTableId;
	}
	
}
