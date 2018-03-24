package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.PromoDTO;
import com.example.myfirstejb.dto.StockClientB2BDTO;
import com.example.myfirstejb.model.ClientB2B;
import com.example.myfirstejb.model.Promo;
import com.example.myfirstejb.model.StockClientB2B;
import com.example.myfirstejb.model.StockSupplier;

/**
 * Session Bean implementation class StockClientB2BDAO
 */
@Stateless
public class StockClientB2BDAO implements StockClientB2BDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public StockClientB2BDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public StockClientB2BDTO findById(int id) {
		StockClientB2B stockClientB2B = entityManager.find(StockClientB2B.class, id);
		
		StockClientB2BDTO stockClientB2BDTO = new StockClientB2BDTO();
		stockClientB2BDTO.setStockClientB2BId(stockClientB2B.getStockClientB2BId());
		stockClientB2BDTO.setClientB2BId(stockClientB2B.getClientB2B().getUserId());
		stockClientB2BDTO.setActive(stockClientB2B.isActive());
		stockClientB2BDTO.setLimitProduct(stockClientB2B.getLimitProduct());
		stockClientB2BDTO.setPrice(stockClientB2B.getPrice());
		stockClientB2BDTO.setQuantity(stockClientB2B.getQuantity());
		
		return stockClientB2BDTO;
	}

	@Override
	public void insert(StockClientB2BDTO object) {
		ClientB2B clientB2B = entityManager.getReference(ClientB2B.class, object.getClientB2BId());
		StockClientB2B stockClientB2B = new StockClientB2B();
		stockClientB2B.setClientB2B(clientB2B);
		stockClientB2B.setActive(object.isActive());
		stockClientB2B.setLimitProduct(object.getLimitProduct());
		stockClientB2B.setPrice(object.getPrice());
		stockClientB2B.setQuantity(object.getQuantity());
		
		entityManager.persist(stockClientB2B);
		entityManager.flush();			
		
	}

	@Override
	public void update(StockClientB2BDTO object) {
		StockClientB2B stockClientB2B = entityManager.find(StockClientB2B.class, object.getStockClientB2BId());
		ClientB2B clientB2B = entityManager.getReference(ClientB2B.class, object.getClientB2BId());
		
		stockClientB2B.setClientB2B(clientB2B);
		stockClientB2B.setActive(object.isActive());
		stockClientB2B.setLimitProduct(object.getLimitProduct());
		stockClientB2B.setPrice(object.getPrice());
		stockClientB2B.setQuantity(object.getQuantity());
		
		entityManager.merge(stockClientB2B);
		entityManager.flush();	
		
	}

	@Override
	public void delete(StockClientB2BDTO object) {
		StockClientB2B stockClientB2B = entityManager.find(StockClientB2B.class, object.getStockClientB2BId());
		
		if(stockClientB2B != null)
		{
			entityManager.remove(stockClientB2B);
		}	
	}

}
