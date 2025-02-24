package org.example.factory_builder.beans;

import java.time.LocalDate;

public class BeanMoto extends Bean{
    private String targa ;
    private String ruote;
    private LocalDate DataImmatricolazione;
    private  String peso;
    private String maxPasseggeri;

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getRuote() {
        return ruote;
    }

    public void setRuote(String ruote) {
        this.ruote = ruote;
    }

    public LocalDate getDataImmatricolazione() {
        return DataImmatricolazione;
    }

    public void setDataImmatricolazione(LocalDate dataImmatricolazione) {
        DataImmatricolazione = dataImmatricolazione;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getMaxPasseggeri() {
        return maxPasseggeri;
    }

    public void setMaxPasseggeri(String maxPasseggeri) {
        this.maxPasseggeri = maxPasseggeri;
    }
}
