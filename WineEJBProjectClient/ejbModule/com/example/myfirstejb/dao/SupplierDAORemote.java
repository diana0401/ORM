package com.example.myfirstejb.dao;

import javax.ejb.Remote;

import com.example.myfirstejb.dto.SupplierDTO;

@Remote
public interface SupplierDAORemote extends GenericDAO<SupplierDTO> {

}
