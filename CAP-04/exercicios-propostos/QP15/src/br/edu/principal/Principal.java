package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int tipoInv, valInv, rendiMen, numMes ,rendTotal, valCorrigido = 0;
		
		System.out.println("Quanto você quer investir?");
		valInv = sc.nextInt();		
		
		System.out.println("Por quantos meses você quer investir");
		numMes = sc.nextInt();
		
		System.out.println("Escolha entre 2 tipos de investimento (1 e 2)");
		System.out.println("1 - Poupança");
		System.out.println("2 - Fundos de renda fixa");
		
		System.out.println("Escolha uma das opções acima");
		tipoInv = sc.nextInt();
			
		if (tipoInv == 1) {
			rendiMen = valInv * 3/100;
			rendTotal = rendiMen * numMes;
			valCorrigido = rendTotal + valInv;
			System.out.println("O valor corrigido é: " + valCorrigido);
		}
		
		else if (tipoInv == 2) {
			rendiMen = valInv * 4/100;
			rendTotal = rendiMen * numMes;
			valCorrigido = rendTotal + valInv;
			System.out.println("O valor corrigido é: " + valCorrigido);
		}
		
		else {
			System.out.println("Opção inválida");
		}
		
		sc.close();
		
	}

}
