package com.example.myfirstejb.dao;

import javax.ejb.Remote;

import com.example.myfirstejb.dto.ClientB2CDTO;

@Remote
public interface ClientB2CDAORemote extends GenericDAO<ClientB2CDTO>{

}
