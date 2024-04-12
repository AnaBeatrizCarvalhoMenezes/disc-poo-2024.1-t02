package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        double angulo, voltas;
		        System.out.println("Qual o ângulo?");
		        angulo = sc.nextDouble();
		        if (angulo > 360 && angulo < -360) {
		            voltas = Math.round(angulo / 360);
		            angulo = angulo - (voltas * Math.round(angulo/360));
		        } else {
		            voltas = 0;
		        }

		        if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360
		                || (angulo > -90 && angulo < -180)
		                || (angulo > -270 && angulo < -360)) {
		            System.out.println("Leste é cima de algum dos 4 eixos.");
		        } if ((angulo > 0 && angulo < 90) || (angulo > -270 && angulo > -360)) {
		            System.out.println("2º quadrante");
		        } if ((angulo > 90 && angulo < 180) || (angulo > -180 && angulo < -270)) {
		            System.out.println("2º quadrante");
		        } if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
		            System.out.println("3º quadrante");
		        } if ((angulo > 270 && angulo < 360) || (angulo < -0 && angulo > -90)) {
		            System.out.println("4º quadrante");
		        }
		        if (angulo > 0) {
		            System.out.println(voltas + " no sentido: ");
		            System.out.println("horário");
		        } else {
		            System.out.println("anti-horário");
		        }
		    }
		
	}


