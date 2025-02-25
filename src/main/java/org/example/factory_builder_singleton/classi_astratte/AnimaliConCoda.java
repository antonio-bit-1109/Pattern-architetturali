package org.example.factory_builder_singleton.classi_astratte;

public class AnimaliConCoda extends Animale {

    private float LunghezzaCoda;
    private String tipologiaDiPelo;
    private float lunghezzaMuso;

    public String getTipologiaDiPelo() {
        return tipologiaDiPelo;
    }

    public void setTipologiaDiPelo(String tipologiaDiPelo) {
        this.tipologiaDiPelo = tipologiaDiPelo;
    }

    public float getLunghezzaCoda() {
        return LunghezzaCoda;
    }

    public void setLunghezzaCoda(float lunghezzaCoda) {
        LunghezzaCoda = lunghezzaCoda;
    }

    public float getLunghezzaMuso() {
        return lunghezzaMuso;
    }

    public void setLunghezzaMuso(float lunghezzaMuso) {
        this.lunghezzaMuso = lunghezzaMuso;
    }
}
