package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double quad, cubo, raiz = 0;
		double num = 0;
		do {
			System.out.print("Digite um número maior que zero: ");
			num = sc.nextDouble();
			quad = Math.pow(num, 2);
			cubo = Math.pow(num, 3);
			raiz = Math.sqrt(num);
		} while (num <= 0);
		System.out.println("Seu número ao quadrado é: " + quad + ", ao cubo: " + cubo + " e a raiz dele: " + raiz);
		System.out.println("Seu número foi? digite ele de novo, por favor.");
		double num1 = sc.nextDouble();
		if (num == num1) {
			System.out.println("Certo, então é o mesmo, significa que eu acertei!");
		} else {
			System.out.println("ops, não foi esse número que foi digitado, use o código novamente para saber os resultados dele!");
		}
	}

}
