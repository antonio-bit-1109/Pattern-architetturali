package org.example.factory_builder_singleton.webScraping;

import org.example.factory_builder_singleton.beans.Bean;
import org.example.factory_builder_singleton.beans.BeanOrso;
import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WebScraper<B extends Bean> {

    private Document doc;
    private final List<String> listaStringhe_Scraped = new ArrayList<>();

    // pipeline che gestisce il in che ordine devono essere chiamati i metodi --FACADE METHOD
    public void initializeMethod(B bean) {
        try {
            this.ConnectToPage();
            this.getData();
            this.FillBean(bean);
        } catch (RuntimeException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException("errore in fase di web scraping e popolamento del bean: " + e.getMessage());
        }
    }


    // connessione a pagina web ed estrapolazione di dati random tramite web scraping
    private void ConnectToPage() {
        try {
            //imposta un header basico per evitare il blocco dello scraping da parte del sito web. (funzionerà??)
            doc = Jsoup.connect("https://medium.com/@ritupd/web-scraping-countries-and-population-data-using-beautifulsoup-14f8b740c179")
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36")
                    .header("Accept-Language", "*")
                    .get();

        } catch (RuntimeException | IOException e) {
            throw new RuntimeException("impossibile connettersi alla pagina selezionata: " + e.getMessage());
        }
    }

    // prendo le stringhe estratte tramite web scraping e le inserisco in una lista
    private void getData() {
        try {
            Elements paragrafi = doc.select("p");

            for (Element p : paragrafi) {
                String small_string = splitString(p.toString());
                this.listaStringhe_Scraped.add(small_string);

            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    // metodo accessorio per creare tante piccole stringhe da inserire nella lista
    private String splitString(String stringone) {

        Random random = new Random();
        int n = random.nextInt(20);
        int start = stringone.indexOf("\"");

        final String pezzoStringa = stringone.substring(start, start + n);
        if (pezzoStringa.isEmpty()) {
            return "default";
        }

        return pezzoStringa;
    }

    //    uso la lista di parole per popolare il bean che viene passato al metodo
    private void FillBean(B bean) throws InvocationTargetException, IllegalAccessException {


        Method[] metodi = bean.getClass().getMethods();

        for (int i = 0; i < metodi.length; i++) {

            Method m = metodi[i];
            // in questo modo prendo tutti i potenziali parametri del metodo che sto ciclando
            if (m.getName().toLowerCase().startsWith("set")) {
                Class<?>[] parametriDelMetodo = m.getParameterTypes();
                Class<?> primoParametro = parametriDelMetodo[0];

                if (primoParametro.equals(String.class)) {
                    m.invoke(bean, this.listaStringhe_Scraped.get(i));
                    continue;
                }

                if (primoParametro.equals(float.class)) {
                    m.invoke(bean, 1f);
                    continue;
                }

                if (primoParametro.equals(int.class)) {
                    m.invoke(bean, 1);
                    continue;
                }

                if (primoParametro.equals(LocalDate.class)) {
                    m.invoke(bean, LocalDate.now());

                }

            } else {
                System.out.println("il metodo è un getter.");
            }
        }
        
    }

}
