package com.pavi.Shop.orders;

import java.util.List;

import com.pavi.Shop.product.Productdto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Orderdto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;

    // @OneToMany(cascade = CascadeType.ALL)
    // private List<Productdto> products;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Productdto> products;
}
