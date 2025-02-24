package org.example.factory_builder.implementazioni_factory;

import org.example.factory_builder.beans.BeanBarca;
import org.example.factory_builder.classi_concrete.Barca;
import org.example.factory_builder.factory_abstract.FactoryGenerico;

public class FactoryBarca extends FactoryGenerico<BeanBarca , Barca> {
    @Override
    protected Barca creaVeicoloGenerico(BeanBarca bean) {
        return new Barca.Builder()
                .setLunghezza(bean.getLunghezza())
                .setNumeroCabine(bean.getNumeroCabine())
                .setVolume(bean.getVolume())
                .setMaterialePrincipale(bean.getMaterialePrincipale())
                .setVelocitaMax(bean.getVelocitaMax())
                .build();
    }
}
