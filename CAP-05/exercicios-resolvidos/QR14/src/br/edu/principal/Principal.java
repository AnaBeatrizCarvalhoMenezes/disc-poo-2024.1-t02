package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor_inicial, juros, valor_parc, total, valor_juros, num_parc, i;
		
		System.out.println("Digite o valor inicial da dívida: ");
		valor_inicial = sc.nextInt();
		juros = 0;
		num_parc = 1;
		total = valor_inicial;
		valor_parc = valor_inicial;
		
		System.out.println("\n[" +
		        "Total | Juros | Parcelas | Valor Par.]" +
		        "\n["+ total + " | " + juros + " | " + num_parc + " | " + valor_parc +
		        "]");
		
		num_parc = num_parc + 2;
		juros = juros + 10;
		
		for (i = 1; i<=4; i++) {
			valor_juros = valor_inicial * juros / 100;
			total = valor_inicial + valor_juros;
			valor_parc = total / num_parc;
			
			System.out.println("\n[" +
			        "Total | Juros | Parcelas | Valor Par.]" +
			        "\n["+ total + " | " + juros + " | " + num_parc + " | " + valor_parc +
			        "]");
			
			
			juros = juros + 5;
			num_parc = num_parc + 3;
		}
		sc.close();
	}
}



