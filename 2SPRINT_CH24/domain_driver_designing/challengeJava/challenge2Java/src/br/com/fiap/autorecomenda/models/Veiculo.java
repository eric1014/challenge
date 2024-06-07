package br.com.fiap.autorecomenda.models;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private Cliente cliente;
    private List<OrdemDeServico> ordensDeServico;

    // Construtor
    public Veiculo(String marca, String modelo, String placa, Cliente cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cliente = cliente;
        this.ordensDeServico = new ArrayList<>();
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<OrdemDeServico> getOrdensDeServico() {
        return ordensDeServico;
    }

    public void adicionarOrdemDeServico(OrdemDeServico ordem) {
        this.ordensDeServico.add(ordem);
    }
}
