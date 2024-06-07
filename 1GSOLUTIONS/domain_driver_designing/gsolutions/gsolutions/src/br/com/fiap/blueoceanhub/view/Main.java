package br.com.fiap.blueoceanhub.view;

import java.util.Scanner;
import br.com.fiap.blueoceanhub.controller.SensorController;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SensorController sensorController = new SensorController();

        System.out.println("Informe o ID do sensor:");
        int idSensor = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha

        System.out.println("Informe o tipo do sensor:");
        String tipoSensor = scanner.nextLine();

        sensorController.criarSensor(idSensor, tipoSensor, "Localizacao1");

        System.out.println("Sensor criado com sucesso!");

        scanner.close();
    }
}
