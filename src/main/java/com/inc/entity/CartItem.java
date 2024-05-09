package com.inc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartItem extends BaseEntity {

    private int quantity;

    @ManyToOne
    Cart cart;

    @ManyToOne
    Product product;

}
