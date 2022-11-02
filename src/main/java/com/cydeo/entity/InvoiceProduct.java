package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "InvoiceProduct")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class InvoiceProduct extends BaseEntity{
    private BigDecimal profit;
    private Integer quantity;
    @ManyToOne
    private Invoice invoice;
    @ManyToOne
    private Product product;

    public InvoiceProduct(BigDecimal profit, Integer quantity) {
        this.profit = profit;
        this.quantity = quantity;
    }
}
