package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, media, nexame = 0;
		System.out.println("este programa recebe três notas, calcula e mostra a média aritmética delas. Também diz se você foi aprovado; se irá precisar fazer um exame; ou se está reprovado.");
		System.out.println("Lembre-se que a média exigida é 6.");
		System.out.print("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3 = sc.nextDouble();
		media = (n1 + n2 + n3) / 3;
		System.out.println("A sua média foi de: "+media);
		if(media >= 0 && media < 3)
			System.out.println("Você está reprovado.");
		if(media > 7)
			System.out.println("Você está aprovado!");
		if(media >= 3 && media < 7) {
			System.out.println("Você precisará fazer um exame para recuperar sua nota.");
			nexame = 12 - media;
			System.out.println("Você deverá tirar "+nexame+" para ser aprovado.");
		}
	}
}
