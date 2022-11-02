package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Category extends BaseEntity{
    private String categoryName;
    private BigDecimal tax;

    public Category(String categoryName, BigDecimal tax) {
        this.categoryName = categoryName;
        this.tax = tax;
    }
}
