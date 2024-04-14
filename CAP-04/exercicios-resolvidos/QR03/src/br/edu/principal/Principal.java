package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("este programa recebe dois números e mostre o maior, além de dizer se são iguais");
		System.out.print("digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.print("digite o segundo número: ");
		int n2 = sc.nextInt();
		if(n1 < n2){
			System.out.print("O primeiro número é menor que o segundo.");
		}
		if(n1 > n2){
			System.out.print("O primeiro número é maior que o segundo.");
		}
		if(n1 == n2){
			System.out.print("O primeiro número é igual ao segundo.");
		}
	}

}
