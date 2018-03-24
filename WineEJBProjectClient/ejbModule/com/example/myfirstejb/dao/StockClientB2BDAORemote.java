package com.example.myfirstejb.dao;

import javax.ejb.Remote;

import com.example.myfirstejb.dto.StockClientB2BDTO;

@Remote
public interface StockClientB2BDAORemote extends GenericDAO<StockClientB2BDTO> {

}
