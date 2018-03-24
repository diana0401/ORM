package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.OrderItemDTO;
import com.example.myfirstejb.dto.OrderTableDTO;
import com.example.myfirstejb.dto.StockClientB2BDTO;
import com.example.myfirstejb.model.ClientB2C;
import com.example.myfirstejb.model.OrderItem;
import com.example.myfirstejb.model.OrderTable;
import com.example.myfirstejb.model.StockClientB2B;
import com.example.myfirstejb.model.Wine;

/**
 * Session Bean implementation class OrderItemDAO
 */
@Stateless
public class OrderItemDAO implements OrderItemDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public OrderItemDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public OrderItemDTO findById(int id) {
		OrderItem orderItem = entityManager.find(OrderItem.class, id);
		
		OrderItemDTO orderItemDTO = new OrderItemDTO();
		orderItemDTO.setOrderItemId(orderItem.getOrderItemId());
		orderItemDTO.setOrderTableId(orderItem.getOrder().getOrderId());
		orderItemDTO.setPrice(orderItem.getPrice());
		orderItemDTO.setQuantity(orderItem.getQuantity());
		orderItemDTO.setStockClientB2BId(orderItem.getStockClientB2B().getStockClientB2BId());
		
		return orderItemDTO;
	}

	@Override
	public void insert(OrderItemDTO object) {
		OrderTable orderTable = entityManager.getReference(OrderTable.class, object.getOrderTableId());
		StockClientB2B stockClientB2B = entityManager.getReference(StockClientB2B.class, object.getStockClientB2BId());
		
		OrderItem orderItem = new OrderItem();
		orderItem.setOrder(orderTable);
		orderItem.setPrice(object.getPrice());
		orderItem.setQuantity(object.getQuantity());
		orderItem.setStockClientB2B(stockClientB2B);
		
		entityManager.persist(orderItem);
		entityManager.flush();	
	}

	@Override
	public void update(OrderItemDTO object) {
		OrderItem orderItem = entityManager.find(OrderItem.class, object.getOrderTableId());
		OrderTable orderTable = entityManager.getReference(OrderTable.class, object.getOrderTableId());
		StockClientB2B stockClientB2B = entityManager.getReference(StockClientB2B.class, object.getStockClientB2BId());
		
		orderItem.setOrder(orderTable);
		orderItem.setPrice(object.getPrice());
		orderItem.setQuantity(object.getQuantity());
		orderItem.setStockClientB2B(stockClientB2B);
		
		entityManager.merge(orderItem);
		entityManager.flush();	
	}

	@Override
	public void delete(OrderItemDTO object) {
		OrderItem orderItem = entityManager.find(OrderItem.class, object.getOrderItemId());
		
		if(orderItem != null)
		{
			entityManager.remove(orderItem);
		}
		
	}

}
