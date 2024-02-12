package com.dokuman.dokumentenmangement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RechnungsstellerDto {

    private String name;
    private String adresse;
    private String bankverbindung;
    private String steuernummer;
    private String ustid;
    private String iban;
    private String bic;


}