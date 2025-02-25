package org.example.factory_builder_singleton.classi_concrete;

import org.example.factory_builder_singleton.classi_astratte.AnimaliConAli;

import org.example.factory_builder_singleton.enums.DimensioniCervello;
import org.example.factory_builder_singleton.interf.Building;

import java.time.LocalDate;

public class Aquila extends AnimaliConAli {

    private String nome;
    private String colorePrincipale;
    private LocalDate dataNascita;

    private Aquila(Builder b) {
        this.nome = b.nome;
        this.colorePrincipale = b.colorePrincipale;
        this.dataNascita = b.dataNascita;
        this.setLunghezzaAli(b.getLunghezzaAli());
        this.setFamiglia(b.getFamiglia());
        this.setPeso(b.getPeso());
        this.setLunghezzaBecco(b.getLunghezzaBecco());
        this.setDimensioniCervello(DimensioniCervello.GRANDE.getDimensioni());
        
    }

    @Override
    public String toString() {
        return "Aquila{" +
                "nome='" + nome + '\'' +
                ", colorePrincipale='" + colorePrincipale + '\'' +
                ", dataNascita=" + dataNascita +
                ", lunghezzaAli=" + getLunghezzaAli() +
                ", peso=" + getPeso() +
                ", famiglia='" + getFamiglia() + '\'' +
                ", lunghezzaBecco=" + getLunghezzaBecco() +
                ", dimensioniCervello='" + this.getDimensioniCervello() + '\'' +
                '}';
    }

    // implementazione pattern builder per la creazione delle aquile
    // il builder aquila implementerà anche le prop che appartengono ad animale e animale con la coda
    public static class Builder implements Building<Aquila> {

        private String nome;
        private String colorePrincipale;
        private LocalDate dataNascita;
        private float peso;
        private String Famiglia;
        private float LunghezzaAli;
        private float lunghezzaMediaPiume;
        private float lunghezzaBecco;

        public String getNome() {
            return nome;
        }

        public String getColorePrincipale() {
            return colorePrincipale;
        }

        public LocalDate getDataNascita() {
            return dataNascita;
        }

        public float getPeso() {
            return peso;
        }

        public String getFamiglia() {
            return Famiglia;
        }

        public float getLunghezzaAli() {
            return LunghezzaAli;
        }

        public float getLunghezzaMediaPiume() {
            return lunghezzaMediaPiume;
        }

        public float getLunghezzaBecco() {
            return lunghezzaBecco;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setLunghezzaBecco(float lunghezzaBecco) {
            this.lunghezzaBecco = lunghezzaBecco;
            return this;
        }

        public Builder setLunghezzaMediaPiume(float lunghezzaMediaPiume) {
            this.lunghezzaMediaPiume = lunghezzaMediaPiume;
            return this;
        }

        public Builder setLunghezzaAli(float lunghezzaAli) {
            LunghezzaAli = lunghezzaAli;
            return this;
        }


        public Builder setFamiglia(String famiglia) {
            Famiglia = famiglia;
            return this;
        }

        public Builder setPeso(float peso) {
            this.peso = peso;
            return this;
        }

        public Builder setDataNascita(LocalDate dataNascita) {
            this.dataNascita = dataNascita;
            return this;
        }

        public Builder setColorePrincipale(String colorePrincipale) {
            this.colorePrincipale = colorePrincipale;
            return this;
        }

        @Override
        public Aquila build() {
            return new Aquila(this);
        }


    }

}
