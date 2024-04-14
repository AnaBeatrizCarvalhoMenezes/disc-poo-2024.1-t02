package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, j, num, n, fat = 0; 
		
		System.out.println("Escreva um valor para n (Por favor escreva um número inteiro e positivo)");
		n = sc.nextInt();
		System.out.println("Escolha um número");
		num = sc.nextInt();
		
		for (i = 1; i < n; i++) {
			fat = 1;
			for(j = 1; j < num; j++) {
				fat = fat * j;
				System.out.println("Essa é a tabela dos números: " + fat );
			}
		}
		sc.close();
	}

}
