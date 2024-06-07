package br.com.fiap.autorecomenda.controllers;

import br.com.fiap.autorecomenda.models.OrdemDeServico;
import br.com.fiap.autorecomenda.models.Peca;

public class OrdemServicoController {
    private OrdemDeServico ordemDeServico;

    // Construtor
    public OrdemServicoController(OrdemDeServico ordemDeServico) {
        this.ordemDeServico = ordemDeServico;
    }

    // Métodos
    public void adicionarPeca(Peca peca) {
        ordemDeServico.adicionarPeca(peca);
    }

    public void listarPecas() {
        for (Peca peca : ordemDeServico.getPecas()) {
            System.out.println(peca.getNome() + " - " + peca.getPreco());
        }
    }
}
