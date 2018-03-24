package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.StockClientB2BDTO;
import com.example.myfirstejb.dto.StockSupplierDTO;
import com.example.myfirstejb.model.ClientB2B;
import com.example.myfirstejb.model.StockClientB2B;
import com.example.myfirstejb.model.StockSupplier;
import com.example.myfirstejb.model.Supplier;
import com.example.myfirstejb.model.Wine;

/**
 * Session Bean implementation class StockSupplierDAO
 */
@Stateless
public class StockSupplierDAO implements StockSupplierDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public StockSupplierDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public StockSupplierDTO findById(int id) {
		StockSupplier stockSupplier = entityManager.find(StockSupplier.class, id);
		
		StockSupplierDTO stockSupplierDTO = new StockSupplierDTO();
		stockSupplierDTO.setSupplierId(stockSupplier.getSupplier().getUserId());
		stockSupplierDTO.setWineId(stockSupplier.getWine().getWineId());
		stockSupplierDTO.setStockSupplierId(stockSupplier.getStockSupplierId());
		stockSupplierDTO.setPrice(stockSupplier.getPrice());
		stockSupplierDTO.setQuantity(stockSupplier.getQuantity());
		
		return stockSupplierDTO;

	}


	@Override
	public void insert(StockSupplierDTO object) {
		Wine wine = entityManager.getReference(Wine.class, object.getWineId());
		Supplier supplier = entityManager.getReference(Supplier.class, object.getSupplierId());
		StockSupplier stockSupplier = new StockSupplier();
		stockSupplier.setSupplier(supplier);
		stockSupplier.setWine(wine);
		stockSupplier.setPrice(object.getPrice());
		stockSupplier.setQuantity(object.getQuantity());
		
		entityManager.persist(stockSupplier);
		entityManager.flush();	
		
	}

	@Override
	public void update(StockSupplierDTO object) {
		StockSupplier stockSupplier = entityManager.find(StockSupplier.class, object.getStockSupplierId());
		Wine wine = entityManager.getReference(Wine.class, object.getWineId());
		Supplier supplier = entityManager.getReference(Supplier.class, object.getSupplierId());
		
		stockSupplier.setSupplier(supplier);
		stockSupplier.setWine(wine);
		stockSupplier.setPrice(object.getPrice());
		stockSupplier.setQuantity(object.getQuantity());
		
		entityManager.merge(stockSupplier);
		entityManager.flush();
		
	}

	@Override
	public void delete(StockSupplierDTO object) {
		StockSupplier stockSupplier = entityManager.find(StockSupplier.class, object.getStockSupplierId());
		
		if(stockSupplier != null)
		{
			entityManager.remove(stockSupplier);
		}		
	}

}
