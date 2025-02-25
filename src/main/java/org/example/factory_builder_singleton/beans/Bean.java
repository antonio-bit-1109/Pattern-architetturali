package org.example.factory_builder_singleton.beans;

// bean generico per la creazione delle prop base
public abstract class Bean {

    private float peso;
    private String Famiglia;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getFamiglia() {
        return Famiglia;
    }

    public void setFamiglia(String famiglia) {
        Famiglia = famiglia;
    }
}
