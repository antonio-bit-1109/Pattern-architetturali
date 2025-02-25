package org.example.factory_builder_singleton.interf;

import org.example.factory_builder_singleton.classi_astratte.Animale;

public interface Building<T extends Animale> {
    T build();
}
