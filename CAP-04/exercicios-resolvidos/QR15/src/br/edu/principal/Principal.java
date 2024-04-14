package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int salMin, valHo, salMes, valDep, valHoEx, imp, grat, salBr, salLiq, numHoTrab, numHoExTrab, numDep, salReceber= 0;
		
		System.out.println("Qual o valor do salário mínimo?");
		salMin= sc.nextInt();
		
		System.out.println("Quantas horas foram trabalhadas?");
		numHoTrab = sc.nextInt();
		
		System.out.println("Qual o número de dependentes do funcionário?");
		numDep = sc.nextInt();
		
		System.out.println("Quantas horas extras foram trabalhadas?");
		numHoExTrab = sc.nextInt();
		
		valHo = salMin * 1/5;
		salMes = valHo * numHoTrab;
		valDep = 32 * numDep;
		valHoEx = numHoExTrab * (valHo + (valHo * 50/100));
		salBr = salMes +  valDep + valHoEx;
		
		if (salBr < 200) {
			imp = 0;
		}
		
		else if (salBr >= 200 && salBr <= 500 ) {
			imp = salBr * 10/100;
		}
		
		else {
			imp = salBr * 20/100;
		}
		
		salLiq = salBr - imp;
		
		if (salLiq <= 350) {
			grat = 100;
		}
		else {
			grat = 50;
		}
		
		salReceber = grat + salLiq;
		System.out.println("O salário a se receber é de: " + salReceber);
		
		sc.close();

	}

}
