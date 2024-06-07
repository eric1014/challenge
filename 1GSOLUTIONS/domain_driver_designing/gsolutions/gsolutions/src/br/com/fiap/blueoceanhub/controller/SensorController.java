package br.com.fiap.blueoceanhub.controller;

import br.com.fiap.blueoceanhub.model.Sensor;

public class SensorController {
    public void criarSensor(int id, String tipo, String localizacao) {
        Sensor sensor = new Sensor(id, tipo, localizacao);
        // Lógica adicional para manipular o sensor
    }
}
