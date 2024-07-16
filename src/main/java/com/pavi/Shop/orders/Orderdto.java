package com.pavi.Shop.orders;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Orderdto {
    @Id
    private int id;
private String name;
private String date;



}
