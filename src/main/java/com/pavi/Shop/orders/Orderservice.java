package com.pavi.Shop.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Orderservice {

@Autowired
private Orderdao dao;

    public Orderdto SaveServiceOrder(Orderdto orderdto){
return dao.saveDao(orderdto);
    }
    
}
