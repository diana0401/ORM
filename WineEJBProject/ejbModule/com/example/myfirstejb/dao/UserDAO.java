package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.UserDTO;
import com.example.myfirstejb.dto.WineDTO;
import com.example.myfirstejb.model.User;
import com.example.myfirstejb.model.Wine;

/**
 * Session Bean implementation class UserDAO
 */
@Stateless
public class UserDAO implements UserDAORemote {

	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public UserDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public UserDTO findById(int id) {
		User user = entityManager.find(User.class, id);
		
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(user.getUserId());
		userDTO.setDtype(user.getDtype());
		userDTO.setUsername(user.getUsername());
		userDTO.setPassword(user.getPassword());
		userDTO.setEmail(user.getEmail());
		userDTO.setAddress(user.getAddress());
		
		return userDTO;

	}

	@Override
	public void insert(UserDTO object) {
		User user = new User();
		user.setUsername(object.getUsername());
		user.setPassword(object.getPassword());
		user.setEmail(object.getEmail());
		user.setAddress(object.getAddress());
		
		entityManager.persist(user);
		entityManager.flush();			

	}

	@Override
	public void update(UserDTO object) {
		User user = entityManager.find(User.class, object.getUserId());

		user.setUsername(object.getUsername());
		user.setPassword(object.getPassword());
		user.setEmail(object.getEmail());
		user.setAddress(object.getAddress());
		
		entityManager.merge(user);
		entityManager.flush();	
	
	}

	@Override
	public void delete(UserDTO object) {
		User user = entityManager.find(User.class, object.getUserId());
		
		if(user != null)
		{
			entityManager.remove(user);
		}
		
	}

}
