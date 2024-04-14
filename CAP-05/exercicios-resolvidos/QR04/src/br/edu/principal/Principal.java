package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cont, cod, num_vei, num_acid, maior = 0, cid_menor = 0, menor = 0, soma_vei = 0, cid_maior = 0, soma_acid = 0, cont_acid = 0;
        double media_vei, media_acid;
        
        for (cont = 1; cont <= 5; cont++) {
            System.out.println("Informe o código da cidade, são 5 cidades:");
            cod = input.nextInt();
            System.out.println("Informe o número de veículos de passeio:");
            num_vei = input.nextInt();
            System.out.println("Informe o número de acidentes de trânsito com vítimas:");
            num_acid = input.nextInt();
            
            if (cont == 1) {
                maior = num_acid;
                menor = num_acid;
                cid_maior = cod;
                cid_menor = cod;
            } else {
                if (num_acid > maior) {
                    maior = num_acid;
                    cid_maior = cod;
                }
                if (num_acid < menor) {
                    menor = num_acid;
                    cid_menor = cod;
                }
            }
            
            soma_vei += num_vei;
            
            if (num_vei < 2000) {
                soma_acid += num_acid;
                cont_acid++;
            }
        }
        
        media_vei = soma_vei / 5.0;
        System.out.println("Maior índice de acidentes: " + maior + ", pertencente à cidade de código " + cid_maior);
        System.out.println("Menor índice de acidentes: " + menor + ", pertencente à cidade de código " + cid_menor);
        System.out.println("Média de veículos nas cinco cidades: " + media_vei);
        
        if (cont_acid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
        } else {
            media_acid = soma_acid / (double) cont_acid;
            System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos: " + media_acid);
        }
        
        input.close();
    }
}
