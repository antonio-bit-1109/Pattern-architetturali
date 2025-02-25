package org.example.factory_builder_singleton.classi_astratte;

public abstract class Animale {

    private float peso;
    private String Famiglia;
    private String DimensioniCervello;

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

    public String getDimensioniCervello() {
        return DimensioniCervello;
    }

    public void setDimensioniCervello(String dimensioniCervello) {
        DimensioniCervello = dimensioniCervello;
    }
}
