package challenge;

import java.util.ArrayList;
import java.util.List;

class OrdemDeServico {
    private String descricaoProblema;
    private boolean concluida;
    private Cliente cliente;
    private Mecanica mecanica;
    private List<Peca> pecas;
    private double custoTotal;

    // Construtor
    public OrdemDeServico(String descricaoProblema, Cliente cliente, Mecanica mecanica) {
        this.descricaoProblema = descricaoProblema;
        this.cliente = cliente;
        this.mecanica = mecanica;
        this.concluida = false;
        this.pecas = new ArrayList<>();
        this.custoTotal = 0.0;
    }

    // Getters e setters
    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mecanica getMecanica() {
        return mecanica;
    }

    public void setMecanica(Mecanica mecanica) {
        this.mecanica = mecanica;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void adicionarPeca(Peca peca) {
        this.pecas.add(peca);
        this.custoTotal += peca.getPreco();
    }

    public double getCustoTotal() {
        return custoTotal;
    }
}