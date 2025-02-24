package org.example.factory_builder.factory_abstract;


import org.example.factory_builder.beans.Bean;
import org.example.factory_builder.classi_concrete.classe_genitore.Macchinario;

// classe responsabile per la creazione di qualsiasi veicolo
// è una classe astratta perchè questa classe non verrà mai implementata, ma viene utilizzata
// per essere ereditata da una specifica classe factory che creerà un tipo specifico di veicolo.
public abstract class FactoryGenerico<T extends Bean , I extends Macchinario> {

    public I crea(T bean){
        I veicolo = creaVeicoloGenerico(bean);
        return veicolo;
    }


    protected abstract I creaVeicoloGenerico(T bean);
}
