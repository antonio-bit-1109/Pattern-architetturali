package org.example.factory_builder_singleton.classi_astratte;

public abstract class AnimaliConAli extends Animale {

    private float LunghezzaAli;
    private float lunghezzaMediaPiume;
    private float lunghezzaBecco;

    public float getLunghezzaAli() {
        return LunghezzaAli;
    }

    public void setLunghezzaAli(float lunghezzaAli) {
        LunghezzaAli = lunghezzaAli;
    }

    public float getLunghezzaMediaPiume() {
        return lunghezzaMediaPiume;
    }

    public void setLunghezzaMediaPiume(float lunghezzaMediaPiume) {
        this.lunghezzaMediaPiume = lunghezzaMediaPiume;
    }

    public float getLunghezzaBecco() {
        return lunghezzaBecco;
    }

    public void setLunghezzaBecco(float lunghezzaBecco) {
        this.lunghezzaBecco = lunghezzaBecco;
    }
}
