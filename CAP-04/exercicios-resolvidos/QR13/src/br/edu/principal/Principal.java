package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opDes, sal, imp, aum, novoSal = 0; 
		
		System.out.println("Qual seu salário");
		sal = sc.nextInt();
		
		System.out.println("Escolha uma das opções(1,2 ou 3)");
		System.out.println("1 - Cálculo de imposto");
		System.out.println("2 - Novo salário");
		System.out.println("3 - Classificação");
		
		System.out.println("Escolha uma das opções");
		opDes = sc.nextInt();
		
		if(opDes == 1) {
			if(sal < 500) {
				imp = sal * 5/100;
			}
			else if (sal >= 500 && sal <= 800) {
				imp = sal * 10/100;
			}
			else {
				imp = sal * 15/100;
			}
			System.out.println("O valor do imposto é de: " + imp);
		}
		
		else if (opDes == 2) {
			if (sal > 1500) {
				aum = 25;
			}
			else if (sal >= 750 && sal <= 1500) {
				aum = 50;
			}
			else if (sal < 750 && sal >= 450) {
				aum = 75;
			}
			else {
				aum = 100;
			}
			novoSal = aum + sal;
			System.out.println("O valor do novo salário é de: " + novoSal);
		}
		
		else if (opDes == 3) {
			if(sal <= 700) {
				System.out.println("Você é um funcionário mal remunerado");
			}
			else if (sal > 700) {
				System.out.println("Você é um funcionário bem remunerado");
			}
		}
		else {
			System.out.println("Opção inválida");
		}
		
		sc.close();
		
	}

}
