package com.pavi.Shop.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/product")
public class Productcontroller {
@Autowired
private Productservice service;

@PostMapping("/save")
public Productdto savesService(@RequestBody Productdto productdto,@RequestParam Integer order_id){
    return service.saveServiceProduct(productdto,order_id);
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
}
