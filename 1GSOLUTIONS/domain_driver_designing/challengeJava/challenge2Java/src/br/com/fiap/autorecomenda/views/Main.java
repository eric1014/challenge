package br.com.fiap.autorecomenda.views;

import br.com.fiap.autorecomenda.models.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do catálogo de peças
        CatalogoPecas catalogoPecas = new CatalogoPecas();
        catalogoPecas.adicionarPeca("Filtro de Óleo", 50.0);
        catalogoPecas.adicionarPeca("Pneu", 300.0);
        catalogoPecas.adicionarPeca("Velas de Ignição", 40.0);
        catalogoPecas.adicionarPeca("Óleo do Motor", 150.0);

        CalculadoraOrcamento calculadora = new CalculadoraOrcamento(catalogoPecas);

        // Interação com o usuário
        System.out.println("Bem-vindo ao AutoRecomenda!");

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telefoneCliente = scanner.nextLine();

        System.out.print("Digite a marca do veículo: ");
        String marcaVeiculo = scanner.nextLine();

        System.out.print("Digite o modelo do veículo: ");
        String modeloVeiculo = scanner.nextLine();

        System.out.print("Digite a placa do veículo: ");
        String placaVeiculo = scanner.nextLine();

        Veiculo veiculo = new Veiculo(marcaVeiculo, modeloVeiculo, placaVeiculo, null);
        Cliente cliente = new Cliente(nomeCliente, telefoneCliente, veiculo);
        veiculo.setCliente(cliente);

        System.out.print("Digite a descrição do problema: ");
        String descricaoProblema = scanner.nextLine();

        System.out.print("Digite as peças necessárias (separadas por vírgula): ");
        String pecasNecessariasInput = scanner.nextLine();
        List<String> pecasNecessarias = Arrays.asList(pecasNecessariasInput.split(",\\s*"));

        OrdemDeServico ordem = new OrdemDeServico(descricaoProblema, cliente, null);
        for (String peca : pecasNecessarias) {
            double preco = catalogoPecas.buscarPrecoPeca(peca);
            ordem.adicionarPeca(new Peca(peca, preco));
        }

        cliente.adicionarOrdemDeServico(ordem);

        System.out.print("Digite o nome da oficina: ");
        String nomeOficina = scanner.nextLine();

        System.out.print("Digite o endereço da oficina: ");
        String enderecoOficina = scanner.nextLine();

        Mecanica mecanica = new Mecanica(nomeOficina, enderecoOficina);
        ordem.setMecanica(mecanica);
        mecanica.adicionarOrdemDeServico(ordem);

        CentralRedirecionamento central = new CentralRedirecionamento();
        central.adicionarOficina(mecanica);

        // Execução de funcionalidades
        double orcamento = calculadora.calcularOrcamento(pecasNecessarias);
        System.out.println("Orçamento para troca de peças: " + orcamento);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Veículo: " + cliente.getVeiculo().getMarca() + " " + cliente.getVeiculo().getModelo());

        System.out.println("Ordem de Serviço: " + ordem.getDescricaoProblema());
        System.out.println("Custo Total: " + ordem.getCustoTotal());

        System.out.println("Oficinas Confiáveis:");
        for (Mecanica oficina : central.buscarOficinas()) {
            System.out.println("- " + oficina.getNome() + ", " + oficina.getEndereco());
        }

        scanner.close();
    }
}
