package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m, n, soma, i = 0;
		System.out.println("Digite um número: ");
		m = sc.nextDouble();
		System.out.println("E um segundo número de preferencia maior que o primeiro, por favor.");
		n = sc.nextDouble();
		if (m > n) {
            System.out.println("O primeiro número deve ser menor ou igual ao segundo.");
        } else {
            soma = 0;
            for (i = m; i <= n; i++) {
                soma += i;
            }
            System.out.println("A soma dos números entre " + m + " e " + n + " é: " + soma);
        }
   } 

}
