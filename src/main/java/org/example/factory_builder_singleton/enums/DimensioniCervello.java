package org.example.factory_builder_singleton.enums;

public enum DimensioniCervello {

    PICCOLO("small"),
    MEDIO("medium"),
    GRANDE("big");

    private final String dimensioni;


    DimensioniCervello(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public String getDimensioni() {
        return dimensioni;
    }
}
