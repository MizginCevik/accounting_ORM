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
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Client extends BaseEntity{
    private String clientName;
    private String email;
    private String phone;
    @OneToOne
    private Address address;

    public Client(String clientName, String email, String phone) {
        this.clientName = clientName;
        this.email = email;
        this.phone = phone;
    }
}
