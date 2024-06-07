package br.com.fiap.blueoceanhub.controller;

import br.com.fiap.blueoceanhub.model.Plataforma;
import br.com.fiap.blueoceanhub.model.Sensor;

public class PlataformaController {
    private Plataforma plataforma;

    public PlataformaController(String nome, String descricao) {
        plataforma = new Plataforma(nome, descricao);
    }

    public void adicionarSensor(Sensor sensor) {
        plataforma.adicionarSensor(sensor);
    }

    public void removerSensor(int id) {
        plataforma.removerSensor(id);
    }

    public String gerarRelatorio() {
        return plataforma.gerarRelatorio();
    }
}
