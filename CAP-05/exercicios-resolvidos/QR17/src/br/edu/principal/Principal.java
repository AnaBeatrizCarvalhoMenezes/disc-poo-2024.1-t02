package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_carlos, sal_joao;
		System.out.println("Qual o salário de CARLOS?");
		sal_carlos = sc.nextDouble();
		sal_joao = sal_carlos / 3;
		double meses = 0;
		while (sal_joao < sal_carlos) {
			sal_carlos = sal_carlos + (sal_carlos * (0.01*2));
			sal_joao = sal_joao + (sal_joao * (0.01*5));
			meses = meses + 1;
		}
		System.out.println("O número de meses que João precisou trabalhar para alcançar carlos foi de: " + meses);
		System.out.printf("Salário de joão:  %.2f ", sal_joao);
	}

}
