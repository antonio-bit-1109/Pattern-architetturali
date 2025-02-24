package org.example.factory_builder.classi_concrete;

import org.example.factory_builder.classi_concrete.classe_genitore.Macchinario;
import org.example.factory_builder.interf.Costruzione;

import java.time.LocalDate;


public class Macchina extends Macchinario  {


    //proprietà della classe macchina
    private String modello;
    private String targa;
    private LocalDate annoUscita;
    private int peso;
    private int numeroRuote;
    private String maxPasseggeri;
    private String nomeProprietario;
    private String fornitore;


    // costruttore privato della classe macchina
    private Macchina(Builder builder) {
        this.modello = builder.modello;
        this.targa = builder.targa;
        this.annoUscita = builder.annoUscita;
        this.peso = builder.peso;
        this.numeroRuote = builder.numeroRuote;
        this.maxPasseggeri = builder.maxPasseggeri;
        this.nomeProprietario = builder.nomeProprietario;
        this.fornitore = builder.fornitore;
    }


    @Override
    public String toString() {
        return "Macchina{" + "\n" +
                "modello='" + modello + '\'' +"\n" +
                " targa='" + targa + '\'' +"\n" +
                " annoUscita=" + annoUscita +"\n" +
                " peso=" + peso +"\n" +
                " numeroRuote=" + numeroRuote +"\n" +
                " maxPasseggeri='" + maxPasseggeri + '\'' +"\n" +
                " nomeProprietario='" + nomeProprietario + '\'' +"\n" +
                " fornitore='" + fornitore + '\'' +"\n" +
                '}';
    }

    public static class Builder implements Costruzione<Macchina> {
        private String modello;
        private String targa;
        private LocalDate annoUscita;
        private int peso;
        private int numeroRuote;
        private String maxPasseggeri;
        private String nomeProprietario;
        private String fornitore;

        public Builder setModello(String modello) {
            this.modello = modello;
            return this;
        }

        public Builder setTarga(String targa) {
            this.targa = targa;
            return this;
        }

        public Builder setAnnoUscita(LocalDate annoUscita) {
            this.annoUscita = annoUscita;
            return this;
        }

        public Builder setPeso(int peso) {
            this.peso = peso;
            return this;
        }

        public Builder setNumeroRuote(int numeroRuote) {
            this.numeroRuote = numeroRuote;
            return this;
        }

        public Builder setMaxPasseggeri(String maxPasseggeri) {
            this.maxPasseggeri = maxPasseggeri;
            return this;
        }

        public Builder setNomeProprietario(String nomeProprietario) {
            this.nomeProprietario = nomeProprietario;
            return this;
        }

        public Builder setFornitore(String fornitore) {
            this.fornitore = fornitore;
            return this;
        }


        @Override
        public Macchina build() {
            return new Macchina(this);
        }
    }



}
