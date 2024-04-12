package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area = 0;
		double base = 0;
		 do {
			System.out.println("Qual o tamanho da base do triângulo?(digitar número maior que 0)");
			base = sc.nextDouble();
		 } while (base <= 0);
		 double altura = 0;
		 do {
				System.out.println("E qual a altura?(de novo, digite um número maior que 0)");
				altura = sc.nextDouble();
			 } while (altura <= 0);
		 area = (base*altura) * 0.5;
		 System.out.println("A área do seu triângulo é de: " + area);
	} 

}
