package br.com.fiap.autorecomenda.models;

import java.util.ArrayList;
import java.util.List;

public class CentralRedirecionamento {
    private List<Mecanica> oficinasConfiaveis;

    // Construtor
    public CentralRedirecionamento() {
        this.oficinasConfiaveis = new ArrayList<>();
    }

    // Métodos
    public void adicionarOficina(Mecanica mecanica) {
        oficinasConfiaveis.add(mecanica);
    }

    public void removerOficina(Mecanica mecanica) {
        oficinasConfiaveis.remove(mecanica);
    }

    public List<Mecanica> buscarOficinas() {
        return oficinasConfiaveis;
    }
}
