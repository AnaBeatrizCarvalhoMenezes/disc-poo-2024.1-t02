package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaIn, minIn,horaF,minF,horaD,minD;
		
		System.out.println("Digite o horário inicial");
		System.out.println("Hora: ");
		horaIn = sc.nextInt();
		System.out.println("Minuto: ");
		minIn = sc.nextInt();
		
		System.out.println("Digite o horário final");
		System.out.println("Hora: ");
		horaF = sc.nextInt();
		System.out.println("Minuto: ");
		minF = sc.nextInt();
		
		if(minIn > minF) {
			minF = minF + 60;
			horaF = horaF - 1;
		}
		
		if(horaIn > horaF) {
			horaF = horaF + 24;
		}
		
		minD = minF - minIn;
		horaD = horaF - horaIn;
		
		System.out.println("O jogo durou " + horaD + " hora(s) e " + minD + " minuto(s)");
		
		sc.close();
	}

}