package com.pavi.Shop.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Cartservice {

    @Autowired
    private CartDao dao;

    public Cart saveCartservice(Cart cart){
        return dao.saveCartDao(cart);
    }

}
