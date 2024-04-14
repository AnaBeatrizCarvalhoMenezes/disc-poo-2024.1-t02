package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Recebendo o preço do produto
	        System.out.print("Digite o preço do produto: R$ ");
	        double preco = scanner.nextDouble();
	        
	        // Calculando o percentual de aumento de acordo com a tabela 1
	        double percentualAumento;
	        if (preco <= 50.00) {
	            percentualAumento = 0.05;
	        } else if (preco <= 100.00) {
	            percentualAumento = 0.10;
	        } else {
	            percentualAumento = 0.15;
	        }
	        
	        // Calculando o novo preço
	        double novoPreco = preco * (1 + percentualAumento);
	        
	        // Determinando a classificação de acordo com a tabela 2
	        String classificacao;
	        if (novoPreco <= 80.00) {
	            classificacao = "Barato";
	        } else if (novoPreco <= 120.00) {
	            classificacao = "Normal";
	        } else if (novoPreco <= 200.00) {
	            classificacao = "Caro";
	        } else {
	            classificacao = "Muito caro";
	        }
	        
	        // Mostrando o novo preço e a classificação
	        System.out.println("Novo preço: R$ " + novoPreco);
	        System.out.println("Classificação: " + classificacao);
	        
	        scanner.close();
	    }
	}

