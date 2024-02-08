package com.dokuman.dokumentenmangement.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RechnungDto {

    private LocalDate faelligkeit;
    private BigDecimal rechnungsbetrag;
    private String rechnungssteller;
    private String rechnungsempfaenger;
    private String bankverbindung;
    private String rechnungsnummer;

    // Getter und Setter
}
