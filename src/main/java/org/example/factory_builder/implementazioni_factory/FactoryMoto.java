package org.example.factory_builder.implementazioni_factory;

import org.example.factory_builder.beans.BeanMoto;
import org.example.factory_builder.classi_concrete.Moto;
import org.example.factory_builder.factory_abstract.FactoryGenerico;

public class FactoryMoto extends FactoryGenerico<BeanMoto , Moto> {


    @Override
    protected Moto creaVeicoloGenerico(BeanMoto bean) {
        return new Moto.Builder()
                .setDataImmatricolazione(bean.getDataImmatricolazione())
                .setPeso(bean.getPeso())
                .setMaxPasseggeri(bean.getMaxPasseggeri())
                .setTarga(bean.getTarga())
                .setRuote(bean.getRuote())
                .build();
    }
}
