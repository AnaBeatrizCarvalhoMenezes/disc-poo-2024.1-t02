package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double percentual,sal,anoAtual,novoSal,i = 0;
		
		System.out.println("Em que ano estamos?");
		anoAtual = sc.nextInt();
		
		sal = 1000;
		percentual = 1.5/100;	
		novoSal = sal + (percentual * sal);
		
		for (i = 2007; i <= anoAtual; i++) {
			percentual = 2 * percentual;
			novoSal = novoSal + (percentual * novoSal);
		}
		
		System.out.println("Seu novo salário é: " + novoSal);
		
		sc.close();

	}	

}
