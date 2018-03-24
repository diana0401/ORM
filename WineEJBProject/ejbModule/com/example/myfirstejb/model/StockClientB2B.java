package com.example.myfirstejb.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: StockClientB2B
 *
 */
@Entity
@Table(name="StockClientB2B")
public class StockClientB2B implements Serializable {

	   
	@Id
	@Column(name="stockClientB2BId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stockClientB2BId;
	
	@Column(name="price")
	private double price;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="active")
	private boolean active;
	
	@Column(name="limitProduct")
	private int limitProduct;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	private ClientB2B clientB2B;
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	@JoinColumn(name="stockSupplierId")
	private List<StockSupplier> stockSuppliers;
	
	public StockClientB2B() {
		super();
	}   
	public int getStockClientB2BId() {
		return this.stockClientB2BId;
	}

	public void setStockClientB2BId(int stockClientB2BId) {
		this.stockClientB2BId = stockClientB2BId;
	}     
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}   
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ClientB2B getClientB2B() {
		return clientB2B;
	}
	public void setClientB2B(ClientB2B clientB2B) {
		this.clientB2B = clientB2B;
	}
	public List<StockSupplier> getStockSuppliers() {
		return stockSuppliers;
	}
	public void setStockSuppliers(List<StockSupplier> stockSuppliers) {
		this.stockSuppliers = stockSuppliers;
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
	
}
