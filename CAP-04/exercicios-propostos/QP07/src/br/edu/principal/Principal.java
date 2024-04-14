package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este código dá um aumento ao seu salário se ele for menor ou igual a: 500R$.");
		System.out.print("Qual o valor do seu salário? Digite aqui: ");
		double sal = sc.nextDouble();
		if(sal <= 500.00) {
			double novsal = sal*3/10 + sal;
			System.out.println("Parabéns! Seu salário agora é de: "+novsal);
		}
		else {
			System.out.println("Desculpe, você não terá direito a aumento de salário.");
		}
	}

}