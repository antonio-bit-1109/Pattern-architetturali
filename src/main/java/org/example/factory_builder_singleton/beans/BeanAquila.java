package org.example.factory_builder_singleton.beans;

import java.time.LocalDate;

public class BeanAquila extends BeanAnimaliAli {

    private String nome;
    private String colorePrincipale;
    private LocalDate dataNascita;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getColorePrincipale() {
        return colorePrincipale;
    }

    public void setColorePrincipale(String colorePrincipale) {
        this.colorePrincipale = colorePrincipale;
    }

    @Override
    public String toString() {
        return "BeanAquila{" +
                "nome='" + nome + '\'' +
                ", colorePrincipale='" + colorePrincipale + '\'' +
                ", dataNascita=" + dataNascita +
                ", lunghezzaAli=" + getLunghezzaAli() +
                ", peso=" + getPeso() +
                ", famiglia='" + getFamiglia() + '\'' +
                '}';
    }
}
