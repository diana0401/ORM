package com.example.myfirstejb.dao;

import javax.ejb.Remote;

@Remote
public interface FirstStatlessEJBRemote {

	void insert(String name);
}
