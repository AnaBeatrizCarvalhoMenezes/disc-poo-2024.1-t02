package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        // Variáveis para armazenar informações
        double valorQuilowatt = salarioMinimo / 8.0;
        double faturamentoGeral = 0.0;
        int quantidadeConsumidoresEntre500e1000 = 0;

        // Loop para entrada dos dados dos consumidores
        while (true) {
            System.out.print("Digite a quantidade de quilowatts consumida (ou 0 para sair): ");
            double quilowattsConsumidos = scanner.nextDouble();
            if (quilowattsConsumidos == 0) {
                break; // Encerra o loop se o usuário digitar 0
            }

            System.out.print("Digite o tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
            int tipoConsumidor = scanner.nextInt();

            // Cálculo do valor a ser pago por consumidor
            double valorConta = quilowattsConsumidos * valorQuilowatt;
            switch (tipoConsumidor) {
                case 1:
                    valorConta *= 1.05; // Acréscimo de 5% para residencial
                    break;
                case 2:
                    valorConta *= 1.10; // Acréscimo de 10% para comercial
                    break;
                case 3:
                    valorConta *= 1.15; // Acréscimo de 15% para industrial
                    break;
                default:
                    System.out.println("Tipo de consumidor inválido. Ignorando este consumidor.");
                    continue; // Pula para a próxima iteração do loop
            }

            // Atualiza o faturamento geral
            faturamentoGeral += valorConta;

            // Verifica se o valor está entre R$ 500,00 e R$ 1.000,00
            if (valorConta >= 500.0 && valorConta <= 1000.0) {
                quantidadeConsumidoresEntre500e1000++;
            }
        }

        // Exibe os resultados
        System.out.println("\nResultados:");
        System.out.printf("Valor de cada quilowatt: R$ %.2f%n", valorQuilowatt);
        System.out.printf("Faturamento geral da empresa: R$ %.2f%n", faturamentoGeral);
        System.out.printf("Quantidade de consumidores entre R$ 500,00 e R$ 1.000,00: %d%n", quantidadeConsumidoresEntre500e1000);

        scanner.close();
    }
}