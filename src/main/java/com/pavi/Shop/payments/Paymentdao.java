package com.pavi.Shop.payments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Paymentdao{
@Autowired
private PaymentRepo repo;

    public Paymentdto saveDao(Paymentdto paymentdto){
return repo.save(paymentdto);  
     }
}