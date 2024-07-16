package com.pavi.Shop.Cart
;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDao {
    @Autowired
    private CartRepo cartRepo;
    public Cart saveCartDao(Cart cart){
        return cartRepo.save(cart);
    }
}
