package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cod_prod, peso_quilos, cod_pais, peso_gramas, pre_total=0, imposto=0, valor_total, pre_grama=0;
		System.out.println("A seguir escreva o código do produto, 1 a 4, 5 a 7 e 8 a 10: ");
		cod_prod = sc.nextDouble();
		System.out.println("A seguir escreva peso em quilos do produto: ");
		peso_quilos = sc.nextDouble();
		System.out.println("A seguir escreva o código do país de origem do produto, 1, 2 ou 3: ");
		cod_pais = sc.nextDouble();
		
		peso_gramas = peso_quilos * 1000;
		
		System.out.println("O peso do seu produto em gramas é: " + peso_gramas);
		
		if (cod_prod >= 1 && cod_prod <= 4) {
			pre_grama = 10;
		}
		if (cod_prod >= 5 && cod_prod <= 7) {
			pre_grama = 25;
		}
		if (cod_prod >= 8 && cod_prod <= 10) {
			pre_grama = 35;
		}
		pre_total = peso_gramas * pre_grama;
		System.out.println("O preço total do seu produto é: " + pre_total);
		if (cod_pais == 1) {
			imposto = 0;
		}
		if (cod_pais == 2) {
			imposto = pre_total * 15/100;
		}
		if (cod_pais == 3) {
			imposto = pre_total * 25/100;
			System.out.println("O imposto total sobre o produto é: " + imposto);	
		}
		valor_total = pre_total + imposto;
		System.out.println("O valor total do seu produto é: " + valor_total);
		sc.close();
	}

}
