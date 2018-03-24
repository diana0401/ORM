package com.example.myfirstejb.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderTable
 *
 */
@Entity
@Table(name="OrderTable")
public class OrderTable implements Serializable {
	   
	@Id
	@Column(name="orderId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	
	@Column(name="orderNumber")
	private int orderNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date date;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	private ClientB2C clientB2C;
	private static final long serialVersionUID = 1L;

	public OrderTable() {
		super();
	}   
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}   
	public int getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public ClientB2C getClientB2C() {
		return clientB2C;
	}
	public void setClientB2C(ClientB2C clientB2C) {
		this.clientB2C = clientB2C;
	}
}
