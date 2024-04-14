package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int mulheres = 0;
	        int homens = 0;
	        int somaIdadeHomens = 0;
	        int homemAcima45 = 0;
	        int mulherComExperiencia = Integer.MAX_VALUE;

	        while (true) {
	            System.out.print("Digite a idade do candidato (ou 0 para encerrar): ");
	            int idade = sc.nextInt();

	            if (idade == 0) {
	                break;
	            }

	            System.out.print("Digite o sexo do candidato (M ou F): ");
	            char sexo = sc.next().charAt(0);

	            System.out.print("O candidato possui experiência no serviço? (S ou N): ");
	            char experiencia = sc.next().charAt(0);

	            if (sexo == 'M') {
	                homens++;
	                if (experiencia == 'S') {
	                    somaIdadeHomens += idade;
	                    if (idade > 45) {
	                        homemAcima45++;
	                    }
	                }
	            } else if (sexo == 'F' && idade < 21 && experiencia == 'S') {
	                mulheres++;
	                mulherComExperiencia = Math.min(mulherComExperiencia, idade);
	            }
	        }

	        double mediaIdadeHomens = (double) somaIdadeHomens / homens;
	        double percHomemAcima45 = (double) homemAcima45 / homens * 100;

	        System.out.println("Número de candidatos do sexo feminino: " + mulheres);
	        System.out.println("Número de candidatos do sexo masculino: " + homens);
	        System.out.println("Idade média dos homens com experiência: " + mediaIdadeHomens);
	        System.out.println("Porcentagem de homens com mais de 45 anos: " + percHomemAcima45 + "%");
	        System.out.println("Número de mulheres com idade inferior a 21 anos e experiência: " + mulheres);
	        System.out.println("Menor idade entre as mulheres com experiência: " + mulherComExperiencia);
	    }
	}