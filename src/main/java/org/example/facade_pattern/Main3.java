package org.example.facade_pattern;

import org.example.facade_pattern.facade_class.HandleStringFacade;

public class Main3 {

    public static void main(String[] args) {
        HandleStringFacade handleStringFacade = new HandleStringFacade();
        String esito = handleStringFacade.elaborateString("porcino");
        System.out.println(esito);
    }
}
