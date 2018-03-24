package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.model.ClientB2B;
import com.example.myfirstejb.model.ClientB2C;

/**
 * Session Bean implementation class ClientB2BDAO
 */
@Stateless
public class ClientB2BDAO implements ClientB2BDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public ClientB2BDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public ClientB2BDTO findById(int id) {
		ClientB2B client = entityManager.find(ClientB2B.class, id);
		
		ClientB2BDTO clientDTO = new ClientB2BDTO();
		clientDTO.setCompanyName(client.getCompanyName());
		clientDTO.setCUI(client.getCUI());
		clientDTO.setSubscribed(client.getSubscribed());
		clientDTO.setVisibility(client.getVisibility());
		
		return clientDTO;
	
	}

	@Override
	public void insert(ClientB2BDTO object) {
		ClientB2B clientB2B = new ClientB2B();
		clientB2B.setCompanyName(object.getCompanyName());
		clientB2B.setCUI(object.getCUI());
		clientB2B.setSubscribed(object.isSubscribed());
		clientB2B.setVisibility(object.isVisibility());
				
		entityManager.persist(clientB2B);		
		entityManager.flush();
	}

	@Override
	public void update(ClientB2BDTO object) {
		ClientB2B client = entityManager.find(ClientB2B.class, object.getUserId());

		client.setCompanyName(object.getCompanyName());
		client.setCUI(object.getCUI());
		client.setSubscribed(object.isSubscribed());
		client.setVisibility(object.isVisibility());
		
		entityManager.merge(client);
		entityManager.flush();		
	}

	@Override
	public void delete(ClientB2BDTO object) {
		ClientB2B client = entityManager.find(ClientB2B.class, object.getUserId());
		
		if(client != null)
		{
			entityManager.remove(client);
		}
	}

}
