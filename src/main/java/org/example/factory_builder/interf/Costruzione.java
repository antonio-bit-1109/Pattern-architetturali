package org.example.factory_builder.interf;

import org.example.factory_builder.classi_concrete.Macchina;
import org.example.factory_builder.classi_concrete.classe_genitore.Macchinario;

public interface Costruzione <T extends Macchinario> {
    T build();
}
