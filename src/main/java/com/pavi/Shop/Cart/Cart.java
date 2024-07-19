package com.pavi.Shop.Cart;


import java.util.List;

import com.pavi.Shop.product.Productdto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Cart {
    @Id
    private int id;
    private String date;

    @OneToMany
   private List<Productdto> productdto;
  
}
