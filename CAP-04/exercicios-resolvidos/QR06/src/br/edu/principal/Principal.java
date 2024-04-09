package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num,r;
		System.out.println("Este programa verifica se um número é par ou ímpar.\nDigite um número: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		r = num % 2;
		if (r == 0) {
			System.out.println("O número é par.");
		}
		else {
			System.out.println("O número é impar.");
		}
		sc.close();
	}
}
