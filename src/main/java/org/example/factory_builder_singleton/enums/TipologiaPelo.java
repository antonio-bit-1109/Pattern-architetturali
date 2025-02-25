package org.example.factory_builder_singleton.enums;

public enum TipologiaPelo {

    MOLTO_FOLTO("molto folto"),
    MEDIO_FOLTO("medio folto"),
    POCO_FOLTO("poco folto");

    private final String tipoPelo;

    private TipologiaPelo(String p) {
        this.tipoPelo = p;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }
}
