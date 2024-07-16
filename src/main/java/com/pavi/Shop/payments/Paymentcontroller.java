package com.pavi.Shop.payments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class Paymentcontroller {
    @Autowired
    private Paymentservice paymentservice;

    @PostMapping("/save")
    public Paymentdto savecotroller(@RequestBody Paymentdto paymentdto){
        return paymentservice.SaveService(paymentdto);
    }
   
}
