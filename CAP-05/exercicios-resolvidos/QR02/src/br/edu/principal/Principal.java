package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,e,i,j,fat = 0;
		
		e = 1;
		
		System.out.println("Qual valor você deseja para n (Por favor escreva um número inteiro e positivo!)");
		n = sc.nextInt();
		
		for(i = 1; i < n; i++) {
			fat = 1;
			for(j = 1; j < i; j++) {
				fat = fat * j;
				e = e + 1/fat;
			}
		}
		System.out.println("O resultado é: " + e);
		
		
		sc.close();		
		
		
	}

}
