package com.inc.entity;

import com.inc.enums.CardSate;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cart extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CardSate cartState;

    @ManyToOne
    Discount discount;

    @ManyToOne
    Customer customer;
}
