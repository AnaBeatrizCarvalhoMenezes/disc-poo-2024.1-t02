package br.edu.principal;

import java.util.Scanner;
import java.lang.Math;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, soma, raiz;
		int op;
		System.out.println("MENU \n1 - Somar dois n�meros \n2 - Ra�z quadrada de um n�mero \nDigite sua op��o:");
		op = sc.nextInt();
		switch (op) {
			case 1:
				System.out.println("Digite o primeiro n�mero:");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo n�mero:");
				num2 = sc.nextDouble();
				soma = num1 + num2;
				System.out.println("A soma dos n�meros " + num1 + " e " + num2 + " � " + soma);
				break;
			case 2:
				System.out.println("Digite um n�mero:");
				num1 = sc.nextDouble();
				raiz = Math.sqrt(num1);
				System.out.println("A raiz quadrada de " + num1 + " � " + raiz);
				break;
			default:
				System.out.println("Digite um valor v�lido.");
		}
			System.out.println("Fim do programa.");
			sc.close();
	}
}

