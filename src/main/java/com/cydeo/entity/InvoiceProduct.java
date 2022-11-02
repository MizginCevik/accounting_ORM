package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "InvoiceProduct")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class InvoiceProduct extends BaseEntity{
    private String profit;
    private Integer quantity;
    @ManyToOne
    private Invoice invoice;
    @ManyToOne
    private Product product;

    public InvoiceProduct(String profit, Integer quantity) {
        this.profit = profit;
        this.quantity = quantity;
    }
}
