package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota_trab, aval_sem, exame, media = 0;
		System.out.println("este é um programa que recebe três notas, calcula e mostra a média ponderada. Além disso avalia seu desempenho.");
		System.out.print("Digite a nota do trabalho de laboratório: ");
		nota_trab = sc.nextDouble();
		System.out.print("Digite a nota da avaliação semestral: ");
		aval_sem = sc.nextDouble();
		System.out.print("Digite a nota do exame final: ");
		exame = sc.nextDouble();
		media = (nota_trab * 2 + aval_sem * 3 + exame * 5) / 10;
		System.out.println("A sua nota final é: "+media);
		if (media >= 8 && media <= 10)
			System.out.println("E seu desempenho foi: A. Parabéns! Ótimo desempenho!");
		if (media >= 7 && media < 8)
			System.out.println("E seu desempenho foi: B. Muito bem! Foi um bom desempenho!");
		if (media >= 6 && media < 7)
			System.out.println("E seu desempenho foi: C. Boa! Só estude um pouco mais da próxima vez.");
		if (media >= 5 && media < 6)
			System.out.println("E seu desempenho foi: D. Essa foi por pouco! Preste mais atenção e estude mais.");
		if (media < 5)
			System.out.println("E seu desempenho foi: E. Da próxima vez se esforce mais.");
	}

}
