package br.com.fiap.blueoceanhub.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Plataforma {
    private String nome;
    private String descricao;
    private Date dataLancamento;
    private List<Sensor> sensores;

    public Plataforma(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataLancamento = new Date();
        this.sensores = new ArrayList<>();
    }

    public void adicionarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public void removerSensor(int id) {
        sensores.removeIf(sensor -> sensor.getId() == id);
    }

    public String gerarRelatorio() {
        // Lógica para gerar relatório
        return "Relatório gerado";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }
}
