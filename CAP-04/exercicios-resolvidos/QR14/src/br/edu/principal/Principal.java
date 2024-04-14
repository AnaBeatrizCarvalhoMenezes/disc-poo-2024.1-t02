package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salario,novoSal, boni, aux;
		System.out.println("Qual o seu salário?");
		salario = sc.nextInt();

		if (salario <= 500) {
			boni = salario * 5/100;
		} else if (salario >= 500&& salario <= 1200) {
			boni = salario * 12/100;
		} else {
			boni = 0;
		}
		if (salario <= 600) {
			aux = 150;
		} else {
			aux = 100;
		}

		novoSal = salario + boni + aux;
		
		System.out.println("O seu novo salário é de: " + novoSal);
		System.out.println("O seu auxílio foi de: " + aux);
		System.out.println("A sua boniticação foi de: " + boni);
	}
}