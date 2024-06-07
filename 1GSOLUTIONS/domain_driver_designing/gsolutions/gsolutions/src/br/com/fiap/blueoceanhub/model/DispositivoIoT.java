package br.com.fiap.blueoceanhub.model;

import java.util.Date;

public class DispositivoIoT {
    private int id;
    private String status;
    private Date ultimaManutencao;

    public DispositivoIoT(int id, String status) {
        this.id = id;
        this.status = status;
        this.ultimaManutencao = new Date();
    }

    public void ativar() {
        // Lógica para ativar dispositivo
    }

    public void desativar() {
        // Lógica para desativar dispositivo
    }

    public void realizarManutencao() {
        // Lógica para realizar manutenção
    }

    public void realizarManutencao(Date data) {
        // Lógica para realizar manutenção na data especificada
        this.ultimaManutencao = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUltimaManutencao() {
        return ultimaManutencao;
    }

    public void setUltimaManutencao(Date ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }
}
