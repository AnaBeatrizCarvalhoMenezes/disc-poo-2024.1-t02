package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double a, b ,c;
		int I;
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa escreve três números reais e os organiza em diferentes ordens. \nDigite o primeiro número:");
		a = sc.nextDouble();
		System.out.println("Digite o segundo número:");
		b = sc.nextDouble();
		System.out.println("Digite o terceiro número:");
		c = sc.nextDouble();
		System.out.println("Escolha em qual ordem quer organizá-los: \nDigite 1 para Crescente. \nDigite 2 para Decrescente. \nDigite 3 para que o maior número esteja no meio. ");
		I = sc.nextInt();
		switch (I) {	
			case 1:
				if (a<b && a<c) {
					if(b<c) {
						System.out.println("A ordem crescente dos números é: " + a + ", " + b + ", " + c);
					}
						else {
							System.out.println("A ordem crescente dos números é: " + a + ", " + c + ", " + b);
					}
				}
				if (b<a && b<c) {
					if(a<c) {
						System.out.println("A ordem crescente dos números é: " + b + ", " + a + ", " + c);
					}
						else {
							System.out.println("A ordem crescente dos números é: " + b + ", " + c + ", " + a);
						}	
				}
				if (c<a && c<b) {
					if(a<b) {
						System.out.println("A ordem crescente dos números é: " + c + ", " + a + ", " + b);
					}
						else {
							System.out.println("A ordem crescente dos números é: " + c + ", " + b + ", " + a);
						}	
				}
				break;
			case 2:
				if (a>b && a>c) {
					if(b>c) {
						System.out.println("A ordem decrescente dos números é: " + a + ", " + b + ", " + c);
					}
						else {
							System.out.println("A ordem decrescente dos números é: " + a + ", " + c + ", " + b);
						}	
				}
				if (b>a && b>c) {
					if(a>c) {
						System.out.println("A ordem decrescente dos números é: " + b + ", " + a + ", " + c);
					}
						else {
							System.out.println("A ordem decrescente dos némeros é: " + b + ", " + c + ", " + a);
						}	
				}
				if (c>a && c>b) {
					if(a>b) {
						System.out.println("A ordem decrescente dos números é: " + c + ", " + a + ", " + b);
					}
						else {
							System.out.println("A ordem decrescente dos números é: " + c + ", " + b + ", " + a);
						}	
				}
				break;
			case 3:
				if (a>b && a>c) {					
						System.out.println("A ordem desejada dos números é: " + b + ", " + a + ", " + c);
					}
				if (b>a && b>c) {					
					System.out.println("A ordem desejada dos números é: " + a + ", " + b + ", " + c);
				}
				if (c>a && c>b) {					
					System.out.println("A ordem desejada dos números é: " + a + ", " + c + ", " + b);
				}
				break;
				default:
					System.out.println("O número digitado não é válido.");								
		}
		System.out.println("Fim do programa.");
		sc.close();
	}
}
