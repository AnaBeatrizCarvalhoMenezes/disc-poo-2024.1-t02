package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pre, imposto, pre_custo, desconto, novo_pre = 0;
		String tipo, refrig;
		
		System.out.println("O produto precisa de refrigeração?(OBS: S - Sim e N - não)");
		refrig = sc.next().toUpperCase();
		
		System.out.println("Qual o tipo do produto? (Digite A - Alimentação; L - Limpeza; Vestuário - V)");
		tipo = sc.next().toUpperCase();
		
		System.out.println("E qual é o preço dele?");
		pre = sc.nextDouble();
		
		double valor_adic = 0;
		if (refrig.equals("N")) {
			if (tipo.equals("A")) {
				valor_adic = (pre < 15) ? 2:5;
			}else if (tipo.equals("L")) {
                valor_adic = (pre < 10) ? 1.50 : 2.50;
            }else if (tipo.equals("V")) {
                valor_adic = (pre < 30) ? 1.50 : 2.50;
            }
        } else if (refrig.equals("S")) {
            valor_adic = (tipo.equals("A")) ? 8 : 0;
		
		}
			
		if (pre < 25) {
			imposto = ((5*0.01) * pre);
		} else {
			imposto = ((8*0.01) * pre);
		}
		System.out.println("Seu valor adicional é de: " + valor_adic);
		
		System.out.println("E seu imposto será de: " + imposto);
		pre_custo = pre + imposto;
		
		System.out.println("Seu preço agora é de: " + pre_custo);
		
		if (!tipo.equals ("A") && !refrig.equals ("S")) {
			desconto = (3*0.01) * pre_custo;
		}else {
			desconto = 0;
		}
		
		System.out.println("Seu desconto é de: " + desconto);
		novo_pre = (pre_custo + valor_adic - desconto);
		
		System.out.println("\n Seu novo preço é: " + novo_pre);
		
		if (novo_pre <= 50) {
			System.out.println("Classificação do preço: BARATO");
		} else {
			System.out.println("Classificação do preço: CARO");
		}
		sc.close();
	}

}