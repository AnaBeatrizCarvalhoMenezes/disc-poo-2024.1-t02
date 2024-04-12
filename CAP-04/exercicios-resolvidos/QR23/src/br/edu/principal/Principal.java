package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_min, nht, sal_bruto, grat, auxilio, sal_liq = 0;
		String turno, categoria;
				
		System.out.println("Qual é o salário mínimo?");
		sal_min = sc.nextDouble();
		
		System.out.println("E o seu turno?(OBS: M - matutino, V - vespertino, N - noturno)");
		turno = sc.next().toUpperCase();
		
		System.out.println("Sua categoria?(OBS:G - gerente, O - operário)");
		categoria = sc.next().toUpperCase();
		
		System.out.println("E o seu número de horas trabalhadas?");
		nht = sc.nextDouble();
		
		double coeficiente = 0;
		
		if (turno.equals("M")) {
			coeficiente = ((10 * 0.01) * sal_min);
		} if (turno.equals("V")) {
			coeficiente = ((15 * 0.01) * sal_min);
		} if (turno.equals("N")) {
			coeficiente = ((12 * 0.01) * sal_min);
		}
		
		System.out.println("O coeficiente é de: " + coeficiente);
		
		sal_bruto = nht * coeficiente;
		
		System.out.println("E o salário bruto é: " + sal_bruto);
		
		double imposto = 0;
		if (categoria.equals("O")) {
			if (sal_bruto >= 300) {
				imposto = ((5 * 0.01) * sal_bruto);
			} else {
				imposto = ((3 * 0.01) * sal_bruto);
			} if (sal_bruto >= 400) {
				imposto = ((6 * 0.01) * sal_bruto);
			} else {
				imposto = ((4 * 0.01) * sal_bruto);
			}
		}
		
		System.out.println("Seu imposto será de: " + imposto);
		
		if (categoria.equals("N") && nht > 80) {
			grat = 50;
		} else {
			grat = 30;
		} if (grat == 0) {
			System.out.println("E você não tem gratificação.");
		} else {
			System.out.println("E sua gratificação será de: " + grat);
		} if (categoria.equals("N") || coeficiente <= 25) {
			auxilio = ((33 * 0.01) * sal_bruto);
		} else {
			auxilio = ((5 * 0.1) * sal_bruto);
		}
		
		System.out.println("Seu auxílio é de: " + auxilio);
		sal_liq = sal_bruto - imposto + grat + auxilio;
		System.out.println("\n E aqui está seu salário líquido: " + sal_liq);
		if (sal_liq < 350) {
			System.out.println("Você tem como classificação: MAL REMUNERADO");
		} if (sal_liq >= 350 && sal_liq <= 600) {
			System.out.println("Você tem como classificação: NORMALMENTE REMUNERADO");
		} if (sal_liq > 600) {
			System.out.println("Você tem como classificação: BEM REMUNERADO");
		}
		sc.close();
	}

}