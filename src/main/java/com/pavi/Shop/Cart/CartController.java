package com.pavi.Shop.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private Cartservice cartservice;

    @PostMapping
    public Cart saveController(@RequestBody Cart cart){
        return cartservice.saveCartservice(cart);
    }
    

}
