package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int cont, alRep = 0, alExa = 0, alApr = 0;
		float n1, n2, media, mediaClasse, totalClasse = 0;
		System.out.println("Este programa recebe duas notas de seis alunos, calcula suas medias e calcula a media da sala.");

		for (cont = 1; cont <= 6; cont++) {
			
			System.out.print("Aluno " + cont + ":\nDigite a nota da N1: ");
			n1 = sc.nextFloat();
			System.out.print("Digite a nota da N2: ");
			n2 = sc.nextFloat();
			media = (n1 + n2) / 2;
			System.out.println("A media do aluno foi: " + media);
			
			if (media <= 3) {
				alRep = alRep + 1;
				System.out.println("O aluno esta reprovado.");
			}
			if (media > 3 && media < 7) {
				alExa = alExa + 1;
				System.out.println("O aluno esta em exame.");
			}
			if (media >= 7) {
				alApr = alApr + 1;
				System.out.println("O aluno esta aprovado.");
			}
			totalClasse = totalClasse + media;
		}
		mediaClasse = totalClasse / 6;
		System.out.println("\nO numero de alunos reprovados foi: " + alRep);
		System.out.println("O numero de alunos em exame foi: " + alExa);
		System.out.println("O numero de alunos aprovados foi: " + alApr);
		System.out.println("A media da classe foi: " + mediaClasse);
		System.out.println("\nFim de programa.");
	}

}
