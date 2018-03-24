package com.example.myfirstejb.dao;

import javax.ejb.Remote;

import com.example.myfirstejb.dto.WineDTO;

@Remote
public interface WineDAORemote extends GenericDAO<WineDTO> {

}
