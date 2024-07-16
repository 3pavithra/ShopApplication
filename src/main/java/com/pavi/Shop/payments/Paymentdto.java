package com.pavi.Shop.payments;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Paymentdto {
    @Id
    private int Id;
    private String name;
    private int cost;

}
