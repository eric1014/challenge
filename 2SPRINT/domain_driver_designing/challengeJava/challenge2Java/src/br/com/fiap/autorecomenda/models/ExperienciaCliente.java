package br.com.fiap.autorecomenda.models;

public class ExperienciaCliente {
    private Mecanica mecanica;
    private int avaliacao;

    // Construtor
    public ExperienciaCliente(Mecanica mecanica, int avaliacao) {
        this.mecanica = mecanica;
        this.avaliacao = avaliacao;
    }

    // Getters e setters
    public Mecanica getMecanica() {
        return mecanica;
    }

    public void setMecanica(Mecanica mecanica) {
        this.mecanica = mecanica;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}
