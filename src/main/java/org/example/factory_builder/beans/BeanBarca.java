package org.example.factory_builder.beans;

public class BeanBarca extends Bean{

    private float lunghezza;
    private float volume;
    private String materialePrincipale;
    private String numeroCabine;
    private int VelocitaMax;

    public float getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(float lunghezza) {
        this.lunghezza = lunghezza;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getMaterialePrincipale() {
        return materialePrincipale;
    }

    public void setMaterialePrincipale(String materialePrincipale) {
        this.materialePrincipale = materialePrincipale;
    }

    public String getNumeroCabine() {
        return numeroCabine;
    }

    public void setNumeroCabine(String numeroCabine) {
        this.numeroCabine = numeroCabine;
    }

    public int getVelocitaMax() {
        return VelocitaMax;
    }

    public void setVelocitaMax(int velocitaMax) {
        VelocitaMax = velocitaMax;
    }
}
