package org.example.factory_builder_singleton.classi_astratte.factory_astratta;

import org.example.factory_builder_singleton.beans.Bean;
import org.example.factory_builder_singleton.classi_astratte.Animale;

// la factory astratta stabilisce i metodi di creazione generali per gli oggetti
public abstract class GeneralFactory<T extends Animale, B extends Bean> {


    public T crea(B bean) {
        T animale = this.generaAnimale(bean);
        return animale;
    }


    // metodo astratto che va implmentato nella classe concreta per specificare quale animale sarà creato
    protected abstract T generaAnimale(B bean);
}
