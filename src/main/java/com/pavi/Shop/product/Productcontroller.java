package com.pavi.Shop.product;

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
@RequestMapping("/product")
public class Productcontroller {
@Autowired
private Productservice service;

@PostMapping("/save")
public Productdto savesService(@RequestBody Productdto productdto){
    return service.saveServiceProduct(productdto);
}
@GetMapping("/all")
public List<Productdto> GetAllProductcontroller(){
        return service.AllProductservice();
    }

// @GetMapping("/all/{id}")
// @GetMapping("/byid")
// public Optional<Productdto> Findbyidcontroller(@RequestParam int id){
//     return Productservice.FindByIdProductService(id);
// }

// @GetMapping("/{name}")
// public List<Productdto> findbynamecontroller(@PathVariable String name){
//     return service.findbynameProductService(name);
// }

@GetMapping("/{id}")
public Optional<Productdto> getbyId(@PathVariable int id){
        return  service.getbyId(id);
    }
}
