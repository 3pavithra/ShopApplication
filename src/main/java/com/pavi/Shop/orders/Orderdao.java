package com.pavi.Shop.orders;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Orderdao {

    @Autowired
    private OrderRepo repo;

    public Orderdto saveDao(Orderdto orderdto){
return repo.save(orderdto);
    }
    public List<Orderdto> getall(){
        return repo.findAll();
    }
    public Optional<Orderdto> getbyid(int id){
        return repo.findById(id);
    }
}
