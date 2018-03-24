package com.example.myfirstejb.dto;

import java.io.Serializable;
import java.util.Date;

public class PromoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int promoId;
	private Date startDate;
	private Date endDate;
	private float discount;
	private int stockSupplierId;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public int getStockSupplierId() {
		return stockSupplierId;
	}
	public void setStockSupplierId(int stockSupplierId) {
		this.stockSupplierId = stockSupplierId;
	}
	public int getPromoId() {
		return promoId;
	}
	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}
	
	
}
