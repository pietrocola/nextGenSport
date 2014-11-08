CREATE TABLE ElencoTipologieCorso (ID int(11) NOT NULL AUTO_INCREMENT, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE TipologiaCorso (ID varchar(255) NOT NULL, ElencoTipologieCorsoID int(11), PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE DescrizioneCorso (ID varchar(255) NOT NULL, TipologiaCorsoID varchar(255), ElencoDescrizioniCorsoID int(11), Prenotazione tinyint(1) NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE ElencoDescrizioniCorso (ID int(11) NOT NULL AUTO_INCREMENT, PRIMARY KEY (ID)) ENGINE=InnoDB;
ALTER TABLE TipologiaCorso ADD INDEX FKTipologiaC713637 (ElencoTipologieCorsoID), ADD CONSTRAINT FKTipologiaC713637 FOREIGN KEY (ElencoTipologieCorsoID) REFERENCES ElencoTipologieCorso (ID);
ALTER TABLE DescrizioneCorso ADD INDEX FKDescrizion637436 (ElencoDescrizioniCorsoID), ADD CONSTRAINT FKDescrizion637436 FOREIGN KEY (ElencoDescrizioniCorsoID) REFERENCES ElencoDescrizioniCorso (ID);
ALTER TABLE DescrizioneCorso ADD INDEX FKDescrizion753301 (TipologiaCorsoID), ADD CONSTRAINT FKDescrizion753301 FOREIGN KEY (TipologiaCorsoID) REFERENCES TipologiaCorso (ID);
