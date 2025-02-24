package org.example.factory_builder.classi_concrete;

import org.example.factory_builder.classi_concrete.classe_genitore.Macchinario;
import org.example.factory_builder.interf.Costruzione;

import java.time.LocalDate;

public class Moto extends Macchinario {

    // prop classe
    private String targa ;
    private String ruote;
    private LocalDate DataImmatricolazione;
    private  String peso;
    private String maxPasseggeri;


    private Moto(Builder builder){
        this.targa = builder.targa;
        this.DataImmatricolazione = builder.DataImmatricolazione;
        this.peso = builder.peso;
        this.ruote = builder.ruote;
        this.maxPasseggeri = builder.maxPasseggeri;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "targa='" + targa + '\'' +
                ", ruote='" + ruote + '\'' +
                ", DataImmatricolazione=" + DataImmatricolazione +
                ", peso='" + peso + '\'' +
                ", maxPasseggeri='" + maxPasseggeri + '\'' +
                '}';
    }

    //classe builder interna che costruisce l 'oggetto moto anzichè passare al costruttore
    // i valori presenti all'interno del builder sono gli stessi persenti nella classe
    public static class Builder implements Costruzione<Moto> {
        private String targa ;
        private String ruote;
        private LocalDate DataImmatricolazione;
        private  String peso;
        private String maxPasseggeri;


        // ogni metodo è creato per settare una delle proprietà della classe moto,
        // ma ad ogni chiamata di metodo ritorna l oggetto Builder stesso
        public Builder setDataImmatricolazione(LocalDate dataImmatricolazione) {
            DataImmatricolazione = dataImmatricolazione;
            return this;
        }

        public Builder setMaxPasseggeri(String maxPasseggeri) {
            this.maxPasseggeri = maxPasseggeri;
            return this;
        }

        public Builder setPeso(String peso) {
            this.peso = peso;
            return this;
        }

        public Builder setRuote(String ruote) {
            this.ruote = ruote;
            return this;
        }

        public Builder setTarga(String targa) {
            this.targa = targa;
            return this;
        }


        @Override
        public Moto build() {
            return new Moto(this);
        }
    }

}
