package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.SupplierDTO;
import com.example.myfirstejb.dto.WineDTO;
import com.example.myfirstejb.model.Supplier;
import com.example.myfirstejb.model.Wine;

/**
 * Session Bean implementation class WineDAO
 */
@Stateless
public class WineDAO implements WineDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public WineDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public WineDTO findById(int id) {
		Wine wine = entityManager.find(Wine.class, id);
		
		WineDTO wineDTO = new WineDTO();
		wineDTO.setName(wine.getName());
		wineDTO.setType(wine.getType());
		wineDTO.setVariety(wine.getVariety());
		wineDTO.setYear(wine.getYear());
		wineDTO.setDescription(wine.getDescription());
		
		return wineDTO;

	}

	@Override
	public void insert(WineDTO object) {
		Wine wine = new Wine();
		wine.setName(object.getName());
		wine.setType(object.getType());
		wine.setVariety(object.getVariety());
		wine.setYear(object.getYear());
		wine.setDescription(object.getDescription());
		
		entityManager.persist(wine);
		entityManager.flush();		
	}

	@Override
	public void update(WineDTO object) {
		Wine wine = entityManager.find(Wine.class, object.getWineId());

		wine.setName(object.getName());
		wine.setType(object.getType());
		wine.setVariety(object.getVariety());
		wine.setYear(object.getYear());
		wine.setDescription(object.getDescription());
		
		entityManager.merge(wine);
		entityManager.flush();	

	}

	@Override
	public void delete(WineDTO object) {
		Wine wine = entityManager.find(Wine.class, object.getWineId());
		
		if(wine != null)
		{
			entityManager.remove(wine);
		}
		
	}

}
