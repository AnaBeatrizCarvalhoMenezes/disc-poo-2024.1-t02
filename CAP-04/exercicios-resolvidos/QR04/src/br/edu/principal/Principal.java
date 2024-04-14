package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        // Encontra o menor, o do meio e o maior
        double menor = Math.min(Math.min(num1, num2), num3);
        double maior = Math.max(Math.max(num1, num2), num3);
        double meio = num1 + num2 + num3 - menor - maior;

        System.out.println("\nNúmeros em ordem crescente:");
        System.out.println(menor + ", " + meio + ", " + maior);

        scanner.close();
    }
}