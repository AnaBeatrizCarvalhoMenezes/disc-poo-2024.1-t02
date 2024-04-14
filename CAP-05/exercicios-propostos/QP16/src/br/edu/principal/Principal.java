package br.edu.principal;
import java.util.Scanner;
public class Principal {

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	        int somaIdades = 0;
	        int contador = 0;
	        int idade;


	        System.out.println("Este programa calcula a média de todas as idades digitadas enquanto elas sejam diferentes de 0!");
	        
	        
	        System.out.println("Digite as idades (ou 0 para sair):");

	        while (true) {
	            System.out.print("Idade: ");
	            idade = scanner.nextInt();

	            if (idade == 0) {
	                break;
	            }

	            somaIdades += idade;
	            contador++;
	        }

	        if (contador == 0) {
	            System.out.println("Nenhuma idade foi digitada.");
	        } else {
	            double media = (double) somaIdades / contador;
	            System.out.println("A média das idades é: " + media);
	        }

	        scanner.close();
	    }
	}