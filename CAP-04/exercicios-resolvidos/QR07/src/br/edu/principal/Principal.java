package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double a, b ,c;
		int I;
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa escreve tr�s n�meros reais e os organiza em diferentes ordens. \nDigite o primeiro n�mero:");
		a = sc.nextDouble();
		System.out.println("Digite o segundo n�mero:");
		b = sc.nextDouble();
		System.out.println("Digite o terceiro n�mero:");
		c = sc.nextDouble();
		System.out.println("Escolha em qual ordem quer organiz�-los: \nDigite 1 para Crescente. \nDigite 2 para Decrescente. \nDigite 3 para que o maior n�mero esteja no meio. ");
		I = sc.nextInt();
		switch (I) {	
			case 1:
				if (a<b && a<c) {
					if(b<c) {
						System.out.println("A ordem crescente dos n�meros �: " + a + ", " + b + ", " + c);
					}
						else {
							System.out.println("A ordem crescente dos n�meros �: " + a + ", " + c + ", " + b);
					}
				}
				if (b<a && b<c) {
					if(a<c) {
						System.out.println("A ordem crescente dos n�meros �: " + b + ", " + a + ", " + c);
					}
						else {
							System.out.println("A ordem crescente dos n�meros �: " + b + ", " + c + ", " + a);
						}	
				}
				if (c<a && c<b) {
					if(a<b) {
						System.out.println("A ordem crescente dos n�meros �: " + c + ", " + a + ", " + b);
					}
						else {
							System.out.println("A ordem crescente dos n�meros �: " + c + ", " + b + ", " + a);
						}	
				}
				break;
			case 2:
				if (a>b && a>c) {
					if(b>c) {
						System.out.println("A ordem decrescente dos n�meros �: " + a + ", " + b + ", " + c);
					}
						else {
							System.out.println("A ordem decrescente dos n�meros �: " + a + ", " + c + ", " + b);
						}	
				}
				if (b>a && b>c) {
					if(a>c) {
						System.out.println("A ordem decrescente dos n�meros �: " + b + ", " + a + ", " + c);
					}
						else {
							System.out.println("A ordem decrescente dos n�meros �: " + b + ", " + c + ", " + a);
						}	
				}
				if (c>a && c>b) {
					if(a>b) {
						System.out.println("A ordem decrescente dos n�meros �: " + c + ", " + a + ", " + b);
					}
						else {
							System.out.println("A ordem decrescente dos n�meros �: " + c + ", " + b + ", " + a);
						}	
				}
				break;
			case 3:
				if (a>b && a>c) {					
						System.out.println("A ordem desejada dos n�meros �: " + b + ", " + a + ", " + c);
					}
				if (b>a && b>c) {					
					System.out.println("A ordem desejada dos n�meros �: " + a + ", " + b + ", " + c);
				}
				if (c>a && c>b) {					
					System.out.println("A ordem desejada dos n�meros �: " + a + ", " + c + ", " + b);
				}
				break;
				default:
					System.out.println("O n�mero digitado n�o � v�lido.");								
		}
		System.out.println("Fim do programa.");
		sc.close();
	}
}
