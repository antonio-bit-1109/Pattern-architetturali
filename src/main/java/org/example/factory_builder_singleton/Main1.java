package org.example.factory_builder_singleton;

import org.example.factory_builder_singleton.beans.BeanAquila;
import org.example.factory_builder_singleton.beans.BeanOrso;
import org.example.factory_builder_singleton.classi_astratte.factory_concreta.FactoryAquila;
import org.example.factory_builder_singleton.classi_astratte.factory_concreta.FactoryOrso;
import org.example.factory_builder_singleton.classi_concrete.Aquila;
import org.example.factory_builder_singleton.classi_concrete.Orso;
import org.example.factory_builder_singleton.webScraping.WebScraper;

public class Main1 {

    public static void main(String[] args) {

        // bean e popolamento dinamico dei bean tramite reflection e web scraping
        BeanOrso beanOrso = new BeanOrso();
        BeanAquila beanAquila = new BeanAquila();

        // popola bean tramite web scraping
        WebScraper<BeanOrso> beanOrsoWebScraper = new WebScraper<>();
        beanOrsoWebScraper.initializeMethod(beanOrso);
        System.out.println(beanOrso.toString());

        // popola bean tramite web scraping
        WebScraper<BeanAquila> beanAquilaWebScraper = new WebScraper<>();
        beanAquilaWebScraper.initializeMethod(beanAquila);
        System.out.println(beanAquila.toString());

        // creazione oggetti tramite factory
        FactoryAquila factoryAquila = new FactoryAquila();
        Aquila aquila = factoryAquila.crea(beanAquila);
        System.out.println("oggetto aquila" + aquila.toString());

        FactoryOrso factoryOrso = new FactoryOrso();
        Orso orso = factoryOrso.crea(beanOrso);
        System.out.println(orso.toString());
    }
}
