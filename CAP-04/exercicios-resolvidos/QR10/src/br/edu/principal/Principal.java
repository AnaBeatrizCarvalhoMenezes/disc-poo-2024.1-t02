package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Este programa calcula a data cronologicamente entre duas fornecidas.");
		int d1, m1, a1, d2, m2, a2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira data:\nDia (dd): ");
		d1 = sc.nextInt();
		System.out.print("Mês (mm): ");
		m1 = sc.nextInt();
		System.out.println("Ano (aaaa): ");
		a1 = sc.nextInt();
		System.out.print("Digite a segunda data:\nDia (dd): ");
		d2 = sc.nextInt();
		System.out.print("Mês (mm): ");
		m2 = sc.nextInt();
		System.out.println("Ano (aaaa): ");
		a2 = sc.nextInt();
		if (a1>a2) {
			System.out.println("A maior data é: " + d1 + "/" + m1 + "/" + a1);
		}
		else if (a2>a1) {
			System.out.println("A maior data é: " + d2 + "/" + m2 + "/" + a2);
		}
		else if(m1>m2) {
			System.out.println("A maior data é: " + d1 + "/" + m1 + "/" + a1);
		}
		else if(m2>m1) {
			System.out.println("A maior data é: " + d2 + "/" + m2 + "/" + a2);
		}
		else if(d1>d2) {
			System.out.println("A maior data é: " + d1 + "/" + m1 + "/" + a1);
		}
		else if(d2>d1) {
			System.out.println("A maior data é: " + d2 + "/" + m2 + "/" + a2);
		}
		else {
			System.out.println("As datas são iguais!");
		}
		System.out.println("Fim do programa.");
		sc.close();
	}

}
