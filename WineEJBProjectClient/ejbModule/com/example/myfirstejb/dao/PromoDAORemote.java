package com.example.myfirstejb.dao;

import javax.ejb.Remote;

import com.example.myfirstejb.dto.PromoDTO;

@Remote
public interface PromoDAORemote extends GenericDAO<PromoDTO> {

}
