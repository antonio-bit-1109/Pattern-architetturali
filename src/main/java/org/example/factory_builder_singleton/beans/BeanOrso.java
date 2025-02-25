package org.example.factory_builder_singleton.beans;

public class BeanOrso extends BeanAnimaliCoda {

    private String nome;
    private String colorePelo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColorePelo() {
        return colorePelo;
    }

    public void setColorePelo(String colorePelo) {
        this.colorePelo = colorePelo;
    }


    @Override
    public String toString() {
        return "BeanOrso{" +
                "nome='" + this.nome + '\'' +
                ", colorePelo='" + this.colorePelo + '\'' +
                ", lunghezzaCoda=" + this.getLunghezzaCoda() +
                ", lunghezzaMuso=" + this.getLunghezzaMuso() +
                ", peso=" + this.getPeso() +
                ", famiglia='" + this.getFamiglia() + '\'' +
                '}';
    }
}
