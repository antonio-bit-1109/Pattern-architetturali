package org.example.facade_pattern.facade_class;

import org.example.facade_pattern.AnalisiLunghezzaStringa;
import org.example.facade_pattern.HandleUpperCase;

public class HandleStringFacade {

    private AnalisiLunghezzaStringa analisiLunghezzaStringa = new AnalisiLunghezzaStringa();
    private HandleUpperCase handleUpperCase = new HandleUpperCase();
    private int lenghtStringa;
    private boolean esito;

    public String elaborateString(String frase) {
        this.lenghtStringa = this.analisiLunghezzaStringa.ritornaLunghezza(frase);
        this.esito = this.analisiLunghezzaStringa.checkIfPari(this.lenghtStringa);
        return this.handleUpperCase.handleIfPair_or_odd(this.esito, frase);
    }

}
