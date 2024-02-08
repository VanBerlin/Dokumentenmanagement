CREATE TABLE IF NOT EXISTS rechnungen
(
    id
    SERIAL
    PRIMARY
    KEY,
    faelligkeit
    DATE
    NOT
    NULL,
    rechnungsbetrag
    DECIMAL
(
    10,
    2
) NOT NULL,
    rechnungssteller VARCHAR
(
    255
) NOT NULL,
    rechnungsempfaenger VARCHAR
(
    255
) NOT NULL,
    bankverbindung VARCHAR
(
    255
) NOT NULL,
    rechnungsnummer VARCHAR
(
    255
) NOT NULL
    );
