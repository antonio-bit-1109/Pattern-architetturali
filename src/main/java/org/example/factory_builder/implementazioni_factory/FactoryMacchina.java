package org.example.factory_builder.implementazioni_factory;

import org.example.factory_builder.beans.BeanMacchina;
import org.example.factory_builder.classi_concrete.Macchina;
import org.example.factory_builder.factory_abstract.FactoryGenerico;

public class FactoryMacchina extends FactoryGenerico<BeanMacchina , Macchina> {


    // questa factory sarà specifica per la creazione delle macchine
    @Override
    protected Macchina creaVeicoloGenerico(BeanMacchina beanMacchina) {
        return new Macchina.Builder()
                .setAnnoUscita(beanMacchina.getAnnoUscita())
                .setTarga(beanMacchina.getTarga())
                .setPeso(beanMacchina.getPeso())
                .setNumeroRuote(beanMacchina.getNumeroRuote())
                .setModello(beanMacchina.getModello())
                .setFornitore(beanMacchina.getFornitore())
                .setMaxPasseggeri(beanMacchina.getMaxPasseggeri())
                .setNomeProprietario(beanMacchina.getNomeProprietario()).build();
    }
}
