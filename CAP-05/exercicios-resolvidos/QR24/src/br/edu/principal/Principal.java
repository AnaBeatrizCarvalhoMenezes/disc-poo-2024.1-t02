package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 0;

        do {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o salário do funcionário: R$ ");
                    salario = scanner.nextDouble();
                    calcularImposto(salario);
                    break;
                case 2:
                    System.out.print("Digite o salário do funcionário: R$ ");
                    salario = scanner.nextDouble();
                    calcularNovoSalario(salario);
                    break;
                case 3:
                    System.out.print("Digite o salário do funcionário: R$ ");
                    salario = scanner.nextDouble();
                    mostrarClassificacao(salario);
                    break;
                case 4:
                    System.out.println("Programa finalizado. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (salario != 0);

        scanner.close();
    }

    private static void calcularImposto(double salario) {
        if (salario < 500.0) {
            System.out.printf("Imposto: R$ %.2f%n", salario * 0.05);
        } else if (salario <= 850.0) {
            System.out.printf("Imposto: R$ %.2f%n", salario * 0.10);
        } else {
            System.out.printf("Imposto: R$ %.2f%n", salario * 0.15);
        }
    }

    private static void calcularNovoSalario(double salario) {
        if (salario > 1500.0) {
            System.out.printf("Novo salário: R$ %.2f%n", salario + 25.0);
        } else if (salario >= 750.0) {
            System.out.printf("Novo salário: R$ %.2f%n", salario + 50.0);
        } else if (salario >= 450.0) {
            System.out.printf("Novo salário: R$ %.2f%n", salario + 75.0);
        } else {
            System.out.printf("Novo salário: R$ %.2f%n", salario + 100.0);
        }
    }

    private static void mostrarClassificacao(double salario) {
        if (salario <= 700.0) {
            System.out.println("Classificação: Mal remunerado");
        } else {
            System.out.println("Classificação: Bem remunerado");
        }
    }
}