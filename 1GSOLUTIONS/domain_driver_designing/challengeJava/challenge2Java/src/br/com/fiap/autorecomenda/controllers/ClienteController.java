package br.com.fiap.autorecomenda.controllers;

import br.com.fiap.autorecomenda.models.Cliente;
import br.com.fiap.autorecomenda.models.OrdemDeServico;

public class ClienteController {
    private Cliente cliente;

    // Construtor
    public ClienteController(Cliente cliente) {
        this.cliente = cliente;
    }

    // Métodos
    public void adicionarOrdemDeServico(OrdemDeServico ordem) {
        cliente.adicionarOrdemDeServico(ordem);
    }

    public void listarOrdensDeServico() {
        for (OrdemDeServico ordem : cliente.getOrdensDeServico()) {
            System.out.println(ordem.getDescricaoProblema() + " - " + ordem.getCustoTotal());
        }
    }
}
