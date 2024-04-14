package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        double precoUnitario, imposto, valorTransporte, seguro, precoFinal, totalImpostos = 0;
		        int paisOrigem;
				String meioTransporte;
		        char cargaPerigosa;
		        
		        while (true) {
		            System.out.println("Informe o preço unitário do produto (ou digite 0 ou um valor negativo para encerrar):");
		            precoUnitario = sc.nextDouble();
		            
		            if (precoUnitario <= 0) {
		                break;
		            }
		            
		            System.out.println("Informe o país de origem (1 — Estados Unidos; 2 — México; 3 — outros):");
		            paisOrigem = sc.nextInt();
		            
		            System.out.println("Informe o meio de transporte (T — terrestre; F — fluvial; A — aéreo):");
		            meioTransporte = sc.next().toUpperCase();
		            
		            System.out.println("A carga é perigosa? (S — sim; N — não):");
		            cargaPerigosa = sc.next().charAt(0);
		            
		            // Calcular imposto
		            if (precoUnitario <= 100) {
		                imposto = precoUnitario * 0.05;
		            } else {
		                imposto = precoUnitario * 0.10;
		            }
		            totalImpostos += imposto;
		            
		            // Calcular valor do transporte
		            switch (cargaPerigosa) {
		                case 'S':
		                    switch (paisOrigem) {
		                        case 1:
		                            valorTransporte = 50.00;
		                            break;
		                        case 2:
		                            valorTransporte = 21.00;
		                            break;
		                        default:
		                            valorTransporte = 24.00;
		                    }
		                    break;
		                default:
		                    switch (paisOrigem) {
		                        case 1:
		                            valorTransporte = 12.00;
		                            break;
		                        case 2:
		                            valorTransporte = 21.00;
		                            break;
		                        default:
		                            valorTransporte = 60.00;
		                    }
		            }
		            
		            // Calcular valor do seguro
		            if (paisOrigem == 2 || meioTransporte.equals("A")) {
		                seguro = precoUnitario / 2;
		            } else {
		                seguro = 0;
		            }
		            
		            // Calcular preço final
		            precoFinal = precoUnitario + imposto + valorTransporte + seguro;
		            
		            // Exibir resultados
		            System.out.println("Valor do imposto: R$" + imposto);
		            System.out.println("Valor do transporte: R$" + valorTransporte);
		            System.out.println("Valor do seguro: R$" + seguro);
		            System.out.println("Preço final: R$" + precoFinal);
		            System.out.println("----------------------------------");
		        }
		        
		        System.out.println("Total dos impostos: R$" + totalImpostos);
		        
		        sc.close();
		    }
		

	}


