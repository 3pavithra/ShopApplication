package com.pavi.Shop.payments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Paymentservice {
    @Autowired
    private Paymentdao dao;
    public Paymentdto SaveService(Paymentdto paymentdto){
return dao.saveDao(paymentdto);
    }

    
}
