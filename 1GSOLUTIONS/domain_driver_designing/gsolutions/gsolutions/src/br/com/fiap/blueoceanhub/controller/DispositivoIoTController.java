package br.com.fiap.blueoceanhub.controller;

import br.com.fiap.blueoceanhub.model.DispositivoIoT;

public class DispositivoIoTController {
    public void criarDispositivoIoT(int id, String status) {
        DispositivoIoT dispositivo = new DispositivoIoT(id, status);
        // Lógica adicional para manipular o dispositivo IoT
    }
}
