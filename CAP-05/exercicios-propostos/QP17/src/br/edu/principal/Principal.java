package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int canal = 0, pessoas = 0, pessoasTot = 0, pes4 = 0, pes5 = 0, pes7 = 0, pes12 = 0;
		boolean ligado = false;
		
		System.out.println("Este programa recebe dados sobre o canal de tv que esta sendo assistido e o numero de pessoas que o estao assistindo.");

		do {
			
			System.out.println("Quantas pessoas estao assistindo televisao? ");
			pessoas = sc.nextInt();
			
			System.out.println("A televisao esta ligada? ('false' para nao (nao sera contabilizado), 'true' para sim) ");
			ligado = sc.nextBoolean();
			if (ligado == false) {
				pessoas = 0;
			}
			pessoasTot = pessoasTot + pessoas;
			
			System.out.println("Qual canal esta sendo assistido? (4, 5, 7 ou 12; 0 terminar a pesquisa.");
			canal = sc.nextInt();
			switch (canal){
				case 4:
					pes4 = pes4 + pessoas;
					break;
				case 5:
					pes5 = pes5 + pessoas;
					break;
				case 7: 
					pes7 = pes7 + pessoas;
					break;
				case 12:
					pes12 = pes12 + pessoas;
					break;
				case 0:
					canal = 0;
					pessoasTot = pessoasTot - pessoas;
					break;
				default:
					break;
			}
			
			System.out.println("Proxima casa...");
		}while (canal != 0);
		
		System.out.println("Estatisticas:");
		System.out.println("\nA porcentagem de pessoas assistindo o canal 4 e: " + pes4*(100/pessoasTot) + "%");
		System.out.println("A porcentagem de pessoas assistindo o canal 5 e: " + pes5*(100/pessoasTot) + "%");
		System.out.println("A porcentagem de pessoas assistindo o canal 7 e: " + pes7*(100/pessoasTot) + "%");
		System.out.println("A porcentagem de pessoas assistindo o canal 12 e: " + pes12*(100/pessoasTot) + "%");
		System.out.println("\nFim de programa.");
		sc.close();
		
	}
	

}
