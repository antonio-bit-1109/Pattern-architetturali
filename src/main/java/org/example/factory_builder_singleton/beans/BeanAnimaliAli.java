package org.example.factory_builder_singleton.beans;

public class BeanAnimaliAli extends Bean {

    private float LunghezzaAli;
    private float lunghezzaMediaPiume;
    private float lunghezzaBecco;

    public float getLunghezzaAli() {
        return LunghezzaAli;
    }

    public void setLunghezzaAli(float lunghezzaAli) {
        LunghezzaAli = lunghezzaAli;
    }

    public float getLunghezzaBecco() {
        return lunghezzaBecco;
    }

    public void setLunghezzaBecco(float lunghezzaBecco) {
        this.lunghezzaBecco = lunghezzaBecco;
    }

    public float getLunghezzaMediaPiume() {
        return lunghezzaMediaPiume;
    }

    public void setLunghezzaMediaPiume(float lunghezzaMediaPiume) {
        this.lunghezzaMediaPiume = lunghezzaMediaPiume;
    }
}
