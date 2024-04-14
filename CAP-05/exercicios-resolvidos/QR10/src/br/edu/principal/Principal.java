package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contTime, contJog, idade, qtde18;
		double peso, alt, mediaIdade, mediaAlt = 0, porc, tot80;
		qtde18 = 0; tot80 = 0;
		System.out.println("Este programa recebe dados de 11 jogadores de 5 times e calcula estatisticas com base neles.");
		
		for (contTime = 1; contTime <= 5; contTime++) {
			System.out.println("Time " + contTime);
			
			mediaIdade = 0;
			for (contJog = 1; contJog <= 11; contJog++) {
				System.out.println("Jogador " + contJog);
				System.out.print("Digite a idade do jogador: ");
				idade = sc.nextInt();
				System.out.print("Digite o peso do jogador: ");
				peso = sc.nextDouble();
				System.out.print("Digite a altura do jogador: ");
				alt = sc.nextDouble();
				
				if (idade < 18) {
					qtde18 = qtde18 + 1;
				}
				
				mediaIdade = mediaIdade + idade;
				mediaAlt = mediaAlt + alt;
				
				if (peso > 80) {
					tot80 = tot80 + 1;
				}
				
				
			}
			System.out.println("A media das idades dos jogadores deste time e: " + mediaIdade/11);
			
		}
		
		System.out.println("\nA quantidade total de jogadores com menos de 18 anos e: " + qtde18);
		mediaAlt = mediaAlt / 55;
		System.out.println("A media da altura de todos os jogadores e: " + mediaAlt);
		porc = tot80 * 100/55;
		System.out.println("A porcentagem de jogadores com mais de 80kg e: " + porc);
		System.out.print("\nFim de programa.");
	}

}
