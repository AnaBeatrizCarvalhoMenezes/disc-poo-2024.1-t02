package br.edu.funcoes;
import java.util.Scanner;

public class Funcoes {
	
	public static double RecebeCodigo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do produto comprado(1-40): ");	
		return sc.nextInt();
	}
	public static double RecebeQuantidade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a quantidade de produtos comprada?");
		return sc.nextInt();
	}
	public static double CalculaValor(double c) {
		int preco = 0;
		if (c>= 1 && c<=10) {
			preco = 10;
		}
		else if(c>= 11 && c<=20) {
			preco = 15;
		}
		else if(c>= 21 && c<=30) {
			preco = 20;
		}
		else if(c>= 31 && c<=40) {
			preco = 30;
		}
		System.out.println("O preço de seu produto é: R$"+preco+",00");
		return preco;
	}
	public static double CalculaPreco(double p, double q) {
		double precoTotal = p*q;
		System.out.println("O preço total de sua compra é: R$"+precoTotal+",00");
		return precoTotal;
	}
	public static double CalculaDesconto(double v) {
		double desconto = 0;
		if (v<=250) {
			desconto = 5 * Math.pow(10,-2);
			System.out.println("Você obteve um desconto de 5%!");
			}
		else if (v>250 && v<=500) {
			desconto = 10 * Math.pow(10,-2);
			System.out.println("Você obteve um desconto de 10%!");
		}
		else if (v>500) {
			desconto = 15 * Math.pow(10, -2);
			System.out.println("Você obteve um desconto de 15%!");
		}
		return desconto;
	}
	public static double CalculaValorT(double d, double v) {
		double valorT = v - (v*d);
		System.out.println("O valor total de sua compra, após aplicado o desconto, é de R$"+valorT);
		return valorT;
	}

}
