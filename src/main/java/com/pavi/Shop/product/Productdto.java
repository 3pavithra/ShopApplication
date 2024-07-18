package com.pavi.Shop.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pavi.Shop.orders.Orderdto;

// import org.apache.catalina.servlets.DefaultServlet.SortManager.Order;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Productdto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;

  @ManyToOne // Many products can belong to one order
  @JoinColumn
    @JsonIgnore // To prevent infinite recursion during JSON serialization
    private Orderdto order;
}
