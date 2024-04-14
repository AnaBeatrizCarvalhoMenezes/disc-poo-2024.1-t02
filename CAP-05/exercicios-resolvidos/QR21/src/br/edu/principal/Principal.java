package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int qtd = 0;
        int qtdPar = 0;
        int qtdImpar = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número (ou 30000 para encerrar): ");
            int numero = sc.nextInt();

            if (numero == 30000) {
                break;
            }

            soma += numero;
            qtd++;

            if (numero % 2 == 0) {
                qtdPar++;
            } else {
                qtdImpar++;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        double media = (double) soma / qtd;
        double mediaPar = (double) soma / qtdPar;
        double percImpar = (double) qtdImpar / qtd * 100;

        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Quantidade de números digitados: " + qtd);
        System.out.println("Média dos números digitados: " + media);
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);
        System.out.println("Média dos números pares: " + mediaPar);
        System.out.println("Porcentagem dos números ímpares: " + percImpar + "%");
    }
}