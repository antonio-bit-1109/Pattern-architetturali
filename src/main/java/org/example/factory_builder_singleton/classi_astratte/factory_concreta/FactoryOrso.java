package org.example.factory_builder_singleton.classi_astratte.factory_concreta;

import org.example.factory_builder_singleton.beans.BeanOrso;
import org.example.factory_builder_singleton.classi_astratte.factory_astratta.GeneralFactory;
import org.example.factory_builder_singleton.classi_concrete.Orso;


public class FactoryOrso extends GeneralFactory<Orso, BeanOrso> {

    @Override
    protected Orso generaAnimale(BeanOrso bean) {
        return new Orso.Builder()
                .setColorePelo(bean.getColorePelo())
                .setNome(bean.getNome())
                .setFamiglia(bean.getFamiglia())
                .setLunghezzaCoda(bean.getLunghezzaCoda())
                .setLunghezzaMuso(bean.getLunghezzaMuso())
                .setPeso(bean.getPeso())
                .build();
    }


}
