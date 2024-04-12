package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cod_est, cod_carga, peso_toneladas, peso_quilos, valor_total = 0;
		System.out.println("Qual é o código do seu estado?");
		cod_est = sc.nextDouble();
		System.out.println("E o peso do produto em Toneladas?");
		peso_toneladas = sc.nextDouble();
		System.out.println("Qual o código de carga do produto?");
		cod_carga = sc.nextDouble();
		peso_quilos = peso_toneladas * 1000;
		System.out.println("Seu peso em quilos é de: " + peso_quilos + "Kg");
		double pre_carga = 0;
		if (cod_carga >= 10 && cod_carga <= 20) {
			pre_carga = 100 * peso_quilos;
		}if (cod_carga >= 21 && cod_carga <= 30) {
			pre_carga = 250 * peso_quilos;
		}if (cod_carga >= 31 && cod_carga <= 40) {
			pre_carga = 340 * peso_quilos;
		} System.out.println("O preço de sua carga é de: " + pre_carga);
		double imposto = 0;
		if (cod_est == 1) {
			imposto = 35/100 * pre_carga;
		}if (cod_est == 2) {
			imposto = 25/100 * pre_carga;
		}if (cod_est == 3) {
			imposto = 15/100 * pre_carga;
		}if (cod_est == 4) {
			imposto = 5/100 * pre_carga;
		}if (cod_est == 5) {
			imposto = 0;
		} System.out.println("Seu imposto foi de: " + imposto);
		valor_total = pre_carga + imposto;
		System.out.println("e o valor total é de: " + valor_total);
		sc.close();
	}

}
