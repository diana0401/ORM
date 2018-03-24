package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.OrderTableDTO;
import com.example.myfirstejb.dto.PromoDTO;
import com.example.myfirstejb.model.ClientB2C;
import com.example.myfirstejb.model.OrderTable;
import com.example.myfirstejb.model.Promo;
import com.example.myfirstejb.model.StockSupplier;

/**
 * Session Bean implementation class PromoDAO
 */
@Stateless
public class PromoDAO implements PromoDAORemote {

	
	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public PromoDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public PromoDTO findById(int id) {
		Promo promo = entityManager.find(Promo.class, id);
		
		PromoDTO promoDTO = new PromoDTO();
		promoDTO.setDiscount(promo.getDiscount());
		promoDTO.setPromoId(promo.getPromoId());
		promoDTO.setEndDate(promo.getEndDate());
		promoDTO.setStartDate(promo.getStartDate());
		promoDTO.setStockSupplierId(promo.getStockSupplier().getStockSupplierId());
		
		return promoDTO;

	}

	@Override
	public void insert(PromoDTO object) {
		StockSupplier stockSupplier = entityManager.getReference(StockSupplier.class, object.getStockSupplierId());
	    Promo promo = new Promo();
		promo.setStartDate(object.getStartDate());
		promo.setEndDate(object.getEndDate());
		promo.setStockSuppliers(stockSupplier);
		promo.setDiscount(object.getDiscount());
		
		entityManager.persist(promo);
		entityManager.flush();			
		
	}

	@Override
	public void update(PromoDTO object) {
		Promo promo = entityManager.find(Promo.class, object.getPromoId());
		StockSupplier stockSupplier = entityManager.getReference(StockSupplier.class, object.getStockSupplierId());
		
		promo.setStartDate(object.getStartDate());
		promo.setEndDate(object.getEndDate());
		promo.setStockSuppliers(stockSupplier);
		promo.setDiscount(object.getDiscount());
		
		entityManager.merge(promo);
		entityManager.flush();	
		
	}

	@Override
	public void delete(PromoDTO object) {
		Promo promo = entityManager.find(Promo.class, object.getPromoId());
		
		if(promo != null)
		{
			entityManager.remove(promo);
		}
		
	}

}
