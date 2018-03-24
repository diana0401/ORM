package com.example.myfirstejb.dao;

import javax.ejb.Remote;

import com.example.myfirstejb.dto.ClientB2BDTO;

@Remote
public interface ClientB2BDAORemote extends GenericDAO<ClientB2BDTO>{

}
