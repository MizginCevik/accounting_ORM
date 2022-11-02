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
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product extends BaseEntity{
    private String name;
    private BigDecimal price;
    @ManyToOne
    private Category category;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
