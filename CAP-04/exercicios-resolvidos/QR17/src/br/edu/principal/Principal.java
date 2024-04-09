package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, b=0, c=0, delta = 0, x1, x2;
        System.out.println("Este código resolve e escreve as duas raízes reais de uma equação de segundo grau.");
        System.out.println("Escreva a seguir o primeiro número (a):");
        a = sc.nextDouble();
        
        //os valores b,c
        if (a == 0) {
        	System.out.println("Estes valores não formam uma equação de segundo grau!");
        	delta =(-1);
        } else {
        	System.out.println("Escreva a seguir o segundo número (b):");
            b = sc.nextDouble();
            System.out.println("Escreva a seguir o terceiro número (c):");
            c = sc.nextDouble();
        	delta = (b*b) - ( 4 * a * c);
        } 
        
        // delta e raizes
        if (delta < 0){
        	System.out.println("Não existe raiz real");
        } else if (delta == 0) {
        	System.out.println("Existe uma raiz real");
        	x1 = (-b) / (2 * a);
        	System.out.println("A raiz desta equação é: " + x1);
        } else if (delta > 0) {
        	System.out.println("Existem duas raízes reais");
        	x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        	x2 = ((-b) + Math.sqrt(delta)) / (2 * a);   	
        	System.out.println("As raízes desta equação são: " + x1 + " e " + x2);
        }
        sc.close();
    }
}
