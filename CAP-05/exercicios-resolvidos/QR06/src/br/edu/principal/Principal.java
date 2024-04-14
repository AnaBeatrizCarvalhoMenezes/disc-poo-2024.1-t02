package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[]args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int cont, codigo, nht;
		double valor, salMin, salInicial, salFinal, aux;
		String turno, categoria;
		
		System.out.println("Este programa solicita os dados de dez funcionários e calcula seus salarios.");
		salMin = 450;
		for (cont = 1; cont <= 10; cont++) {
			
			System.out.println("\nFuncionario "+ cont + " :");
			System.out.print("Digite o codigo do funcionario: ");
			codigo = sc.nextInt();
			System.out.print("Digite o numero de horas trabalhadas do funcionario: ");
			nht = sc.nextInt();
			System.out.print("Digite o turno do funcionario (M, V, ou N): ");
			turno = sc.next().toUpperCase();	
			while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
				System.out.print("O turno digitado nao e valido. \nDigite o turno do funcionario: ");
				turno = sc.next();
			}
			System.out.print("Digite a categoria do funcionario (G ou O): ");
			categoria = sc.next().toUpperCase();
			while(!categoria.equals("G") && !categoria.equals("O")) {
				System.out.print("A categoria digitada nao e valida. \nDigite a categoria do funcionario: ");
				categoria = sc.next();
			}
			
			if (categoria.equals("G")) {
				if (turno.equals("N"))
					valor = salMin * 0.18;
				else
					valor = salMin * 0.15;
			}
			else {
				if(turno.equals("N"))
					valor = salMin * 0.13;
				else 
					valor = salMin * 0.10;
			}
			
			salInicial = salMin + valor;
			if (salInicial <= 300)
				aux = salInicial * 0.20;
			else if (salInicial < 600)
				aux = salInicial * 0.15;
			else
				aux = salInicial * 0.05;
			salFinal = salInicial + aux;

			System.out.println("\nInformacoes do funcionario " + cont + ":");
			System.out.println("Codigo: " + codigo);
			System.out.println("Numero de horas trabalhadas: " + nht);
			System.out.println("Valor da hora trabalhada: " + valor);
			System.out.println("Valor do salario inicial: " + salInicial);
			System.out.println("Valor do auxilio alimentacao: " + aux);
			System.out.println("Valor do salario final: " + salFinal);
			
		}
		
		System.out.print("Fim de programa.");
		
	}

}