package com.pavi.Shop.orders;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Orderservice {

@Autowired
private Orderdao dao;

    public Orderdto SaveServiceOrder(Orderdto orderdto){
return dao.saveDao(orderdto);
    }
    public List<Orderdto> getall(){
        return dao.getall();
    }
    public Optional<Orderdto> getbyid(int id){
        return dao.getbyid(id);
    }
}
