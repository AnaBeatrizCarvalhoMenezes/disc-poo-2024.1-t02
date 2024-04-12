package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		n1 = sc.nextDouble();
		System.out.print("\n Digite outro: ");
		n2 = sc.nextDouble();
		if (n1 > n2) {
			System.out.print(n1 +" é maior que " + n2);
		} else {
			System.out.print(n2 +" é maior que " + n1);
		}
	}

}
