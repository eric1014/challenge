package br.com.fiap.blueoceanhub.model;

import java.util.List;

public class Sensor {
    private int id;
    private String tipo;
    private String localizacao;
    private List<String> dadosColetados;

    public Sensor(int id, String tipo, String localizacao) {
        this.id = id;
        this.tipo = tipo;
        this.localizacao = localizacao;
    }

    public void coletarDados() {
        // Lógica para coletar dados
    }

    public void enviarDados() {
        // Lógica para enviar dados
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<String> getDadosColetados() {
        return dadosColetados;
    }

    public void setDadosColetados(List<String> dadosColetados) {
        this.dadosColetados = dadosColetados;
    }
}
