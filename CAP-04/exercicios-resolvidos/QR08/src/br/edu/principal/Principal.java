package br.edu.principal;

import java.util.Scanner;
import java.lang.Math;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, soma, raiz;
		int op;
		System.out.println("MENU \n1 - Somar dois números \n2 - Raíz quadrada de um número \nDigite sua opção:");
		op = sc.nextInt();
		switch (op) {
			case 1:
				System.out.println("Digite o primeiro número:");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo número:");
				num2 = sc.nextDouble();
				soma = num1 + num2;
				System.out.println("A soma dos números " + num1 + " e " + num2 + " é " + soma);
				break;
			case 2:
				System.out.println("Digite um número:");
				num1 = sc.nextDouble();
				raiz = Math.sqrt(num1);
				System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
				break;
			default:
				System.out.println("Digite um valor válido.");
		}
			System.out.println("Fim do programa.");
			sc.close();
	}
}

