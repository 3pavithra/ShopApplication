package com.pavi.Shop.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class Ordercontroller {

    @Autowired
    private Orderservice orderservice;
@PostMapping("/save")
    public Orderdto savecotroller(@RequestBody Orderdto orderdto){
return orderservice.SaveServiceOrder(orderdto);
    }
}
