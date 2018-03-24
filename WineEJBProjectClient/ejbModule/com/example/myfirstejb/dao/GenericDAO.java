package com.example.myfirstejb.dao;

import java.util.List;

import javax.ejb.Remote;


public interface GenericDAO<T> {
    T findById(int id);
    void insert(T object);
    void update(T object);
    void delete(T object);
}
