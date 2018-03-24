package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.ClientB2CDTO;
import com.example.myfirstejb.dto.SupplierDTO;
import com.example.myfirstejb.model.ClientB2C;
import com.example.myfirstejb.model.Supplier;

/**
 * Session Bean implementation class SupplierDAO
 */
@Stateless
public class SupplierDAO implements SupplierDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public SupplierDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public SupplierDTO findById(int id) {
		Supplier supplier = entityManager.find(Supplier.class, id);
		
		SupplierDTO supplierDTO = new SupplierDTO();
		supplierDTO.setAge(supplier.getAge());
		supplierDTO.setWineryName(supplier.getWineryName());
		supplierDTO.setVisibility(supplier.getVisibility());
		
		return supplierDTO;
	}

	@Override
	public void insert(SupplierDTO object) {
		Supplier supplier = new Supplier();
		supplier.setAge(object.getAge());
		supplier.setWineryName(object.getWineryName());
		supplier.setVisibility(object.isVisibility());
		
		entityManager.persist(supplier);
		entityManager.flush();				
	}

	@Override
	public void update(SupplierDTO object) {
		Supplier supplier = entityManager.find(Supplier.class, object.getUserId());

		supplier.setAge(object.getAge());
		supplier.setWineryName(object.getWineryName());
		supplier.setVisibility(object.isVisibility());
		
		entityManager.merge(supplier);
		entityManager.flush();	
		
	}

	@Override
	public void delete(SupplierDTO object) {
		Supplier supplier = entityManager.find(Supplier.class, object.getUserId());
		
		if(supplier != null)
		{
			entityManager.remove(supplier);
		}
		
	}

}
