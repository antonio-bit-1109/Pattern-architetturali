package org.example.factory_builder_singleton.beans;

public class BeanAnimaliCoda extends Bean {

    private float LunghezzaCoda;
    private float lunghezzaMuso;


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
