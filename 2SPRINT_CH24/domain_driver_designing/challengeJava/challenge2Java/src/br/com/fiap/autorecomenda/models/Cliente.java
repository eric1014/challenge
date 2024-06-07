package br.com.fiap.autorecomenda.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private Veiculo veiculo;
    private List<OrdemDeServico> ordensDeServico;

    // Construtor
    public Cliente(String nome, String telefone, Veiculo veiculo) {
        this.nome = nome;
        this.telefone = telefone;
        this.veiculo = veiculo;
        this.ordensDeServico = new ArrayList<>();
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<OrdemDeServico> getOrdensDeServico() {
        return ordensDeServico;
    }

    public void adicionarOrdemDeServico(OrdemDeServico ordem) {
        this.ordensDeServico.add(ordem);
    }
}
