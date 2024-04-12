package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod=0, num_h=0, sal_b=0, sal_l=0, media_m=0, media_f=0, cont_m=0, cont_f=0;
		String sexo;
		System.out.println("Este código calcula e emite uma listagem contendo o código, o salário bruto e o salário líquido de todos os professores."
				+ "\nMostrando também a média dos salários líquidos dos professores do sexo masculino e a média"
				+ "\ndos salários líquidos das professoras do sexo feminino.");
		System.out.println("\nDigite o código do professor(a): ");
		cod = sc.nextInt();
		cont_m = 0;
		cont_f = 0;

		while(cod != 99999) {
			System.out.println("Qual o sexo do professor? (OBS = M - Masculino/F - Feminino)");
			sexo = sc.next().toUpperCase();
			
			System.out.println("E qual o número de horas trabalhadas por você?");
			num_h = sc.nextInt();
			
			sal_b = num_h * 30;
			
			if (sexo.equals("M")) {
				sal_l = sal_b - (sal_b * 10/100);
				media_m = media_m + sal_l;
				cont_m = cont_m + 1;
			} if (sexo.equals("F")) {
				sal_l = sal_b - (sal_b * 5/100);
				media_f = media_f + sal_l;
				cont_f = cont_f + 1;
			}
			
			System.out.println("O professor de código " + cod + " possui:");
			System.out.println("Um salário bruto de R$" + sal_b + ",00");
			System.out.println("E o salário líquido de R$" + sal_l + ",00");
			System.out.println("\nQual próximo código? (Digite 99999 para encerrar o programa).");
			cod = sc.nextInt();
		} if  (cont_m == 0) {
		     System.out.println("Nenhum professor do sexo masculino");
		} else {
			System.out.println("Existem em média " + cont_m + " professores do sexo masculino");
		} if (cont_f == 0) {
			System.out.println("Nenhuma professora do sexo feminino");
		} else {
			System.out.println("Existem em média " + cont_f + " professoras do sexo feminino");
		}
	}

}
