package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num,r;
		System.out.println("Este programa verifica se um n�mero � par ou �mpar.\nDigite um n�mero: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		r = num % 2;
		if (r == 0) {
			System.out.println("O n�mero � par.");
		}
		else {
			System.out.println("O n�mero � impar.");
		}
		sc.close();
	}
}
