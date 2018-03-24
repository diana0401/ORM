package com.example.myfirstejb.dao;

import java.io.Console;
import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.ClientB2CDTO;
import com.example.myfirstejb.model.ClientB2B;
import com.example.myfirstejb.model.ClientB2C;

/**
 * Session Bean implementation class ClientB2CDAO
 */
@Stateless
public class ClientB2CDAO implements ClientB2CDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public ClientB2CDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public ClientB2CDTO findById(int id) {
		System.out.println(id);
		ClientB2C client = entityManager.find(ClientB2C.class, id);
		
		System.out.println("client found "+client.toString());
		ClientB2CDTO clientDTO = new ClientB2CDTO();
		clientDTO.setCNP(client.getCNP());
		clientDTO.setDateRegister(client.getDateRegister());
		clientDTO.setFirstName(client.getFirstname());
		clientDTO.setName(client.getName());
		clientDTO.setUserId(client.getUserId());
		
		return clientDTO;
	}

	@Override
	public void insert(ClientB2CDTO object) {		
		ClientB2C clientB2C = new ClientB2C();
		clientB2C.setDateRegister(object.getDateRegister());
		clientB2C.setCNP(object.getCNP());
		clientB2C.setName(object.getName());
		clientB2C.setFirstname(object.getFirstName());
		
		entityManager.persist(clientB2C);
		entityManager.flush();
	}

	@Override
	public void update(ClientB2CDTO object) {
		ClientB2C client = entityManager.find(ClientB2C.class, object.getUserId());

		client.setCNP(object.getCNP());
		client.setDateRegister(object.getDateRegister());
		client.setFirstname(object.getFirstName());
		client.setName(object.getName());
		
		entityManager.merge(client);
		entityManager.flush();	
		
	}

	@Override
	public void delete(ClientB2CDTO object) {
		ClientB2C client = entityManager.find(ClientB2C.class, object.getUserId());
		
		if(client != null)
		{
			entityManager.remove(client);
		}
	}

}
