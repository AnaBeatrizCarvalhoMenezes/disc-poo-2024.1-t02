package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_base, tempo, imposto, grat, sal_liq = 0;
		System.out.println("Qual é o seu salário base?");
		sal_base = sc.nextDouble();
		System.out.println("E o seu tempo de serviço em anos?");
		tempo = sc.nextDouble();
		if (sal_base < 200) {
			imposto = 0;
		}if (sal_base <= 450) {
			imposto = 3/100 * sal_base;
		}else{
			if (sal_base < 700) {
				imposto = 8/100 * sal_base;	
			} else{
				imposto = 12/100 * sal_base;
			}
		}
		System.out.println("Seu imposto será de: " + imposto);
		if (sal_base > 500) {
			if (tempo <= 3) {
				grat = 20;
			}else {
				grat = 30;
			}
		} else {
			if (tempo <= 3) {
				grat = 23;
			} else {
				if (tempo < 6) {
					grat = 35;
				} else {
					grat = 33;
				}
			}
		}
		System.out.println("Sua gratificação foi de: " + grat);
		sal_liq = sal_base - imposto + grat;
		System.out.println("E seu salário líquido é de: " + sal_liq);
		if (sal_liq <= 350) {
			System.out.println("CLASSIFICAÇÃO A");
		} else {
			if (sal_liq < 600) {
				System.out.println("CLASSIFICAÇÃO B");
			} else {
				System.out.println("CLASSIFICAÇÃO C");
			}
		}
		sc.close();
  }

}
