package com.example.myfirstejb.dao;

import javax.ejb.Remote;

import com.example.myfirstejb.dto.OrderTableDTO;

@Remote
public interface OrderTableDAORemote extends GenericDAO<OrderTableDTO> {

}
