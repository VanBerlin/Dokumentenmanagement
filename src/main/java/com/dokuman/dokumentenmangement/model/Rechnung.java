package com.dokuman.dokumentenmangement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "rechnungen")
public class Rechnung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "faelligkeit")
    @Temporal(TemporalType.DATE)
    private Date faelligkeit; // Fälligkeitsdatum der Rechnung

    @Column(name = "rechnungsbetrag")
    private Double rechnungsbetrag; // Rechnungsbetrag

    @Column(name = "rechnungssteller")
    private String rechnungssteller; // Name oder Firma des Rechnungsstellers

    @Column(name = "rechnungsempfaenger")
    private String rechnungsempfaenger; // Name oder Firma des Rechnungsempfängers

    @Column(name = "bankverbindung")
    private String bankverbindung; // Bankverbindung des Rechnungsstellers

    @Column(name = "rechnungsnummer", unique = true)
    private String rechnungsnummer; // Einzigartige Rechnungsnummer

}
