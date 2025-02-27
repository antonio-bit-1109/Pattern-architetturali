package org.example.facade_pattern;

public class AnalisiLunghezzaStringa {

    public int ritornaLunghezza(String frase) {
        return frase.length();
    }

    public boolean checkIfPari(int lengthFrase) {
        return lengthFrase % 2 == 0;
    }
}
