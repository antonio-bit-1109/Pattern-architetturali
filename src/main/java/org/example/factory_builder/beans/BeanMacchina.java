package org.example.factory_builder.beans;

import java.time.LocalDate;

public class BeanMacchina extends Bean {
    private String modello;
    private String targa;
    private LocalDate annoUscita;
    private int peso;
    private int numeroRuote;
    private String maxPasseggeri;
    private String nomeProprietario;
    private String fornitore;

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public LocalDate getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(LocalDate annoUscita) {
        this.annoUscita = annoUscita;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getNumeroRuote() {
        return numeroRuote;
    }

    public void setNumeroRuote(int numeroRuote) {
        this.numeroRuote = numeroRuote;
    }

    public String getMaxPasseggeri() {
        return maxPasseggeri;
    }

    public void setMaxPasseggeri(String maxPasseggeri) {
        this.maxPasseggeri = maxPasseggeri;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getFornitore() {
        return fornitore;
    }

    public void setFornitore(String fornitore) {
        this.fornitore = fornitore;
    }
}
