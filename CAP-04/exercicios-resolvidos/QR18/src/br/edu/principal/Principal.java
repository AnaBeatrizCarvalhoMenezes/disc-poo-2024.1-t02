package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;
        System.out.println("Este programa recebe três valores de tamanhos de linhas retas, calcula e exibe se a união dessas linhas poderá ser um triângulo, e se sim, exibe qual triângulo será");

        System.out.println("Digite o valor da linha x: ");
        x = sc.nextDouble();
        System.out.println("Digite o valor da linha y: ");
        y = sc.nextDouble();
        System.out.println("Digite o valor da linha z: ");
        z = sc.nextDouble();
        
        if  (x < (y + z) && y < (x + z) && z < (x + y)) { 
        	if (x == y && y == z){
        		System.out.println("Este é um triângulo equilátero!");
            } else if (x == y || x == z || y == z) {
            	System.out.println("Este é um triângulo isósceles!");
            } else if (x != y && x != z && y != z) {
            	System.out.println("Este é um triângulo escaleno!");
            }
        }  else {
        	System.out.println("Estas medidas não formam um triângulo!");
        }
        sc.close();
    }

}