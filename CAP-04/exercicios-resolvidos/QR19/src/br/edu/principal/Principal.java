package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, peso;
        System.out.println("Este programa que receba a altura e o peso de uma pessoa  e classifica-a conforme uma tabela de peso e altura.");
        System.out.println("Digite o valor do peso da pessoa: ");
        peso = sc.nextDouble();
        System.out.println("Digite o valor da altura da pessoa: ");
        altura = sc.nextDouble();
        //altura 1.20
        if  (altura < 1.20) { 
        	if (peso <= 60){
        		System.out.println("Sua classificação é A: Você tem menos de 1,20 de altura e menos de 60kg de peso");
            } else if (peso > 60 && peso <= 90) {
            	System.out.println("Sua classificação é D: Você tem menos de 1,20 de altura e entre 60kg e 90kg de peso");
            } else if (peso > 90) {
            	System.out.println("Sua classificação é G: Você tem menos de 1,20 de altura e mais de 90kg de peso");
            }
        }
        //altura entre 1.20 e 1.70
        if  (altura >= 1.20 && altura <= 1.70) { 
        	if (peso <= 60){
        		System.out.println("Sua classificação é B: Você tem entre 1,20 e 1,70 de altura e menos de 60kg de peso");
            } else if (peso > 60 && peso <= 90) {
            	System.out.println("Sua classificação é E: Você tem entre 1,20 e 1,70 de altura e entre 60kg e 90kg de peso");
            } else if (peso > 90) {
            	System.out.println("Sua classificação é H: Você tem entre 1,20 e 1,70 de altura e mais de 90kg de peso");
            }
        }
        // altura maior que 1.70
        if  (altura > 1.70) { 
        	if (peso <= 60){
        		System.out.println("Sua classificação é C: Você tem mais de 1,70 de altura e menos de 60kg de peso");
            } else if (peso > 60 && peso <= 90) {
            	System.out.println("Sua classificação é F: Você tem mais de 1,70 de altura e entre 60kg e 90kg de peso");
            } else if (peso > 90) {
            	System.out.println("Sua classificação é I: Você tem mais de 1,70 de altura e mais de 90kg de peso");
            }
        }
        
        sc.close();
    }

}