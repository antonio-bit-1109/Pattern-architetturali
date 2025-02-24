package org.example.singleton;

//implementazione di una classe store singleton che conterrà i dati,
// come in una sorta di store globale
public class Store {

    private static Store instance = null;


    private Store(){}

    public static Store getInstance() {
        if (instance == null){
            instance = new Store();
        }

        return instance;
    }


}
