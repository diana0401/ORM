package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.derby.tools.sysinfo;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.ClientB2CDTO;
import com.example.myfirstejb.dto.OrderTableDTO;
import com.example.myfirstejb.dto.WineDTO;
import com.example.myfirstejb.model.ClientB2C;
import com.example.myfirstejb.model.OrderTable;
import com.example.myfirstejb.model.Wine;

/**
 * Session Bean implementation class OrderTableDAO
 */
@Stateless
public class OrderTableDAO implements OrderTableDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public OrderTableDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public OrderTableDTO findById(int id) {
		OrderTable orderTable = entityManager.find(OrderTable.class, id);
		
		OrderTableDTO orderTableDTO = new OrderTableDTO();
		orderTableDTO.setClientB2CId(orderTable.getClientB2C().getUserId());
		orderTableDTO.setDate(orderTable.getDate());
		orderTableDTO.setOrderNumber(orderTable.getOrderNumber());
		orderTableDTO.setOrderTableId(orderTable.getOrderId());
		
		return orderTableDTO;
	}

	@Override
	public void insert(OrderTableDTO object) {
		ClientB2C clientB2C = entityManager.getReference(ClientB2C.class, object.getClientB2CId());
		OrderTable orderTable = new OrderTable();
		orderTable.setClientB2C(clientB2C);
		orderTable.setDate(object.getDate());
		orderTable.setOrderNumber(object.getOrderNumber());
		
		entityManager.persist(orderTable);
		entityManager.flush();	
		
	}

	@Override
	public void update(OrderTableDTO object) {
		OrderTable orderTable = entityManager.find(OrderTable.class, object.getOrderTableId());
		ClientB2C clientB2C = entityManager.getReference(ClientB2C.class, object.getClientB2CId());
		
		orderTable.setClientB2C(clientB2C);
		orderTable.setDate(object.getDate());
		orderTable.setOrderNumber(object.getOrderNumber());
		
		entityManager.merge(orderTable);
		entityManager.flush();	
		
	}

	@Override
	public void delete(OrderTableDTO object) {
		OrderTable orderTable = entityManager.find(OrderTable.class, object.getOrderTableId());
		
		if(orderTable != null)
		{
			entityManager.remove(orderTable);
		}
	}

}
