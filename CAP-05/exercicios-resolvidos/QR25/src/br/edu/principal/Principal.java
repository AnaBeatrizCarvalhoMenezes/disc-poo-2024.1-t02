package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalImpostos = 0.0;
        double totalFaturamento = 0.0;

        while (true) {
            System.out.print("Digite o preço unitário do produto (ou zero para sair): R$ ");
            double precoUnitario = scanner.nextDouble();
            if (precoUnitario <= 0.0) {
                break; // Encerra o loop se o preço for inválido
            }

            System.out.print("Digite o país de origem (1 - EUA, 2 - México, 3 - outros): ");
            int paisOrigem = scanner.nextInt();

            System.out.print("Digite o meio de transporte (T - terrestre, F - fluvial, A - aéreo): ");
            char meioTransporte = scanner.next().charAt(0);

            System.out.print("Carga perigosa (S - sim, N - não): ");
            char cargaPerigosa = scanner.next().charAt(0);

            // Cálculo do imposto
            double imposto;
            if (precoUnitario <= 100.0) {
                imposto = precoUnitario * 0.05;
            } else {
                imposto = precoUnitario * 0.10;
            }
            totalImpostos += imposto;

            // Cálculo do valor do transporte
            double valorTransporte;
            if (cargaPerigosa == 'S') {
                switch (paisOrigem) {
                    case 1:
                        valorTransporte = 50.0;
                        break;
                    case 2:
                        valorTransporte = 21.0;
                        break;
                    case 3:
                        valorTransporte = 24.0;
                        break;
                    default:
                        valorTransporte = 0.0;
                }
            } else {
                switch (paisOrigem) {
                    case 1:
                        valorTransporte = 12.0;
                        break;
                    case 2:
                        valorTransporte = 21.0;
                        break;
                    case 3:
                        valorTransporte = 60.0;
                        break;
                    default:
                        valorTransporte = 0.0;
                }
            }
            totalFaturamento += valorTransporte;

            // Cálculo do valor do seguro
            double valorSeguro = (paisOrigem == 2 || meioTransporte == 'A') ? precoUnitario / 2.0 : 0.0;

            // Cálculo do preço final
            double precoFinal = precoUnitario + imposto + valorTransporte + valorSeguro;

            // Exibe os resultados
            System.out.println("\nResultados para o produto:");
            System.out.printf("Imposto: R$ %.2f%n", imposto);
            System.out.printf("Valor do transporte: R$ %.2f%n", valorTransporte);
            System.out.printf("Valor do seguro: R$ %.2f%n", valorSeguro);
            System.out.printf("Preço final: R$ %.2f%n", precoFinal);
        }

        // Exibe o total dos impostos
        System.out.printf("\nTotal dos impostos: R$ %.2f%n", totalImpostos);

        scanner.close();
    }
}