package br.edu.principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pre, venda, novopre=0;
        System.out.println("Digite o valor do preço atual: ");
        pre = sc.nextDouble();
        System.out.println(pre);
        System.out.println("Digite o valor da venda média mensal: ");
        venda = sc.nextDouble();
        System.out.println(venda);
        if (venda<500 || pre<30) {
            novopre = pre + (0.1 * pre);
        } else if(venda>=500 && venda<1200 || pre>=30 && pre<80) {
            novopre = pre + (0.15 * pre);
        } else if (venda>=1200 || pre>=80) {
            novopre = pre - (0.2 * pre);
        }

        System.out.println("O novo preço do produto é: " + novopre);

        sc.close();
    }

}