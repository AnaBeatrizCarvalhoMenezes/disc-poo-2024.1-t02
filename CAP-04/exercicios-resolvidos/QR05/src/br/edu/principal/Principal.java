package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa recebe três números obrigatoriamente em ordem crescente e um quarto número que não siga essa regra. Mostrando em seguida os quatro números em ordem decrescente.");
		System.out.print("Digite os três números, em ordem crescente, e dando espaçamento entre eles.(Por exemplo: 1 2 3): ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.print("Agora digite um número fora de ordem: ");
		int n4 = sc.nextInt();
		if(n4 > n3) {
			System.out.print("A ordem decrescente é: "+n4+"-"+n3+"-"+n2+"-"+n1);
		}
		if(n4 > n2 && n4 < n3) {
			System.out.print("A ordem decrescente é: "+n3+"-"+n4+"-"+n2+"-"+n1);
		}
		if(n4 > n1 && n4 < n2) {
			System.out.print("A ordem decrescente é: "+n3+"-"+n2+"-"+n4+"-"+n1);
		}
		if(n4 < n1) {
			System.out.print("A ordem decrescente é: "+n3+"-"+n2+"-"+n1+"-"+n4);
		}
	}

}
