package org.example.factory_builder_singleton.store;

import org.example.factory_builder_singleton.classi_astratte.Animale;

import java.util.HashMap;
import java.util.Map;

public class Store {

    private static Store instance = null;
    private final static Map<String, Animale> ObjectStore = new HashMap<>();

    private Store() {
    }

    public static Store getInstance() {
        if (instance == null) {
            instance = new Store();
        }

        return instance;
    }

    public void addToStore(Animale obj) {
        ObjectStore.put(obj.getClass().getName(), obj);
    }

    public void checkStore() {
        for (Map.Entry<String, Animale> entry : ObjectStore.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().toString());
        }
    }
}
