package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double fim, i, j, x, expoente, numTermos, den, denominador, fat, s = 0;
		
		System.out.println("Qual o número de termos?");
		numTermos = sc.nextInt();
		System.out.println("Escreva um valor para x");
		x = sc.nextInt();
		s = 0;
		denominador = 1;
		
		for (i = 1; i< numTermos; i++) {
			fim = denominador;
			fat = 1;
			for(j = 1; j < fim; j++) {
				fat = fat * j;
			}
			
			expoente = i + 1;
			
			if (expoente%2 == 0) {
				s = s - Math.pow(x, expoente)/fat;
			}
			else {
				s = s + Math.pow(x, expoente)/fat;
			}
			
			if(denominador == 4) {
				den = -1;
			}
			else if(denominador == 1) {
				den = 1;
				if(den == 1) {
					denominador = denominador + 1;
				}
				else {
					denominador = denominador - 1;
				}
			}
	
		}
		System.out.println("S = " + s);
	}

}
