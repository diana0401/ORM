package com.example.myfirstejb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Promo
 *
 */
@Entity
@Table(name="Promo")
public class Promo implements Serializable {

	   
	@Id
	@Column(name="promoId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int promoId;
	
	@Temporal(TemporalType.DATE)
	@Column(name="startDate")
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="endDate")
	private Date endDate;
	
	@Column(name="discount")
	private float discount;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="stockSupplierId")
	private StockSupplier stockSupplier;
	private static final long serialVersionUID = 1L;

	public Promo() {
		super();
	}   
	public int getPromoId() {
		return this.promoId;
	}

	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}   
	
	public StockSupplier getStockSupplier() {
		return stockSupplier;
	}
	public void setStockSuppliers(StockSupplier stockSupplier) {
		this.stockSupplier = stockSupplier;
	}
	
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}   
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}   
	public float getDiscount() {
		return this.discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
   
}
