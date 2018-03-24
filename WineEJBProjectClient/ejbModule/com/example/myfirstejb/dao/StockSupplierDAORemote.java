package com.example.myfirstejb.dao;

import javax.ejb.Remote;

import com.example.myfirstejb.dto.StockSupplierDTO;

@Remote
public interface StockSupplierDAORemote extends GenericDAO<StockSupplierDTO> {

}
