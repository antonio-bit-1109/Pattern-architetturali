package org.example.factory_builder;

import org.example.factory_builder.beans.BeanBarca;
import org.example.factory_builder.beans.BeanMacchina;
import org.example.factory_builder.beans.BeanMoto;
import org.example.factory_builder.classi_concrete.Barca;
import org.example.factory_builder.classi_concrete.Macchina;
import org.example.factory_builder.classi_concrete.Moto;
import org.example.factory_builder.implementazioni_factory.FactoryBarca;
import org.example.factory_builder.implementazioni_factory.FactoryMacchina;
import org.example.factory_builder.implementazioni_factory.FactoryMoto;

import java.time.LocalDate;

public class Main0 {

    public static void main(String[] args) {

        BeanMoto bMo = new BeanMoto();
        bMo.setDataImmatricolazione(LocalDate.now());
        bMo.setMaxPasseggeri("2");
        bMo.setRuote("2");
        bMo.setTarga("ax229rd");
        bMo.setPeso("850");

        BeanMacchina bMa = new BeanMacchina();
        bMa.setAnnoUscita(LocalDate.of(1999,4,22));
        bMa.setFornitore("ford");
        bMa.setModello("fiesta");
        bMa.setNomeProprietario("antonio");
        bMa.setNumeroRuote(4);
        bMa.setPeso(1500);
        bMa.setMaxPasseggeri("6");
        bMa.setTarga("cx299bp");

        BeanBarca bBa = new BeanBarca();
        bBa.setLunghezza(12.55f);
        bBa.setMaterialePrincipale("carbonio");
        bBa.setNumeroCabine("5");
        bBa.setVelocitaMax(12);
        bBa.setVolume(255.45f);

        FactoryMacchina factoryMacchina = new FactoryMacchina();
        Macchina macchina = factoryMacchina.crea(bMa);
        System.out.println(macchina.toString());

        FactoryMoto factoryMoto = new FactoryMoto();
        Moto moto = factoryMoto.crea(bMo);
        System.out.println(moto.toString());

        FactoryBarca factoryBarca = new FactoryBarca();
        Barca barca = factoryBarca.crea(bBa);
        System.out.println(barca.toString());
    }
}
