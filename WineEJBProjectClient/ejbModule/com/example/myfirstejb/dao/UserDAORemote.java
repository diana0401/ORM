package com.example.myfirstejb.dao;

import javax.ejb.Remote;

import com.example.myfirstejb.dto.UserDTO;

@Remote
public interface UserDAORemote extends GenericDAO<UserDTO> {

}
