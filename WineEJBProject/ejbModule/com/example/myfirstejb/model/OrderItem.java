package com.example.myfirstejb.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderItem
 *
 */
@Entity
@Table(name="OrderItem")
public class OrderItem implements Serializable {

	   
	@Id
	@Column(name="orderItemId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderItemId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private float price;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="orderId")
	private OrderTable orderTable;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="stockClientB2BId")
	private StockClientB2B stockClientB2B;
	private static final long serialVersionUID = 1L;

	public OrderItem() {
		super();
	}   
	public int getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}   

	public OrderTable getOrder() {
		return orderTable;
	}
	public void setOrder(OrderTable orderTable) {
		this.orderTable = orderTable;
	}
	public StockClientB2B getStockClientB2B() {
		return stockClientB2B;
	}
	public void setStockClientB2B(StockClientB2B stockClientB2B) {
		this.stockClientB2B = stockClientB2B;
	}
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}   
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
   
}
