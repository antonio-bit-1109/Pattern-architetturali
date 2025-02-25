package org.example.factory_builder_singleton.classi_astratte.factory_concreta;


import org.example.factory_builder_singleton.beans.BeanAquila;
import org.example.factory_builder_singleton.classi_astratte.factory_astratta.GeneralFactory;
import org.example.factory_builder_singleton.classi_concrete.Aquila;


public class FactoryAquila extends GeneralFactory<Aquila, BeanAquila> {

    // richiamo il builder della classe animale per generare animale
    @Override
    protected Aquila generaAnimale(BeanAquila bean) {
        return new Aquila.Builder()
                .setColorePrincipale(bean.getColorePrincipale())
                .setDataNascita(bean.getDataNascita())
                .setFamiglia(bean.getFamiglia())
                .setLunghezzaAli(bean.getLunghezzaAli())
                .setLunghezzaBecco(bean.getLunghezzaBecco())
                .setNome(bean.getNome())
                .setPeso(bean.getPeso())
                .setLunghezzaMediaPiume(bean.getLunghezzaMediaPiume())
                .build();
    }


}
