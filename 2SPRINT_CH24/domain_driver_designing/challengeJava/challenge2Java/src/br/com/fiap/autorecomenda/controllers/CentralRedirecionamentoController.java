package br.com.fiap.autorecomenda.controllers;

import br.com.fiap.autorecomenda.models.CentralRedirecionamento;
import br.com.fiap.autorecomenda.models.Mecanica;

public class CentralRedirecionamentoController {
    private CentralRedirecionamento centralRedirecionamento;

    // Construtor
    public CentralRedirecionamentoController(CentralRedirecionamento centralRedirecionamento) {
        this.centralRedirecionamento = centralRedirecionamento;
    }

    // Métodos
    public void adicionarOficina(Mecanica mecanica) {
        centralRedirecionamento.adicionarOficina(mecanica);
    }

    public void removerOficina(Mecanica mecanica) {
        centralRedirecionamento.removerOficina(mecanica);
    }

    public void listarOficinas() {
        for (Mecanica oficina : centralRedirecionamento.buscarOficinas()) {
            System.out.println(oficina.getNome() + ", " + oficina.getEndereco());
        }
    }
}
