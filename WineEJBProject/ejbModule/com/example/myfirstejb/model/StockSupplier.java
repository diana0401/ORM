package com.example.myfirstejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: StockSupplier
 *
 */
@Entity
@Table(name="StockSupplier")
public class StockSupplier implements Serializable {

	   
	@Id
	@Column(name="stockSupplierId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stockSupplierId;
	
	@Column(name="price")	
	private float price;
	
	@Column(name="quantity")	
	private int quantity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="supplierId")
	private Supplier supplier;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="wineId")
	private Wine wine;
	private static final long serialVersionUID = 1L;

	public StockSupplier() {
		super();
	}   
	public int getStockSupplierId() {
		return this.stockSupplierId;
	}

	public void setStockSupplierId(int stockSupplierId) {
		this.stockSupplierId = stockSupplierId;
	}   
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Wine getWine() {
		return wine;
	}
	public void setWine(Wine wine) {
		this.wine = wine;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}   
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
   
}
