package br.com.fiap.autorecomenda.models;

import java.util.HashMap;
import java.util.Map;

public class CatalogoPecas {
    private Map<String, Double> pecas;

    // Construtor
    public CatalogoPecas() {
        this.pecas = new HashMap<>();
    }

    // Métodos
    public void adicionarPeca(String nome, double preco) {
        pecas.put(nome, preco);
    }

    public double buscarPrecoPeca(String nome) {
        return pecas.getOrDefault(nome, 0.0);
    }

    public Map<String, Double> getPecas() {
        return pecas;
    }
}
