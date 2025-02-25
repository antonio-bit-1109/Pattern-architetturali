package org.example.factory_builder_singleton.classi_concrete;

import org.example.factory_builder_singleton.classi_astratte.AnimaliConCoda;
import org.example.factory_builder_singleton.enums.DimensioniCervello;
import org.example.factory_builder_singleton.enums.TipologiaPelo;
import org.example.factory_builder_singleton.interf.Building;

public class Orso extends AnimaliConCoda {

    private String nome;
    private String colorePelo;

    private Orso(Builder b) {
        this.nome = b.nome;
        this.colorePelo = b.colorePelo;
        this.setFamiglia(b.getFamiglia());
        this.setPeso(b.getPeso());
        this.setDimensioniCervello(DimensioniCervello.GRANDE.getDimensioni());
        this.setLunghezzaCoda(b.getLunghezzaCoda());
        this.setLunghezzaMuso(b.getLunghezzaMuso());
        this.setTipologiaDiPelo(TipologiaPelo.MEDIO_FOLTO.getTipoPelo());
    }


    @Override
    public String toString() {
        return "Orso{" +
                "nome='" + this.nome + '\'' +
                ", colorePelo='" + this.colorePelo + '\'' +
                ", famiglia='" + this.getFamiglia() + '\'' +
                ", peso='" + this.getPeso() + '\'' +
                ", dimensioni Cervello='" + this.getDimensioniCervello() + '\'' +
                ", lunghezza coda='" + this.getLunghezzaCoda() + '\'' +
                ", lunghezza muso='" + this.getLunghezzaMuso() + '\'' +
                ", tipologia pelo='" + this.getTipologiaDiPelo() + '\'' +
                '}';
    }

    public static class Builder implements Building<Orso> {

        private String nome;
        private String colorePelo;
        private float LunghezzaCoda;
        private float lunghezzaMuso;
        private float peso;
        private String Famiglia;


        public String getNome() {
            return nome;
        }

        public String getColorePelo() {
            return colorePelo;
        }

        public float getLunghezzaCoda() {
            return LunghezzaCoda;
        }


        public float getLunghezzaMuso() {
            return lunghezzaMuso;
        }

        public float getPeso() {
            return peso;
        }

        public String getFamiglia() {
            return Famiglia;
        }


        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setColorePelo(String colorePelo) {
            this.colorePelo = colorePelo;
            return this;
        }

        public Builder setLunghezzaCoda(float lunghezzaCoda) {
            LunghezzaCoda = lunghezzaCoda;
            return this;
        }


        public Builder setLunghezzaMuso(float lunghezzaMuso) {
            this.lunghezzaMuso = lunghezzaMuso;
            return this;
        }

        public Builder setPeso(float peso) {
            this.peso = peso;
            return this;
        }

        public Builder setFamiglia(String famiglia) {
            Famiglia = famiglia;
            return this;
        }


        @Override
        public Orso build() {
            return new Orso(this);
        }
    }
}
