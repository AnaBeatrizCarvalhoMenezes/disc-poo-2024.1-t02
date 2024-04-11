package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i, num, qtde;
		
		System.out.println("Digite o número: ");
		num = sc.nextDouble();
		qtde = 0;
		
		for (i = 1; i <= num; i++) {
			if (num%i == 0) {
				qtde = qtde+1;
			}			
		}
		if (qtde > 2) {
			System.out.println("O número " + num + " não é primo");
		} else {
			System.out.println("O número " + num + " é primo");
		}
		sc.close();
	}

}