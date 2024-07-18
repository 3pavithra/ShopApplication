package com.pavi.Shop.orders;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/all")
    public List<Orderdto> getall(){
        return orderservice.getall();
    }
    @GetMapping("/{id}")
     public Optional<Orderdto> getbyid(@PathVariable int id){
        return orderservice.getbyid(id);
    }
}
