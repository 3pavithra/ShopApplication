package com.pavi.Shop.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Orderdao {

    @Autowired
    private OrderRepo repo;

    public Orderdto saveDao(Orderdto orderdto){
return repo.save(orderdto);
    }
}
