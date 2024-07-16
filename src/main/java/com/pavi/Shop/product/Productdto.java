package com.pavi.Shop.product;

import com.pavi.Shop.orders.Orderdto;

// import org.apache.catalina.servlets.DefaultServlet.SortManager.Order;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Productdto {
  @Id
  private int id;
  private String name;

   @ManyToOne
    private Orderdto orders;
}
