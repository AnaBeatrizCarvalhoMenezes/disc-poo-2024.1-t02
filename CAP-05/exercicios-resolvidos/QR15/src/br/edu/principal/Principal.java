package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i, preco, custo_est = 0, imp, preco_final = 0, adicional, maior_p = 0, menor_p = 0, tot_imp, qtd_b, qtd_n, qtd_c;
		String categ, refri;
		
		adicional = 0;
		tot_imp = 0;
		qtd_b = 0;
		qtd_n = 0;
		qtd_c = 0;

		for (i=1; i<=12; i++) {
			System.out.println("Qual é o preço dele?");
			preco = sc.nextDouble();
			
			System.out.println("O produto precisa de refrigeração? (OBS: S - Sim e N - não)");
			refri = sc.next().toUpperCase();
			
			System.out.println("Qual o tipo do produto? (Digite A - Alimentação; L - Limpeza; Vestuário - V)");
			categ = sc.next().toUpperCase();
			
			if (preco <= 20) {
				if (categ.equals("A")) {
					custo_est = 2;
				} else if (categ.equals("L")) {
					custo_est = 3;
				} else if (categ.equals("V")) {
					custo_est = 4;
				}
			}
			
			if (preco > 20 && preco <= 50) {
				if (refri.equals("S")) {
					custo_est = 6;
				} else {
					custo_est = 0;
				}
			}
			if (preco > 50) {
				if (refri.equals("S")) {
					if (categ.equals("A")) {
						custo_est = 5;
					} else if (categ.equals("L")) {
						custo_est = 2;
					} else if (categ.equals("V")) {
						custo_est = 4;
					}
				} else {
					if (categ.equals("A") || categ.equals("V")) {
						custo_est = 0;
					} else if (categ.equals("L")) {
						custo_est = 1;
					}
				}
			}
			if (!categ.equals("A") || !categ.equals("S")) {
				imp = preco * 0.02;
			} else {
				imp = preco * 0.04;
			}
			preco_final = preco+custo_est+imp;
			System.out.println("\nO custo do estoque do seu produto é: " + custo_est);
			System.out.println("\nO custo do imposto do seu produto é: " + imp);
			System.out.println("\nO preço final do seu produto é: " + preco_final);
			
			if (preco_final <= 20) {
				qtd_b = qtd_b + 1;
				System.out.println("\nClassificação Barato");
			} else if (preco_final > 20 && preco_final <= 100) {
				qtd_n = qtd_n + 1;
				System.out.println("\nClassificação Normal");
			} else if (preco_final > 100) {
				qtd_c = qtd_c + 1;
				System.out.println("\nClassificação Caro");
			}
			adicional = adicional + custo_est + imp;
			tot_imp = tot_imp = imp;
			
			if (i==1) {
				maior_p = preco_final;
				menor_p = preco_final;
			} else {
				if (preco_final > maior_p) {
					maior_p = preco_final;
				} else if (preco_final < menor_p) {
					menor_p = preco_final;
				}
			}
		}
		adicional = adicional / 12;
		System.out.println("\nO adicional será: " + adicional);
		System.out.println("\nO maior preço é: " + maior_p);
		System.out.println("\nO menor preço é: " + menor_p);
		System.out.println("\nO total de imposto é: " + tot_imp);
		System.out.println("\nA quantidade de baratos é: " + qtd_b);
		System.out.println("\nA quantidade de normais é: " + qtd_n);
		System.out.println("\nA quantidade de caros é: " + qtd_c);
	}

}