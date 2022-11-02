package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address extends BaseEntity{
    private String description;
    private String zipcode;
    @ManyToOne
    private State state;
    @OneToOne(mappedBy = "address")
    private Client client;

    public Address(String description, String zipcode) {
        this.description = description;
        this.zipcode = zipcode;
    }
}
