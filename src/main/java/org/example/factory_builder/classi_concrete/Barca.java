package org.example.factory_builder.classi_concrete;

import org.example.factory_builder.classi_concrete.classe_genitore.Macchinario;
import org.example.factory_builder.interf.Costruzione;

public class Barca extends Macchinario {

    private float lunghezza;
    private float volume;
    private String materialePrincipale;
    private String numeroCabine;
    private int VelocitaMax;


    private Barca(Builder builder){
        this.lunghezza = builder.lunghezza;
        this.volume = builder.volume;
        this.VelocitaMax = builder.VelocitaMax;
        this.numeroCabine = builder.numeroCabine;
        this.materialePrincipale = builder.materialePrincipale;
    }

    @Override
    public String toString() {
        return "Barca{" + "\n" +
                "lunghezza=" + lunghezza +"\n" +
                " volume=" + volume +"\n" +
                " materialePrincipale='" + materialePrincipale + '\'' +"\n" +
                " numeroCabine='" + numeroCabine + '\'' +"\n" +
                " VelocitaMax=" + VelocitaMax +"\n" +
                '}';
    }

    public static class Builder implements Costruzione<Barca> {

    private float lunghezza;
    private float volume;
    private String materialePrincipale;
    private String numeroCabine;
    private int VelocitaMax;


    public Builder setLunghezza(float lunghezza) {
        this.lunghezza = lunghezza;
        return this;
    }

    public Builder setMaterialePrincipale(String materialePrincipale) {
        this.materialePrincipale = materialePrincipale;
        return this;
    }

    public Builder setNumeroCabine(String numeroCabine) {
        this.numeroCabine = numeroCabine;
        return this;
    }

    public Builder setVelocitaMax(int velocitaMax) {
        VelocitaMax = velocitaMax;
        return this;
    }

    public Builder setVolume(float volume) {
        this.volume = volume;
        return this;
    }


    @Override
    public Barca build() {
        return new Barca(this);
    }
}


}
