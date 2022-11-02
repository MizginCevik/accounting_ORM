package com.cydeo.entity;

import com.cydeo.enums.Type;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Invoice extends BaseEntity{
    private LocalDate invoiceDate;
    private String invoiceNumber;
    @Enumerated(EnumType.STRING)
    private Type invoiceType;
    @ManyToOne
    private Client client;

    public Invoice(LocalDate invoiceDate, String invoiceNumber, Type invoiceType) {
        this.invoiceDate = invoiceDate;
        this.invoiceNumber = invoiceNumber;
        this.invoiceType = invoiceType;
    }
}
