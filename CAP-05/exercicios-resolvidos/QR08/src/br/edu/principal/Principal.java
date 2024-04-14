package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, numTermos, num1, num2, num3;
		
		System.out.println("Este programa mostra termos de acordo com uma serie de numeros especifica. \nQual sera o numero de termos? (-1)");
		numTermos = sc.nextInt();
		num1 = 2; num2 = 7; num3 = 3;
		System.out.print(num1 + " - " + num2 + " - " + num3);
		
		i = 4;
		while (i != numTermos) {
			
			num1 = num1 * 2;
			System.out.print(" - " + num1);
			i++;
			if (i != numTermos) {
				num2 = num2 * 3;
				System.out.print(" - " + num2);
				i++;
			}
				if (i != numTermos) {
					num3 = num3 * 4;
					System.out.print(" - " + num3);
					i++;
				}
			
		}
		System.out.print("\nFim de programa.");
		sc.close();
		
	}

}